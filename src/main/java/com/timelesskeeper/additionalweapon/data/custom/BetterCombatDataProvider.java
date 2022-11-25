package com.timelesskeeper.additionalweapon.data.custom;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

public class BetterCombatDataProvider implements DataProvider  {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();
    protected final DataGenerator generator;

    public BetterCombatDataProvider(DataGenerator pGenerator) {
        this.generator = pGenerator;
    }

    protected void buildBetterCombatData(Consumer<FinishedWeaponAttribute> pFinishedWeaponAttributeConsumer) {

    }

    @Override
    public void run(HashCache pCache) throws IOException {
        Path path = this.generator.getOutputFolder();
        Set<ResourceLocation> set = Sets.newHashSet();
        buildBetterCombatData((betterCombatData) -> {
            if (!set.add(betterCombatData.getId())) {
                throw new IllegalStateException("Duplicate data " + betterCombatData.getId());
            } else {
                Path newPath = path.resolve("data/" + betterCombatData.getId().getNamespace() + "/weapon_attributes/" + betterCombatData.getId().getPath() + ".json");
                saveData(pCache, betterCombatData.serialize(), newPath);
            }
        });

    }

    private static void saveData(HashCache pCache, JsonObject pRecipeJson, Path pPath) {
        try {
            String s = GSON.toJson((JsonElement)pRecipeJson);
            String s1 = SHA1.hashUnencodedChars(s).toString();
            if (!Objects.equals(pCache.getHash(pPath), s1) || !Files.exists(pPath)) {
                Files.createDirectories(pPath.getParent());
                BufferedWriter bufferedwriter = Files.newBufferedWriter(pPath);

                try {
                    bufferedwriter.write(s);
                } catch (Throwable throwable1) {
                    if (bufferedwriter != null) {
                        try {
                            bufferedwriter.close();
                        } catch (Throwable throwable) {
                            throwable1.addSuppressed(throwable);
                        }
                    }

                    throw throwable1;
                }

                if (bufferedwriter != null) {
                    bufferedwriter.close();
                }
            }

            pCache.putNew(pPath, s1);
        } catch (IOException ioexception) {
            LOGGER.error("Couldn't save recipe {}", pPath, ioexception);
        }
    }
    @Override
    public String getName() {
        return "Better Combat Data";
    }
}
