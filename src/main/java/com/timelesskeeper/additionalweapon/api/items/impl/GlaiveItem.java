package com.timelesskeeper.additionalweapon.api.items.impl;

import com.timelesskeeper.additionalweapon.api.items.ConfigSwordItem;
import com.timelesskeeper.additionalweapon.api.items.IConfigTier;
import com.timelesskeeper.additionalweapon.config.CommonConfig;

public class GlaiveItem extends ConfigSwordItem {
    public GlaiveItem(IConfigTier pTier, Properties pProperties) {
        super(pTier, 4.5f, -2.60f, pProperties);
    }

    @Override
    public float getAttackDamage() {
        return (float) (super.getAttackDamage() + CommonConfig.WEAPONS.get("glaive").DAMAGE_MOD.get());
    }

    @Override
    public float getAttackSpeed() {
        return (float) (super.getAttackSpeed() + CommonConfig.WEAPONS.get("glaive").SPEED_MOD.get());
    }

    @Override
    public boolean weaponEnable() {
        return CommonConfig.WEAPONS.get("glaive").ENABLER.get();
    }
}
