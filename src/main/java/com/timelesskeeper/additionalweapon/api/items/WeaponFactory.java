package com.timelesskeeper.additionalweapon.api.items;

import com.timelesskeeper.additionalweapon.api.items.impl.*;
import com.timelesskeeper.additionalweapon.items.CreativeTab;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class WeaponFactory {
    public RegistryObject<Item> BATTLESTAFFS;
    public RegistryObject<Item> GLAIVES;
    public RegistryObject<Item> GREATAXES;
    public RegistryObject<Item> GREATSWORDS;
    public RegistryObject<Item> HALBERDS;
    public RegistryObject<Item> KATANAS;
    public RegistryObject<Item> SCIMITARS;
    public RegistryObject<Item> SPEARS;

    public WeaponFactory(IConfigTier tier) {
        BATTLESTAFFS = ModItems.ITEMS.register(tier.getName() + "_battlestaff", () ->
                new BattlestaffItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        GLAIVES = ModItems.ITEMS.register(tier.getName() + "_glaive", () ->
                new GlaiveItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        GREATAXES = ModItems.ITEMS.register(tier.getName() + "_greataxe", () ->
                new GreataxeItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        GREATSWORDS = ModItems.ITEMS.register(tier.getName() + "_greatsword", () ->
                new GreatswordItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        HALBERDS = ModItems.ITEMS.register(tier.getName() + "_halberd", () ->
                new HalberdItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        KATANAS = ModItems.ITEMS.register(tier.getName() + "_katana", () ->
                new KatanaItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        SCIMITARS = ModItems.ITEMS.register(tier.getName() + "_scimitar", () ->
                new ScimitarItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

        SPEARS = ModItems.ITEMS.register(tier.getName() + "_spear", () ->
                new SpearItem(tier, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    }
}
