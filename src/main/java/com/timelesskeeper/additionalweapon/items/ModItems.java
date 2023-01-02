package com.timelesskeeper.additionalweapon.items;

import com.google.common.collect.ImmutableMap;
import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.api.items.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Tuple;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalWeapon.MOD_ID);

    //<editor-fold desc="Materials Data">
    public static MaterialData[] moddedMaterials = new MaterialData[] {
            new MaterialData("wooden", "Wooden", Tiers.WOOD, ItemTags.PLANKS),
            new MaterialData("stone", "Stone", Tiers.STONE, ItemTags.STONE_TOOL_MATERIALS),
            new MaterialData("iron", "Iron", Tiers.IRON, Tags.Items.INGOTS_IRON),
            new MaterialData("golden", "Golden", Tiers.GOLD, Tags.Items.INGOTS_GOLD),
            new MaterialData("diamond", "Diamond", Tiers.DIAMOND, Tags.Items.GEMS_DIAMOND),
            new MaterialData("netherite", "Netherite", Tiers.NETHERITE, Tags.Items.INGOTS_NETHERITE),
            new MaterialData("tin", "Tin", ModToolTiers.TIN, ModTags.INGOTS_TIN),
            new MaterialData("zinc", "Zinc", ModToolTiers.ZINC, ModTags.INGOTS_ZINC),
            new MaterialData("copper", "Copper", ModToolTiers.COPPER, Tags.Items.INGOTS_COPPER),
            new MaterialData("bronze", "Bronze", ModToolTiers.BRONZE, ModTags.INGOTS_BRONZE),
            new MaterialData("brass", "Brass", ModToolTiers.BRASS, ModTags.INGOTS_BRASS),
            new MaterialData("rosegold", "Rose Gold", ModToolTiers.ROSEGOLD, ModTags.INGOTS_ROSEGOLD),
            new MaterialData("steel", "Steel", ModToolTiers.STEEL, ModTags.INGOTS_STEEL)
    };

    public static Map<String, Tuple<Tier, ArmorMaterial>> vanillaMaterials = ImmutableMap.of(
            "tin", new Tuple<>(ModToolTiers.TIN, ModArmorTiers.TIN),
            "zinc", new Tuple<>(ModToolTiers.ZINC, ModArmorTiers.ZINC),
            "copper", new Tuple<>(ModToolTiers.COPPER, ModArmorTiers.COPPER),
            "bronze", new Tuple<>(ModToolTiers.BRONZE, ModArmorTiers.BRONZE),
            "brass", new Tuple<>(ModToolTiers.BRASS, ModArmorTiers.BRASS),
            "rosegold", new Tuple<>(ModToolTiers.ROSEGOLD, ModArmorTiers.ROSEGOLD),
            "steel", new Tuple<>(ModToolTiers.STEEL, ModArmorTiers.STEEL)
    );
    //</editor-fold>

    //<editor-fold desc="Crafting Item">
    public static final RegistryObject<Item> WOODEN_POLE = ModItems.ITEMS.register("wooden_pole", () ->
            new Item((new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON)));
    //</editor-fold>

    //<editor-fold desc="Modded Weapon">
    public static Map<String, RegistryObject<Item>> GREATSWORDS = registerGreatsword();
    public static Map<String, RegistryObject<Item>> SCIMITARS = registerScimitar();
    public static Map<String, RegistryObject<Item>> KATANAS = registerKatana();
    public static Map<String, RegistryObject<Item>> GREATAXES = registerGreataxe();
    public static Map<String, RegistryObject<Item>> SPEARS = registerSpear();
    public static Map<String, RegistryObject<Item>> HALBERDS = registerHalberd();
    public static Map<String, RegistryObject<Item>> GLAIVES = registerGlaive();
    public static Map<String, RegistryObject<Item>> BATTLESTAFFS = registerBattlestaff();

    private static Map<String, RegistryObject<Item>> registerGreatsword() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_greatsword", () ->
                    new GreatswordItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerScimitar() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_scimitar", () ->
                    new ScimitarItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerKatana() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_katana", () ->
                    new KatanaItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerGreataxe() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_greataxe", () ->
                    new GreataxeItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerSpear() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_spear", () ->
                    new SpearItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerHalberd() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_halberd", () ->
                    new HalberdItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerGlaive() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_glaive", () ->
                    new GlaiveItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerBattlestaff() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        for (MaterialData data : moddedMaterials) {
            map.put(data.getName(), ITEMS.register(data.getName() + "_battlestaff", () ->
                    new BattlestaffItem(data.getTier(), (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON))));
        }
        return map;
    }
    //</editor-fold>

    //<editor-fold desc="Armor">
    public static Map<String, RegistryObject<Item>> HELMETS = registerHelmet();
    public static Map<String, RegistryObject<Item>> CHESTPLATES = registerChestplate();
    public static Map<String, RegistryObject<Item>> LEGGINGS = registerLeggings();
    public static Map<String, RegistryObject<Item>> BOOTS = registerBoots();

    private static Map<String, RegistryObject<Item>> registerHelmet() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_helmet", () ->
                    new ArmorItem(tier.getB(), EquipmentSlot.HEAD,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerChestplate() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_chestplate", () ->
                    new ArmorItem(tier.getB(), EquipmentSlot.CHEST,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerLeggings() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_leggings", () ->
                    new ArmorItem(tier.getB(), EquipmentSlot.LEGS,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerBoots() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_boots", () ->
                    new ArmorItem(tier.getB(), EquipmentSlot.FEET,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }
    //</editor-fold>

    //<editor-fold desc="Vanilla Tool">
    public static Map<String, RegistryObject<Item>> SWORDS = registerSword();
    public static Map<String, RegistryObject<Item>> SHOVELS = registerShovel();
    public static Map<String, RegistryObject<Item>> PICKAXES = registerPickaxe();
    public static Map<String, RegistryObject<Item>> AXES = registerAxe();
    public static Map<String, RegistryObject<Item>> HOES = registerHoe();

    private static Map<String, RegistryObject<Item>> registerSword() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_sword", () ->
                    new SwordItem(tier.getA(), 3, -2.4F,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerShovel() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_shovel", () ->
                    new ShovelItem(tier.getA(), 1.5F, -3.0F,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerPickaxe() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_pickaxe", () ->
                    new PickaxeItem(tier.getA(),1, -2.8F,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerAxe() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_axe", () ->
                    new AxeItem(tier.getA(), 6.5F, -3.15F,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }

    private static Map<String, RegistryObject<Item>> registerHoe() {
        Map<String, RegistryObject<Item>> map = new HashMap<>();
        vanillaMaterials.forEach((name, tier) -> {
            map.put(name, ITEMS.register(name + "_hoe", () ->
                    new NewHoeItem(tier.getA(),-1.5F,
                            (new Item.Properties()).tab(CreativeTab.ADDITIONAL_WEAPON_VANILLA))));
        });
        return map;
    }
    //</editor-fold>

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
