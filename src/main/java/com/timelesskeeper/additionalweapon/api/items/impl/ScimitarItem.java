package com.timelesskeeper.additionalweapon.api.items.impl;

import com.timelesskeeper.additionalweapon.api.items.ConfigSwordItem;
import com.timelesskeeper.additionalweapon.api.items.IConfigTier;
import com.timelesskeeper.additionalweapon.config.CommonConfig;

public class ScimitarItem extends ConfigSwordItem {
    public ScimitarItem(IConfigTier pTier, Properties pProperties) {
        super(pTier, 2.5F, -2.25f, pProperties);
    }

    @Override
    public float getAttackDamage() {
        return (float) (super.getAttackDamage() + CommonConfig.WEAPONS.get("scimitar").DAMAGE_MOD.get());
    }

    @Override
    public float getAttackSpeed() {
        return (float) (super.getAttackSpeed() + CommonConfig.WEAPONS.get("scimitar").SPEED_MOD.get());
    }

    @Override
    public boolean weaponEnable() {
        return CommonConfig.WEAPONS.get("scimitar").ENABLER.get();
    }
}
