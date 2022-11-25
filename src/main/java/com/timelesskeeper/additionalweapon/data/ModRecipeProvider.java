package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModItems.WOODEN_POLE.get())
                .define('/', Items.STICK)
                .pattern("  /")
                .pattern(" / ")
                .pattern("/  ")
                .unlockedBy("has_item", has(Items.STICK))
                .save(pFinishedRecipeConsumer);

        registerGreatsword(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATSWORD, Tags.Items.GEMS_DIAMOND);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.GOLDEN_GREATSWORD, Tags.Items.INGOTS_GOLD);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.IRON_GREATSWORD, Tags.Items.INGOTS_IRON);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.STONE_GREATSWORD, ItemTags.STONE_TOOL_MATERIALS);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.WOODEN_GREATSWORD, ItemTags.PLANKS);

        registerGreataxe(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATAXE, Tags.Items.GEMS_DIAMOND);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.GOLDEN_GREATAXE, Tags.Items.INGOTS_GOLD);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.IRON_GREATAXE, Tags.Items.INGOTS_IRON);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.STONE_GREATAXE, ItemTags.STONE_TOOL_MATERIALS);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.WOODEN_GREATAXE, ItemTags.PLANKS);

        registerScimitar(pFinishedRecipeConsumer, ModItems.DIAMOND_SCIMITAR, Tags.Items.GEMS_DIAMOND);
        registerScimitar(pFinishedRecipeConsumer, ModItems.GOLDEN_SCIMITAR, Tags.Items.INGOTS_GOLD);
        registerScimitar(pFinishedRecipeConsumer, ModItems.IRON_SCIMITAR, Tags.Items.INGOTS_IRON);
        registerScimitar(pFinishedRecipeConsumer, ModItems.STONE_SCIMITAR, ItemTags.STONE_TOOL_MATERIALS);
        registerScimitar(pFinishedRecipeConsumer, ModItems.WOODEN_SCIMITAR, ItemTags.PLANKS);

        registerKatana(pFinishedRecipeConsumer, ModItems.DIAMOND_KATANA, Tags.Items.GEMS_DIAMOND);
        registerKatana(pFinishedRecipeConsumer, ModItems.GOLDEN_KATANA, Tags.Items.INGOTS_GOLD);
        registerKatana(pFinishedRecipeConsumer, ModItems.IRON_KATANA, Tags.Items.INGOTS_IRON);
        registerKatana(pFinishedRecipeConsumer, ModItems.STONE_KATANA, ItemTags.STONE_TOOL_MATERIALS);
        registerKatana(pFinishedRecipeConsumer, ModItems.WOODEN_KATANA, ItemTags.PLANKS);

        registerSpear(pFinishedRecipeConsumer, ModItems.DIAMOND_SPEAR, Tags.Items.GEMS_DIAMOND);
        registerSpear(pFinishedRecipeConsumer, ModItems.GOLDEN_SPEAR, Tags.Items.INGOTS_GOLD);
        registerSpear(pFinishedRecipeConsumer, ModItems.IRON_SPEAR, Tags.Items.INGOTS_IRON);
        registerSpear(pFinishedRecipeConsumer, ModItems.STONE_SPEAR, ItemTags.STONE_TOOL_MATERIALS);
        registerSpear(pFinishedRecipeConsumer, ModItems.WOODEN_SPEAR, ItemTags.PLANKS);

        registerHalberd(pFinishedRecipeConsumer, ModItems.DIAMOND_HALBERD, Tags.Items.GEMS_DIAMOND);
        registerHalberd(pFinishedRecipeConsumer, ModItems.GOLDEN_HALBERD, Tags.Items.INGOTS_GOLD);
        registerHalberd(pFinishedRecipeConsumer, ModItems.IRON_HALBERD, Tags.Items.INGOTS_IRON);
        registerHalberd(pFinishedRecipeConsumer, ModItems.STONE_HALBERD, ItemTags.STONE_TOOL_MATERIALS);
        registerHalberd(pFinishedRecipeConsumer, ModItems.WOODEN_HALBERD, ItemTags.PLANKS);

        registerGlaive(pFinishedRecipeConsumer, ModItems.DIAMOND_GLAIVE, Tags.Items.GEMS_DIAMOND);
        registerGlaive(pFinishedRecipeConsumer, ModItems.GOLDEN_GLAIVE, Tags.Items.INGOTS_GOLD);
        registerGlaive(pFinishedRecipeConsumer, ModItems.IRON_GLAIVE, Tags.Items.INGOTS_IRON);
        registerGlaive(pFinishedRecipeConsumer, ModItems.STONE_GLAIVE, ItemTags.STONE_TOOL_MATERIALS);
        registerGlaive(pFinishedRecipeConsumer, ModItems.WOODEN_GLAIVE, ItemTags.PLANKS);

        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATSWORD, ModItems.NETHERITE_GREATSWORD);
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATAXE, ModItems.NETHERITE_GREATAXE);
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_SCIMITAR, ModItems.NETHERITE_SCIMITAR);
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_KATANA, ModItems.NETHERITE_KATANA);
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_SPEAR, ModItems.NETHERITE_SPEAR);
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_HALBERD, ModItems.NETHERITE_HALBERD);
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_GLAIVE, ModItems.NETHERITE_GLAIVE);
    }

    private void registerGreatsword(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, " # "," # ","#/#");
    }

    private void registerGreataxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, "###","#/#"," / ");
    }

    private void registerScimitar(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, "  #"," # "," / ");
    }

    private void registerKatana(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, "  #"," # ","#/#");
    }

    private void registerSpear(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # "," # "," / ");
    }

    private void registerHalberd(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # ","## ","#/ ");
    }

    private void registerGlaive(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # "," # ","#/#");
    }

    private void registerWeapon(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem,
                                Item handleItem, String pattern1, String pattern2, String pattern3) {
        ShapedRecipeBuilder.shaped(weaponItem.get())
                .define('#', bladeItem)
                .define('/', handleItem)
                .pattern(pattern1)
                .pattern(pattern2)
                .pattern(pattern3)
                .unlockedBy("has_item", has(bladeItem))
                .save(pFinishedRecipeConsumer);
    }

    private void registerNetherite(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RegistryObject<Item> baseItem, RegistryObject<Item> craftItem) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(baseItem.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), craftItem.get())
                .unlocks("has_" + Tags.Items.INGOTS_NETHERITE, has(Tags.Items.INGOTS_NETHERITE))
                .save(pFinishedRecipeConsumer, new ResourceLocation(ForgeRegistries.ITEMS.getKey(craftItem.get()).getNamespace(), craftItem.get() + "_smithing"));
    }
}
