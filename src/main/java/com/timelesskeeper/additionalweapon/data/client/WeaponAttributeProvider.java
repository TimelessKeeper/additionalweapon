package com.timelesskeeper.additionalweapon.data.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.timelesskeeper.additionalweapon.data.client.bettercombat.WeaponAttackBuilder;
import com.timelesskeeper.additionalweapon.data.client.bettercombat.WeaponAttributeBuilder;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class WeaponAttributeProvider implements DataProvider {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();
    private final DataGenerator generator;

    public WeaponAttributeProvider(DataGenerator generator) {
        this.generator = generator;
    }

    protected Collection<WeaponAttributeBuilder> getWeaponAttribute() {
        Collection<WeaponAttributeBuilder> ret = new ArrayList<>();

        // greatsword
        ret.add(greatsword(ModItems.DIAMOND_GREATSWORD));
        ret.add(greatsword(ModItems.GOLDEN_GREATSWORD));
        ret.add(greatsword(ModItems.IRON_GREATSWORD));
        ret.add(greatsword(ModItems.NETHERITE_GREATSWORD));
        ret.add(greatsword(ModItems.STONE_GREATSWORD));
        ret.add(greatsword(ModItems.WOODEN_GREATSWORD));

        // greataxe
        ret.add(greataxe(ModItems.DIAMOND_GREATAXE));
        ret.add(greataxe(ModItems.GOLDEN_GREATAXE));
        ret.add(greataxe(ModItems.IRON_GREATAXE));
        ret.add(greataxe(ModItems.NETHERITE_GREATAXE));
        ret.add(greataxe(ModItems.STONE_GREATAXE));
        ret.add(greataxe(ModItems.WOODEN_GREATAXE));

        // scimitar
        ret.add(scimitar(ModItems.DIAMOND_SCIMITAR));
        ret.add(scimitar(ModItems.GOLDEN_SCIMITAR));
        ret.add(scimitar(ModItems.IRON_SCIMITAR));
        ret.add(scimitar(ModItems.NETHERITE_SCIMITAR));
        ret.add(scimitar(ModItems.STONE_SCIMITAR));
        ret.add(scimitar(ModItems.WOODEN_SCIMITAR));

        // katana
        ret.add(katana(ModItems.DIAMOND_KATANA));
        ret.add(katana(ModItems.GOLDEN_KATANA));
        ret.add(katana(ModItems.IRON_KATANA));
        ret.add(katana(ModItems.NETHERITE_KATANA));
        ret.add(katana(ModItems.STONE_KATANA));
        ret.add(katana(ModItems.WOODEN_KATANA));

        // spear
        ret.add(spear(ModItems.DIAMOND_SPEAR));
        ret.add(spear(ModItems.GOLDEN_SPEAR));
        ret.add(spear(ModItems.IRON_SPEAR));
        ret.add(spear(ModItems.NETHERITE_SPEAR));
        ret.add(spear(ModItems.STONE_SPEAR));
        ret.add(spear(ModItems.WOODEN_SPEAR));

        // halberd
        ret.add(halberd(ModItems.DIAMOND_HALBERD));
        ret.add(halberd(ModItems.GOLDEN_HALBERD));
        ret.add(halberd(ModItems.IRON_HALBERD));
        ret.add(halberd(ModItems.NETHERITE_HALBERD));
        ret.add(halberd(ModItems.STONE_HALBERD));
        ret.add(halberd(ModItems.WOODEN_HALBERD));

        // glaive
        ret.add(glaive(ModItems.DIAMOND_GLAIVE));
        ret.add(glaive(ModItems.GOLDEN_GLAIVE));
        ret.add(glaive(ModItems.IRON_GLAIVE));
        ret.add(glaive(ModItems.NETHERITE_GLAIVE));
        ret.add(glaive(ModItems.STONE_GLAIVE));
        ret.add(glaive(ModItems.WOODEN_GLAIVE));

        return ret;
    }

    private WeaponAttributeBuilder greatsword(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:claymore");
    }

    private WeaponAttributeBuilder greataxe(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:heavy_axe");
    }

    private WeaponAttributeBuilder scimitar(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:cutlass");
    }

    private WeaponAttributeBuilder katana(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:katana");
    }

    private WeaponAttributeBuilder spear(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:spear")
                .two_handed(false)
                .attack(new WeaponAttackBuilder().animation("bettercombat:one_handed_stab"));
    }

    private WeaponAttributeBuilder halberd(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:halberd");
    }

    private WeaponAttributeBuilder glaive(RegistryObject<Item> item)
    {
        return new WeaponAttributeBuilder(item.getId()).parent("bettercombat:glaive");
    }

    @Override
    public void run(HashCache cache) throws IOException {
        Path outputFolder = this.generator.getOutputFolder();

        for (WeaponAttributeBuilder builder : getWeaponAttribute()) {
            try {
                String jsonStr = GSON.toJson(builder.serialize());
                String hashStr = SHA1.hashUnencodedChars(jsonStr).toString();
                Path path = outputFolder.resolve(String.format("data/%s/weapon_attributes/%s.json", builder.id.getNamespace(), builder.id.getPath()));
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
        }
    }

    @Override
    public String getName() {
        return "Additional Weapon: Better Combat - Weapon Attribute";
    }
}
