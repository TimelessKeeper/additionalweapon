package com.timelesskeeper.additionalweapon.items;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.items.newweapons.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalWeapon.MOD_ID);

    // Default item property
    private static final Item.Properties iProp = (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON);

    public static final RegistryObject<Item> WOODEN_POLE = ITEMS.register("wooden_pole", () -> new SwordItem(
            Tiers.WOOD, 1, -2.4f, iProp));

    // Greatsword
    public static final RegistryObject<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword", () -> new GreatswordItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () -> new GreatswordItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new GreatswordItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword", () -> new GreatswordItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () -> new GreatswordItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () ->new GreatswordItem(Tiers.NETHERITE, iProp));

    // Scimitar
    public static final RegistryObject<Item> WOODEN_SCIMITAR = ITEMS.register("wooden_scimitar", () -> new ScimitarItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_SCIMITAR = ITEMS.register("stone_scimitar", () -> new ScimitarItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_SCIMITAR = ITEMS.register("iron_scimitar", () -> new ScimitarItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_SCIMITAR = ITEMS.register("golden_scimitar", () -> new ScimitarItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_SCIMITAR = ITEMS.register("diamond_scimitar", () -> new ScimitarItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_SCIMITAR = ITEMS.register("netherite_scimitar", () ->new ScimitarItem(Tiers.NETHERITE, iProp));

    // Katana
    public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana", () -> new KatanaItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana", () -> new KatanaItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new KatanaItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana", () -> new KatanaItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana", () -> new KatanaItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana", () ->new KatanaItem(Tiers.NETHERITE, iProp));

    // Greataxe
    public static final RegistryObject<Item> WOODEN_GREATAXE = ITEMS.register("wooden_greataxe", () -> new GreataxeItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_GREATAXE = ITEMS.register("stone_greataxe", () -> new GreataxeItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe", () -> new GreataxeItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_GREATAXE = ITEMS.register("golden_greataxe", () -> new GreataxeItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_GREATAXE = ITEMS.register("diamond_greataxe", () -> new GreataxeItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_GREATAXE = ITEMS.register("netherite_greataxe", () ->new GreataxeItem(Tiers.NETHERITE, iProp));

    // Spear
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear", () -> new SpearItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new SpearItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new SpearItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear", () -> new SpearItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new SpearItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () ->new SpearItem(Tiers.NETHERITE, iProp));

    // Halberd
    public static final RegistryObject<Item> WOODEN_HALBERD = ITEMS.register("wooden_halberd", () -> new HalberdItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_HALBERD = ITEMS.register("stone_halberd", () -> new HalberdItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd", () -> new HalberdItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_HALBERD = ITEMS.register("golden_halberd", () -> new HalberdItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd", () -> new HalberdItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd", () ->new HalberdItem(Tiers.NETHERITE, iProp));

    // Glaive
    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () -> new GlaiveItem(Tiers.WOOD, iProp));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () -> new GlaiveItem(Tiers.STONE, iProp));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new GlaiveItem(Tiers.IRON, iProp));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () -> new GlaiveItem(Tiers.GOLD, iProp));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () -> new GlaiveItem(Tiers.DIAMOND, iProp));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () ->new GlaiveItem(Tiers.NETHERITE, iProp));

    // Copper - Minecraft
    public static final RegistryObject<Item> COPPER_GREATSWORD = ModItems.ITEMS.register("copper_greatsword", () -> new GreatswordItem(ModTiers.COPPER, iProp));
    public static final RegistryObject<Item> COPPER_SCIMITAR = ModItems.ITEMS.register("copper_scimitar", () -> new ScimitarItem(ModTiers.COPPER, iProp));
    public static final RegistryObject<Item> COPPER_KATANA = ModItems.ITEMS.register("copper_katana", () -> new KatanaItem(ModTiers.COPPER, iProp));
    public static final RegistryObject<Item> COPPER_GREATAXE = ModItems.ITEMS.register("copper_greataxe", () -> new GreataxeItem(ModTiers.COPPER, iProp));
    public static final RegistryObject<Item> COPPER_SPEAR = ModItems.ITEMS.register("copper_spear", () -> new SpearItem(ModTiers.COPPER, iProp));
    public static final RegistryObject<Item> COPPER_HALBERD = ModItems.ITEMS.register("copper_halberd", () -> new HalberdItem(ModTiers.COPPER, iProp));
    public static final RegistryObject<Item> COPPER_GLAIVE = ModItems.ITEMS.register("copper_glaive", () -> new GlaiveItem(ModTiers.COPPER, iProp));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
