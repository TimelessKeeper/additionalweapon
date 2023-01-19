package com.timelesskeeper.additionalweapon.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ArmorConfig {
    public final ForgeConfigSpec.IntValue HELMET_DURA_MOD;
    public final ForgeConfigSpec.IntValue CHESTPLATE_DURA_MOD;
    public final ForgeConfigSpec.IntValue LEGGINGS_DURA_MOD;
    public final ForgeConfigSpec.IntValue BOOTS_DURA_MOD;
    public final ForgeConfigSpec.IntValue HELMET_PROT_MOD;
    public final ForgeConfigSpec.IntValue CHESTPLATE_PROT_MOD;
    public final ForgeConfigSpec.IntValue LEGGINGS_PROT_MOD;
    public final ForgeConfigSpec.IntValue BOOTS_PROT_MOD;
    public final ForgeConfigSpec.IntValue ENCHANT_MOD;
    public final ForgeConfigSpec.DoubleValue TOUGHNESS_MOD;
    public final ForgeConfigSpec.DoubleValue KNOCKBACK_RES_MOD;

    public ArmorConfig(ForgeConfigSpec.Builder BUILDER, String materialName) {
        BUILDER.push(materialName + "_armor_settings");

        HELMET_DURA_MOD = BUILDER.comment("Set the helmet durability modifier of the tool with the " + materialName)
                .defineInRange("helmet_durability", 0, -10000, 10000);
        CHESTPLATE_DURA_MOD = BUILDER.comment("Set the chestplate durability modifier of the tool with the " + materialName)
                .defineInRange("chestplate_durability", 0, -10000, 10000);
        LEGGINGS_DURA_MOD = BUILDER.comment("Set the leggings durability modifier of the tool with the " + materialName)
                .defineInRange("leggings_durability", 0, -10000, 10000);
        BOOTS_DURA_MOD = BUILDER.comment("Set the boots durability modifier of the tool with the " + materialName)
                .defineInRange("boots_durability", 0, -10000, 10000);

        HELMET_PROT_MOD = BUILDER.comment("Set the helmet protection modifier of the tool with the " + materialName)
                .defineInRange("helmet_protection", 0, -10000, 10000);
        CHESTPLATE_PROT_MOD = BUILDER.comment("Set the chestplate protection modifier of the tool with the " + materialName)
                .defineInRange("chestplate_protection", 0, -10000, 10000);
        LEGGINGS_PROT_MOD = BUILDER.comment("Set the leggings protection modifier of the tool with the " + materialName)
                .defineInRange("leggings_protection", 0, -10000, 10000);
        BOOTS_PROT_MOD = BUILDER.comment("Set the boots protection modifier of the tool with the " + materialName)
                .defineInRange("boots_protection", 0, -10000, 10000);

        ENCHANT_MOD = BUILDER.comment("Set the enchantment modifier of the tool with the " + materialName)
                .defineInRange("enchantment", 0, -10000, 10000);
        TOUGHNESS_MOD = BUILDER.comment("Set the toughness modifier of the tool with the " + materialName)
                .defineInRange("toughness", 0.0d, -10000.0d, 10000.0d);
        KNOCKBACK_RES_MOD = BUILDER.comment("Set the knockback resistance modifier of the tool with the " + materialName)
                .defineInRange("knockback_res", 0.0d, -10000.0d, 10000.0d);

        BUILDER.pop();
    }
}
