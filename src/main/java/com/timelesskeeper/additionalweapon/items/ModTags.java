package com.timelesskeeper.additionalweapon.items;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static final TagKey<Item> INGOTS_STEEL = tag("ingots/steel");
    public static final TagKey<Item> INGOTS_BRONZE = tag("ingots/bronze");
    public static final TagKey<Item> INGOTS_BRASS = tag("ingots/brass");
    public static final TagKey<Item> INGOTS_TIN = tag("ingots/tin");
    public static final TagKey<Item> INGOTS_ZINC = tag("ingots/zinc");
    public static final TagKey<Item> INGOTS_ROSEGOLD = tag("ingots/rosegold");

    private static TagKey<Item> tag(String name)
    {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("forge", name));
    }
}
