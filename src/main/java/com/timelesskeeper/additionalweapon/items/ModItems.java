package com.timelesskeeper.additionalweapon.items;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalWeapon.MOD_ID);

    public static final RegistryObject<Item> WOODEN_POLE = ITEMS.register("wooden_pole", () -> new SwordItem(
            Tiers.WOOD, 1, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Greatsword
    public static final RegistryObject<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword", () -> new SwordItem(
            Tiers.WOOD, 6, -2.6f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () -> new SwordItem(
            Tiers.STONE, 6, -2.6f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new SwordItem(
            Tiers.IRON, 6, -2.6f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword", () -> new SwordItem(
            Tiers.GOLD, 6, -2.6f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () -> new SwordItem(
            Tiers.DIAMOND, 6, -2.6f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () -> new SwordItem(
            Tiers.NETHERITE, 6, -2.6f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Scimitar
    public static final RegistryObject<Item> WOODEN_SCIMITAR = ITEMS.register("wooden_scimitar", () -> new SwordItem(
            Tiers.WOOD, 2, -2.2f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_SCIMITAR = ITEMS.register("stone_scimitar", () -> new SwordItem(
            Tiers.STONE, 2, -2.2f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_SCIMITAR = ITEMS.register("iron_scimitar", () -> new SwordItem(
            Tiers.IRON, 2, -2.2f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_SCIMITAR = ITEMS.register("golden_scimitar", () -> new SwordItem(
            Tiers.GOLD, 2, -2.2f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_SCIMITAR = ITEMS.register("diamond_scimitar", () -> new SwordItem(
            Tiers.DIAMOND, 2, -2.2f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_SCIMITAR = ITEMS.register("netherite_scimitar", () -> new SwordItem(
            Tiers.NETHERITE, 2, -2.2f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Katana
    public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana", () -> new SwordItem(
            Tiers.WOOD, 4, -2.3f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana", () -> new SwordItem(
            Tiers.STONE, 4, -2.3f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new SwordItem(
            Tiers.IRON, 4, -2.3f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana", () -> new SwordItem(
            Tiers.GOLD, 4, -2.3f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana", () -> new SwordItem(
            Tiers.DIAMOND, 4, -2.3f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana", () -> new SwordItem(
            Tiers.NETHERITE, 4, -2.3f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Greataxe
    public static final RegistryObject<Item> WOODEN_GREATAXE = ITEMS.register("wooden_greataxe", () -> new AxeItem(
            Tiers.WOOD, 9.0f, -2.9f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_GREATAXE = ITEMS.register("stone_greataxe", () -> new AxeItem(
            Tiers.STONE, 9.0f, -2.9f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe", () -> new AxeItem(
            Tiers.IRON, 9.0f, -2.9f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_GREATAXE = ITEMS.register("golden_greataxe", () -> new AxeItem(
            Tiers.GOLD, 9.0f, -2.9f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_GREATAXE = ITEMS.register("diamond_greataxe", () -> new AxeItem(
            Tiers.DIAMOND, 9.0f, -2.9f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_GREATAXE = ITEMS.register("netherite_greataxe", () -> new AxeItem(
            Tiers.NETHERITE, 9.0f, -2.9f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Warpike

    // Spear
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear", () -> new SwordItem(
            Tiers.WOOD, 2, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new SwordItem(
            Tiers.STONE, 2, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new SwordItem(
            Tiers.IRON, 2, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear", () -> new SwordItem(
            Tiers.GOLD, 2, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new SwordItem(
            Tiers.DIAMOND, 2, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new SwordItem(
            Tiers.NETHERITE, 2, -2.4f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Halberd
    public static final RegistryObject<Item> WOODEN_HALBERD = ITEMS.register("wooden_halberd", () -> new SwordItem(
            Tiers.WOOD, 4, -2.5f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_HALBERD = ITEMS.register("stone_halberd", () -> new SwordItem(
            Tiers.STONE, 4, -2.5f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd", () -> new SwordItem(
            Tiers.IRON, 4, -2.5f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_HALBERD = ITEMS.register("golden_halberd", () -> new SwordItem(
            Tiers.GOLD, 4, -2.5f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd", () -> new SwordItem(
            Tiers.DIAMOND, 4, -2.5f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd", () -> new SwordItem(
            Tiers.NETHERITE, 4, -2.5f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Glaive
    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () -> new SwordItem(
            Tiers.WOOD, 5, -2.65f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () -> new SwordItem(
            Tiers.STONE, 5, -2.65f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new SwordItem(
            Tiers.IRON, 5, -2.65f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () -> new SwordItem(
            Tiers.GOLD, 5, -2.65f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () -> new SwordItem(
            Tiers.DIAMOND, 5, -2.65f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () -> new SwordItem(
            Tiers.NETHERITE, 5, -2.65f, (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));

    // Mace

    // Hammer

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
