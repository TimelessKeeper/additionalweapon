package com.timelesskeeper.additionalweapon.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MaterialConfig {
    public final ForgeConfigSpec.BooleanValue ENABLER;
    public final ToolConfig TOOL;
    public final ArmorConfig ARMOR;

    public MaterialConfig(ForgeConfigSpec.Builder BUILDER, String materialName) {
        BUILDER.push(materialName + "_settings");

        ENABLER = BUILDER.comment("Enable the crafting of tool made of " + materialName)
                .define("enable_crafting", true);

        TOOL = new ToolConfig(BUILDER, materialName);
        ARMOR = new ArmorConfig(BUILDER, materialName);

        BUILDER.pop();
    }
}
