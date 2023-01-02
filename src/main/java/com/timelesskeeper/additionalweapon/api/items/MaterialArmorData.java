package com.timelesskeeper.additionalweapon.api.items;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class MaterialArmorData {
    private String name;
    private Tier tooTier;
    private ArmorMaterial armorTier;

    public MaterialArmorData(String pName, Tier pTooTier, ArmorMaterial pArmorTier) {
        name = pName;
        tooTier = pTooTier;
        armorTier = pArmorTier;
    }

    public String getName() { return this.name; }

    public Tier getToolTier() { return this.tooTier; }

    public ArmorMaterial getArmorTier() { return this.armorTier; }
}
