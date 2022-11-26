package com.timelesskeeper.additionalweapon.data.custom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Consumer;

public class BetterCombatDataProvider implements DataProvider {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();
    private final DataGenerator generator;

    public BetterCombatDataProvider(DataGenerator generator) {
        this.generator = generator;
    }

    protected void buildBetterCombatData(Consumer<FinishedWeaponAttribute> pFinishedWeaponAttributeConsumer) {

    }

    @Override
    public void run(HashCache cache) throws IOException {
        Path outputFolder = this.generator.getOutputFolder();

        buildBetterCombatData((builder) -> {
            try {
                String jsonStr = GSON.toJson(builder.serialize());
                String hashStr = SHA1.hashUnencodedChars(jsonStr).toString();
                Path path = outputFolder.resolve(builder.getPath());
                if (!Objects.equals(cache.getHash(outputFolder), hashStr) || !Files.exists(path)) {
                    Files.createDirectories(path.getParent());

                    try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                        writer.write(jsonStr);
                    }
                }

                cache.putNew(path, hashStr);
            } catch (IOException ex) {
                LOGGER.error("Could not save weapon attributes to {}", outputFolder, ex);
            }
        });
    }

    @Override
    public String getName() {
        return "Additional Weapon: Better Combat - Weapon Attribute";
    }
}
