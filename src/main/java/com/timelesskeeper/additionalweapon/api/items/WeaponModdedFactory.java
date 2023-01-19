package com.timelesskeeper.additionalweapon.api.items;

import com.timelesskeeper.additionalweapon.api.items.impl.ConfigAxeItem;
import com.timelesskeeper.additionalweapon.api.items.impl.ConfigHoeItem;
import com.timelesskeeper.additionalweapon.api.items.impl.ConfigPickaxeItem;
import com.timelesskeeper.additionalweapon.api.items.impl.ConfigShovelItem;
import com.timelesskeeper.additionalweapon.items.CreativeTab;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class WeaponModdedFactory extends WeaponFactory {
    public RegistryObject<Item> HELMETS;
    public RegistryObject<Item> CHESTPLATES;
    public RegistryObject<Item> LEGGINGS;
    public RegistryObject<Item> BOOTS;

    public RegistryObject<Item> SWORDS;
    public RegistryObject<Item> SHOVELS;
    public RegistryObject<Item> PICKAXES;
    public RegistryObject<Item> AXES;
    public RegistryObject<Item> HOES;

    public WeaponModdedFactory(IConfigTier toolTier, IConfigArmorMaterial armorTier) {
        super(toolTier);

        HELMETS = ModItems.ITEMS.register(toolTier.getName() + "_helmet", () -> new ConfigArmorItem(armorTier,
                EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        CHESTPLATES = ModItems.ITEMS.register(toolTier.getName() + "_chestplate", () -> new ConfigArmorItem(armorTier,
                EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        LEGGINGS = ModItems.ITEMS.register(toolTier.getName() + "_leggings", () -> new ConfigArmorItem(armorTier,
                EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        BOOTS = ModItems.ITEMS.register(toolTier.getName() + "_boots", () -> new ConfigArmorItem(armorTier,
                EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));


        SWORDS = ModItems.ITEMS.register(toolTier.getName() + "_sword", () -> new ConfigSwordItem(toolTier,
                3.0F, -2.4F, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        SHOVELS = ModItems.ITEMS.register(toolTier.getName() + "_shovel", () -> new ConfigShovelItem(toolTier,
                (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        PICKAXES = ModItems.ITEMS.register(toolTier.getName() + "_pickaxe", () -> new ConfigPickaxeItem(toolTier,
                (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        AXES = ModItems.ITEMS.register(toolTier.getName() + "_axe", () -> new ConfigAxeItem(toolTier,
                (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));

        HOES = ModItems.ITEMS.register(toolTier.getName() + "_hoe", () -> new ConfigHoeItem(toolTier,
                (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA)));
    }
}
