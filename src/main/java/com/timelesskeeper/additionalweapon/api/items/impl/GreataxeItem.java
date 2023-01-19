package com.timelesskeeper.additionalweapon.api.items.impl;

import com.timelesskeeper.additionalweapon.api.items.ConfigSwordItem;
import com.timelesskeeper.additionalweapon.api.items.IConfigTier;
import com.timelesskeeper.additionalweapon.config.CommonConfig;

public class GreataxeItem extends ConfigSwordItem {
    public GreataxeItem(IConfigTier pTier, Properties pProperties) {
        super(pTier, 8, -2.8f,  pProperties);
    }

    @Override
    public float getAttackDamage() {
        return (float) (super.getAttackDamage() + CommonConfig.WEAPONS.get("greataxe").DAMAGE_MOD.get());
    }

    @Override
    public float getAttackSpeed() {
        return (float) (super.getAttackSpeed() + CommonConfig.WEAPONS.get("greataxe").SPEED_MOD.get());
    }

    @Override
    public boolean weaponEnable() {
        return CommonConfig.WEAPONS.get("greataxe").ENABLER.get();
    }
}
