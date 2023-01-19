package com.timelesskeeper.additionalweapon.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class WeaponConfig {
    public final ForgeConfigSpec.BooleanValue ENABLER;
    public final ForgeConfigSpec.DoubleValue DAMAGE_MOD;
    public final ForgeConfigSpec.DoubleValue SPEED_MOD;

    public WeaponConfig(ForgeConfigSpec.Builder BUILDER, String weaponName) {
        BUILDER.push(weaponName + "_settings");

        ENABLER = BUILDER.comment("Enable the crafting of tool made of " + weaponName)
                .define("Enable", true);
        DAMAGE_MOD = BUILDER.comment("Set the attack damage modifier of the " + weaponName)
                .defineInRange("Damage modifier", 0.0d, -10000.0d, 10000.0d);
        SPEED_MOD = BUILDER.comment("Set the attack speed modifier of the " + weaponName)
                .defineInRange("Attack speed modifier", 0.0d, -10000.0d, 10000.0d);

        BUILDER.pop();
    }
}
