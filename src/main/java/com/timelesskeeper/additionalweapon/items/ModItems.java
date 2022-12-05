package com.timelesskeeper.additionalweapon.items;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.items.newweapons.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalWeapon.MOD_ID);

    public static final RegistryObject<Item> WOODEN_POLE = ITEMS.register("wooden_pole", () -> new SwordItem(
            Tiers.WOOD, 1, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Greatsword
    public static final RegistryObject<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword", () ->
            new GreatswordItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () ->
            new GreatswordItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () ->
            new GreatswordItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword", () ->
            new GreatswordItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () ->
            new GreatswordItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () ->
            new GreatswordItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Scimitar
    public static final RegistryObject<Item> WOODEN_SCIMITAR = ITEMS.register("wooden_scimitar", () ->
            new ScimitarItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_SCIMITAR = ITEMS.register("stone_scimitar", () ->
            new ScimitarItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_SCIMITAR = ITEMS.register("iron_scimitar", () ->
            new ScimitarItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_SCIMITAR = ITEMS.register("golden_scimitar", () ->
            new ScimitarItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_SCIMITAR = ITEMS.register("diamond_scimitar", () ->
            new ScimitarItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_SCIMITAR = ITEMS.register("netherite_scimitar", () ->
            new ScimitarItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Katana
    public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana", () ->
            new KatanaItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana", () ->
            new KatanaItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana", () ->
            new KatanaItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana", () ->
            new KatanaItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana", () ->
            new KatanaItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana", () ->
            new KatanaItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Greataxe
    public static final RegistryObject<Item> WOODEN_GREATAXE = ITEMS.register("wooden_greataxe", () ->
            new GreataxeItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_GREATAXE = ITEMS.register("stone_greataxe", () ->
            new GreataxeItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe", () ->
            new GreataxeItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_GREATAXE = ITEMS.register("golden_greataxe", () ->
            new GreataxeItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_GREATAXE = ITEMS.register("diamond_greataxe", () ->
            new GreataxeItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_GREATAXE = ITEMS.register("netherite_greataxe", () ->
            new GreataxeItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Spear
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear", () ->
            new SpearItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear", () ->
            new SpearItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear", () ->
            new SpearItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear", () ->
            new SpearItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () ->
            new SpearItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () ->
            new SpearItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Halberd
    public static final RegistryObject<Item> WOODEN_HALBERD = ITEMS.register("wooden_halberd", () ->
            new HalberdItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_HALBERD = ITEMS.register("stone_halberd", () ->
            new HalberdItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd", () ->
            new HalberdItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_HALBERD = ITEMS.register("golden_halberd", () ->
            new HalberdItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd", () ->
            new HalberdItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd", () ->
            new HalberdItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Glaive
    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () ->
            new GlaiveItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () ->
            new GlaiveItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () ->
            new GlaiveItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () ->
            new GlaiveItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () ->
            new GlaiveItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () ->
            new GlaiveItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Glaive
    public static final RegistryObject<Item> WOODEN_BATTLESTAFF = ITEMS.register("wooden_battlestaff", () ->
            new BattlestaffItem(Tiers.WOOD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_BATTLESTAFF = ITEMS.register("stone_battlestaff", () ->
            new BattlestaffItem(Tiers.STONE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_BATTLESTAFF = ITEMS.register("iron_battlestaff", () ->
            new BattlestaffItem(Tiers.IRON, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_BATTLESTAFF = ITEMS.register("golden_battlestaff", () ->
            new BattlestaffItem(Tiers.GOLD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_BATTLESTAFF = ITEMS.register("diamond_battlestaff", () ->
            new BattlestaffItem(Tiers.DIAMOND, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_BATTLESTAFF = ITEMS.register("netherite_battlestaff", () ->
            new BattlestaffItem(Tiers.NETHERITE, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Copper - Minecraft
    public static final RegistryObject<Item> COPPER_HELMET = ModItems.ITEMS.register("copper_helmet", () ->
            new ArmorItem(ModArmorTiers.COPPER, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ModItems.ITEMS.register("copper_chestplate", () ->
            new ArmorItem(ModArmorTiers.COPPER, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ModItems.ITEMS.register("copper_leggings", () ->
            new ArmorItem(ModArmorTiers.COPPER, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_BOOTS = ModItems.ITEMS.register("copper_boots", () ->
            new ArmorItem(ModArmorTiers.COPPER, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_SWORD = ModItems.ITEMS.register("copper_sword", () ->
            new SwordItem(ModToolTiers.COPPER, 3, -2.4F,
                    (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ModItems.ITEMS.register("copper_shovel", () ->
            new ShovelItem(ModToolTiers.COPPER, 1.5F, -3.0F,
                    (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ModItems.ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ModToolTiers.COPPER, 1, -2.8F,
                    (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_AXE = ModItems.ITEMS.register("copper_axe", () ->
            new AxeItem(ModToolTiers.COPPER, 6.5F, -3.15F,
                    (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_HOE = ModItems.ITEMS.register("copper_hoe", () ->
            new NewHoeItem(ModToolTiers.COPPER, -1.5F, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_GREATSWORD = ModItems.ITEMS.register("copper_greatsword", () ->
            new GreatswordItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_SCIMITAR = ModItems.ITEMS.register("copper_scimitar", () ->
            new ScimitarItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_KATANA = ModItems.ITEMS.register("copper_katana", () ->
            new KatanaItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_GREATAXE = ModItems.ITEMS.register("copper_greataxe", () ->
            new GreataxeItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_SPEAR = ModItems.ITEMS.register("copper_spear", () ->
            new SpearItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_HALBERD = ModItems.ITEMS.register("copper_halberd", () ->
            new HalberdItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_GLAIVE = ModItems.ITEMS.register("copper_glaive", () ->
            new GlaiveItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> COPPER_BATTLESTAFF = ModItems.ITEMS.register("copper_battlestaff", () ->
            new BattlestaffItem(ModToolTiers.COPPER, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
