package com.timelesskeeper.additionalweapon.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ToolConfig {
    public final ForgeConfigSpec.DoubleValue DAMAGE_MOD;
    public final ForgeConfigSpec.IntValue LEVEL_MOD;
    public final ForgeConfigSpec.IntValue USE_MOD;
    public final ForgeConfigSpec.DoubleValue BLOCK_SPEED_MOD;
    public final ForgeConfigSpec.IntValue ENCHANT_MOD;

    public ToolConfig(ForgeConfigSpec.Builder BUILDER, String materialName) {
        BUILDER.push(materialName + "_tool_settings");

        DAMAGE_MOD = BUILDER.comment("Set the damage modifier of the tool with the " + materialName)
                .defineInRange("damage", 0.0d, -10000.0d, 10000.0d);
        LEVEL_MOD = BUILDER.comment("Set the tool level modifier of the tool with the " + materialName)
                .defineInRange("tool_level", 0, -10000, 10000);
        USE_MOD = BUILDER.comment("Set the number of use of the tool with the " + materialName)
                .defineInRange("number_of_use", 0, -10000, 10000);
        BLOCK_SPEED_MOD = BUILDER.comment("Set the block breaking speed modifier of the tool with the " + materialName)
                .defineInRange("block_speed", 0.0d, -10000.0d, 10000.0d);
        ENCHANT_MOD = BUILDER.comment("Set the enchantment modifier of the tool with the " + materialName)
                .defineInRange("enchantment", 0, -10000, 10000);

        BUILDER.pop();
    }
}