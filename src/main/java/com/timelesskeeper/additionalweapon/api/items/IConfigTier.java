package com.timelesskeeper.additionalweapon.api.items;

import net.minecraft.world.item.Tier;

public interface IConfigTier extends Tier {
    String getName();
    boolean getEnable();
}
