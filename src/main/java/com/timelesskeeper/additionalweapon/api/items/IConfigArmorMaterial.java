package com.timelesskeeper.additionalweapon.api.items;

import net.minecraft.world.item.ArmorMaterial;

public interface IConfigArmorMaterial extends ArmorMaterial {
    String getMaterial();
    int getDurabilityMultiplier();
    int[] getSlotProtections();
    boolean getEnable();
}
