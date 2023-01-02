package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.api.data.lang.FinishedLang;
import com.timelesskeeper.additionalweapon.api.data.lang.LangBuilder;
import com.timelesskeeper.additionalweapon.api.data.lang.LangDataProvider;
import com.timelesskeeper.additionalweapon.api.items.MaterialData;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ModLangProvider extends LangDataProvider {
    public ModLangProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildLangData(Consumer<FinishedLang> pFinishedLangConsumer) {
        Map<String, String> descriptions = new HashMap<>();
        for (MaterialData data : ModItems.moddedMaterials) {
            if (data.getName() != "iron") {
                descriptions.put("item.additionalweapon." + data.getName() + "_greatsword", data.getDescription() + " Greatsword");
                descriptions.put("item.additionalweapon." + data.getName() + "_scimitar", data.getDescription() + " Scimitar");
                descriptions.put("item.additionalweapon." + data.getName() + "_katana", data.getDescription() + " Katana");
                descriptions.put("item.additionalweapon." + data.getName() + "_greataxe", data.getDescription() + " Greataxe");
                descriptions.put("item.additionalweapon." + data.getName() + "_spear", data.getDescription() + " Spear");
                descriptions.put("item.additionalweapon." + data.getName() + "_halberd", data.getDescription() + " Halberd");
                descriptions.put("item.additionalweapon." + data.getName() + "_glaive", data.getDescription() + " Glaive");
                descriptions.put("item.additionalweapon." + data.getName() + "_battlestaff", data.getDescription() + " Battlestaff");

                if (ModItems.vanillaMaterials.containsKey(data.getName())) {
                    descriptions.put("item.additionalweapon." + data.getName() + "_helmet", data.getDescription() + " Helmet");
                    descriptions.put("item.additionalweapon." + data.getName() + "_chestplate", data.getDescription() + " Chestplate");
                    descriptions.put("item.additionalweapon." + data.getName() + "_leggings", data.getDescription() + " Leggings");
                    descriptions.put("item.additionalweapon." + data.getName() + "_boots", data.getDescription() + " Boots");

                    descriptions.put("item.additionalweapon." + data.getName() + "_sword", data.getDescription() + " Sword");
                    descriptions.put("item.additionalweapon." + data.getName() + "_shovel", data.getDescription() + " Shovel");
                    descriptions.put("item.additionalweapon." + data.getName() + "_pickaxe", data.getDescription() + " Pickaxe");
                    descriptions.put("item.additionalweapon." + data.getName() + "_axe", data.getDescription() + " Axe");
                    descriptions.put("item.additionalweapon." + data.getName() + "_hoe", data.getDescription() + " Hoe");
                }
            }
        }

        new LangBuilder()
                .description("itemGroup.additionalweapons", "Additional Weapons")
                .description("itemGroup.additionalweapons_vanilla", "Additional Weapons - Vanilla")
                .description("item.additionalweapon.wooden_pole", "Wooden Pole")
                .descriptions(descriptions)
                .save(pFinishedLangConsumer, new ResourceLocation(AdditionalWeapon.MOD_ID + ":en_us"));
    }
}
