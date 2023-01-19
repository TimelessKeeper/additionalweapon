package com.timelesskeeper.additionalweapon.api.items.impl;

import com.timelesskeeper.additionalweapon.api.items.ConfigSwordItem;
import com.timelesskeeper.additionalweapon.api.items.IConfigTier;
import com.timelesskeeper.additionalweapon.config.CommonConfig;

public class BattlestaffItem extends ConfigSwordItem {
    public BattlestaffItem(IConfigTier pTier, Properties pProperties) {
        super(pTier, 3, -2.25f,  pProperties);
    }

    @Override
    public float getAttackDamage() {
        return (float) (super.getAttackDamage() + CommonConfig.WEAPONS.get("battlestaff").DAMAGE_MOD.get());
    }

    @Override
    public float getAttackSpeed() {
        return (float) (super.getAttackSpeed() + CommonConfig.WEAPONS.get("battlestaff").SPEED_MOD.get());
    }

    @Override
    public boolean weaponEnable() {
        return CommonConfig.WEAPONS.get("battlestaff").ENABLER.get();
    }
}
