package com.timelesskeeper.additionalweapon.api.items;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class MaterialData {
    private String name;
    private String description;
    private Tier tier;
    private TagKey<Item> bladeItem;

    public MaterialData(String pName, String pDescription, Tier pTier, TagKey<Item> pBladeItem) {
        name = pName;
        description = pDescription;
        tier = pTier;
        bladeItem = pBladeItem;
    }

    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public Tier getTier() { return this.tier; }
    public TagKey<Item> getBladeItem() { return this.bladeItem; }
}
