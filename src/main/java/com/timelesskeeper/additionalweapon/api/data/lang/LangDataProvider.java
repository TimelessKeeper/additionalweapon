package com.timelesskeeper.additionalweapon.api.data.lang;

import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;
import java.util.function.Consumer;

public class LangDataProvider implements DataProvider {
    private static final Logger LOGGER = LogUtils.getLogger();
    protected final DataGenerator.PathProvider pathProvider;

    public LangDataProvider(DataGenerator pGenerator) {
        this.pathProvider = pGenerator.createPathProvider(DataGenerator.Target.RESOURCE_PACK, "lang");
    }

    protected void buildLangData(Consumer<FinishedLang> pFinishedLangConsumer) {

    }

    @Override
    public void run(CachedOutput pOutput) throws IOException {
        Set<ResourceLocation> set = Sets.newHashSet();
        buildLangData((betterCombatData) -> {
            if (!set.add(betterCombatData.getId())) {
                throw new IllegalStateException("Duplicate data " + betterCombatData.getId());
            } else {
                saveData(pOutput, betterCombatData.serialize(), this.pathProvider.json(betterCombatData.getId()));
            }
        });
    }

    private static void saveData(CachedOutput pOutput, JsonObject pRecipeJson, Path pPath) {
        try {
            DataProvider.saveStable(pOutput, pRecipeJson, pPath);
        } catch (IOException ioexception) {
            LOGGER.error("Couldn't save recipe {}", pPath, ioexception);
        }
    }

    @Override
    public String getName() {
        return "US English Language Generator";
    }
}
