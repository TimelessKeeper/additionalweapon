package com.timelesskeeper.additionalweapon.api.items.impl;

import com.timelesskeeper.additionalweapon.api.items.ConfigSwordItem;
import com.timelesskeeper.additionalweapon.api.items.IConfigTier;
import com.timelesskeeper.additionalweapon.config.CommonConfig;

public class HalberdItem extends ConfigSwordItem {
    public HalberdItem(IConfigTier pTier, Properties pProperties) {
        super(pTier, 4, -2.65f, pProperties);
    }

    @Override
    public float getAttackDamage() {
        return (float) (super.getAttackDamage() + CommonConfig.WEAPONS.get("halberd").DAMAGE_MOD.get());
    }

    @Override
    public float getAttackSpeed() {
        return (float) (super.getAttackSpeed() + CommonConfig.WEAPONS.get("halberd").SPEED_MOD.get());
    }

    @Override
    public boolean weaponEnable() {
        return CommonConfig.WEAPONS.get("halberd").ENABLER.get();
    }
}
