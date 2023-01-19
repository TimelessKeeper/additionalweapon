package com.timelesskeeper.additionalweapon.api.data;

import com.timelesskeeper.additionalweapon.api.crafting.ConfigEnableCondition;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public abstract class BaseRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public BaseRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    protected void registerHelmet(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerArmor(consumer, weaponItem, bladeItem, "###","# #");
    }

    protected void registerChestplate(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerArmor(consumer, weaponItem, bladeItem, "# #","###","###");
    }

    protected void registerLeggings(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerArmor(consumer, weaponItem, bladeItem, "###","# #","# #");
    }

    protected void registerBoots(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerArmor(consumer, weaponItem, bladeItem, "# #","# #");
    }

    protected void registerSword(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                " # "," # "," / ");
    }

    protected void registerShovel(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                " # "," / "," / ");
    }

    protected void registerPickaxe(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                "###"," / "," / ");
    }

    protected void registerAxe(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                "## ","#/ "," / ");
    }

    protected void registerHoe(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                "## "," / "," / ");
    }

    protected void registerGreatsword(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                " # "," # ","#/#");
    }

    protected void registerGreataxe(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                "###","#/#"," / ");
    }

    protected void registerScimitar(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                "  #"," # "," / ");
    }

    protected void registerKatana(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK,
                "  #"," # ","#/#");
    }

    protected void registerSpear(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # "," # "," / ");
    }

    protected void registerHalberd(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # ","## ","#/ ");
    }

    protected void registerGlaive(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # "," # ","#/#");
    }

    protected void registerBattlestaff(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # "," / "," # ");
    }

    protected void registerArmor(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem,
                                 String pattern1, String pattern2) {
        ConditionalRecipe.builder()
                .addCondition(new ConfigEnableCondition(weaponItem))
                .addRecipe(ShapedRecipeBuilder.shaped(weaponItem)
                        .define('#', bladeItem)
                        .pattern(pattern1)
                        .pattern(pattern2)
                        .unlockedBy("has_item", has(bladeItem))
                        ::save)
                .generateAdvancement()
                .build(consumer, ForgeRegistries.ITEMS.getKey(weaponItem));
    }

    protected void registerArmor(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem,
                                 String pattern1, String pattern2, String pattern3) {
        ConditionalRecipe.builder()
                .addCondition(new ConfigEnableCondition(weaponItem))
                .addRecipe(ShapedRecipeBuilder.shaped(weaponItem)
                        .define('#', bladeItem)
                        .pattern(pattern1)
                        .pattern(pattern2)
                        .pattern(pattern3)
                        .unlockedBy("has_item", has(bladeItem))
                        ::save)
                .generateAdvancement()
                .build(consumer, ForgeRegistries.ITEMS.getKey(weaponItem));
    }

    protected void registerWeapon(Consumer<FinishedRecipe> consumer, Item weaponItem, TagKey<Item> bladeItem,
                                  Item handleItem, String pattern1, String pattern2, String pattern3) {
        ConditionalRecipe.builder()
                .addCondition(new ConfigEnableCondition(weaponItem))
                .addRecipe(ShapedRecipeBuilder.shaped(weaponItem)
                        .define('#', bladeItem)
                        .define('/', handleItem)
                        .pattern(pattern1)
                        .pattern(pattern2)
                        .pattern(pattern3)
                        .unlockedBy("has_item", has(bladeItem))
                        ::save)
                .generateAdvancement()
                .build(consumer, ForgeRegistries.ITEMS.getKey(weaponItem));
    }

    protected void registerSmithing(Consumer<FinishedRecipe> consumer, TagKey<Item> upgradeItem, Item baseItem,
                                    Item craftItem) {
        ConditionalRecipe.builder()
                .addCondition(new ConfigEnableCondition(craftItem))
                .addRecipe(consumer2 -> UpgradeRecipeBuilder
                        .smithing(Ingredient.of(baseItem), Ingredient.of(upgradeItem), craftItem)
                        .unlocks("has_" + upgradeItem, has(upgradeItem))
                        .save(consumer2, getItemId(craftItem, "_smithing")))
                .generateAdvancement()
                .build(consumer, getItemId(craftItem, "_smithing"));
    }

    protected void registerSmithing(Consumer<FinishedRecipe> consumer, Item upgradeItem, Item baseItem,
                                    Item craftItem) {
        ConditionalRecipe.builder()
                .addCondition(new ConfigEnableCondition(craftItem))
                .addRecipe(consumer2 -> UpgradeRecipeBuilder
                        .smithing(Ingredient.of(baseItem), Ingredient.of(upgradeItem), craftItem)
                        .unlocks("has_" + upgradeItem, has(upgradeItem))
                        .save(consumer2, getItemId(craftItem, "_smithing")))
                .generateAdvancement()
                .build(consumer, getItemId(craftItem, "_smithing"));
    }

    protected ResourceLocation getItemId(Item item, String suffix) {
        return new ResourceLocation(ForgeRegistries.ITEMS.getKey(item).getNamespace(), item + suffix);
    }
}
