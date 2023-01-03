package com.timelesskeeper.additionalweapon.api.data;

import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public abstract class BaseRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public BaseRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    protected void registerHelmet(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                  TagKey<Item> bladeItem) {
        registerArmor(pFinishedRecipeConsumer, weaponItem, bladeItem, "###","# #");
    }

    protected void registerChestplate(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                      TagKey<Item> bladeItem) {
        registerArmor(pFinishedRecipeConsumer, weaponItem, bladeItem, "# #","###","###");
    }

    protected void registerLeggings(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                    TagKey<Item> bladeItem) {
        registerArmor(pFinishedRecipeConsumer, weaponItem, bladeItem, "###","# #","# #");
    }

    protected void registerBoots(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                 TagKey<Item> bladeItem) {
        registerArmor(pFinishedRecipeConsumer, weaponItem, bladeItem, "# #","# #");
    }

    protected void registerSword(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                 TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                " # "," # "," / ");
    }

    protected void registerShovel(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                  TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                " # "," / "," / ");
    }

    protected void registerPickaxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                   TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                "###"," / "," / ");
    }

    protected void registerAxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                               TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                "## ","#/ "," / ");
    }

    protected void registerHoe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                               TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                "## "," / "," / ");
    }

    protected void registerGreatsword(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                      TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                " # "," # ","#/#");
    }

    protected void registerGreataxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                    TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                "###","#/#"," / ");
    }

    protected void registerScimitar(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                    TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                "  #"," # "," / ");
    }

    protected void registerKatana(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                  TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK,
                "  #"," # ","#/#");
    }

    protected void registerSpear(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                 TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # "," # "," / ");
    }

    protected void registerHalberd(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                   TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # ","## ","#/ ");
    }

    protected void registerGlaive(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                  TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # "," # ","#/#");
    }

    protected void registerBattlestaff(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                       TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(),
                " # "," / "," # ");
    }

    protected void registerArmor(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                 TagKey<Item> bladeItem, String pattern1, String pattern2) {
        ShapedRecipeBuilder.shaped(weaponItem)
                .define('#', bladeItem)
                .pattern(pattern1)
                .pattern(pattern2)
                .unlockedBy("has_item", has(bladeItem))
                .save(pFinishedRecipeConsumer);
    }

    protected void registerArmor(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                 TagKey<Item> bladeItem, String pattern1, String pattern2, String pattern3) {
        ShapedRecipeBuilder.shaped(weaponItem)
                .define('#', bladeItem)
                .pattern(pattern1)
                .pattern(pattern2)
                .pattern(pattern3)
                .unlockedBy("has_item", has(bladeItem))
                .save(pFinishedRecipeConsumer);
    }

    protected void registerWeapon(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem,
                                  TagKey<Item> bladeItem, Item handleItem, String pattern1, String pattern2,
                                  String pattern3) {
        ShapedRecipeBuilder.shaped(weaponItem)
                .define('#', bladeItem)
                .define('/', handleItem)
                .pattern(pattern1)
                .pattern(pattern2)
                .pattern(pattern3)
                .unlockedBy("has_item", has(bladeItem))
                .save(pFinishedRecipeConsumer);
    }

    protected void registerNetherite(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item baseItem,
                                     Item craftItem) {
        registerSmithing(pFinishedRecipeConsumer, Tags.Items.INGOTS_NETHERITE, baseItem, craftItem);
    }

    protected void registerSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, TagKey<Item> upgradeItem,
                                    Item baseItem, Item craftItem) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(baseItem), Ingredient.of(upgradeItem), craftItem)
                .unlocks("has_" + upgradeItem, has(upgradeItem))
                .save(pFinishedRecipeConsumer, getItemId(craftItem, "_smithing"));
    }

    protected void registerSmithing(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item upgradeItem,
                                    Item baseItem, Item craftItem) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(baseItem), Ingredient.of(upgradeItem), craftItem)
                .unlocks("has_" + upgradeItem, has(upgradeItem))
                .save(pFinishedRecipeConsumer, getItemId(craftItem, "_smithing"));
    }

    protected ResourceLocation getItemId(Item item, String suffix) {
        return new ResourceLocation(ForgeRegistries.ITEMS.getKey(item).getNamespace(), item + suffix);
    }
}
