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


        registerGreatsword(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATSWORD.get(), Tags.Items.GEMS_DIAMOND);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.GOLDEN_GREATSWORD.get(), Tags.Items.INGOTS_GOLD);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.IRON_GREATSWORD.get(), Tags.Items.INGOTS_IRON);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.STONE_GREATSWORD.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerGreatsword(pFinishedRecipeConsumer, ModItems.WOODEN_GREATSWORD.get(), ItemTags.PLANKS);

        registerGreataxe(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATAXE.get(), Tags.Items.GEMS_DIAMOND);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.GOLDEN_GREATAXE.get(), Tags.Items.INGOTS_GOLD);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.IRON_GREATAXE.get(), Tags.Items.INGOTS_IRON);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.STONE_GREATAXE.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.WOODEN_GREATAXE.get(), ItemTags.PLANKS);

        registerScimitar(pFinishedRecipeConsumer, ModItems.DIAMOND_SCIMITAR.get(), Tags.Items.GEMS_DIAMOND);
        registerScimitar(pFinishedRecipeConsumer, ModItems.GOLDEN_SCIMITAR.get(), Tags.Items.INGOTS_GOLD);
        registerScimitar(pFinishedRecipeConsumer, ModItems.IRON_SCIMITAR.get(), Tags.Items.INGOTS_IRON);
        registerScimitar(pFinishedRecipeConsumer, ModItems.STONE_SCIMITAR.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerScimitar(pFinishedRecipeConsumer, ModItems.WOODEN_SCIMITAR.get(), ItemTags.PLANKS);

        registerKatana(pFinishedRecipeConsumer, ModItems.DIAMOND_KATANA.get(), Tags.Items.GEMS_DIAMOND);
        registerKatana(pFinishedRecipeConsumer, ModItems.GOLDEN_KATANA.get(), Tags.Items.INGOTS_GOLD);
        registerKatana(pFinishedRecipeConsumer, ModItems.IRON_KATANA.get(), Tags.Items.INGOTS_IRON);
        registerKatana(pFinishedRecipeConsumer, ModItems.STONE_KATANA.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerKatana(pFinishedRecipeConsumer, ModItems.WOODEN_KATANA.get(), ItemTags.PLANKS);

        registerSpear(pFinishedRecipeConsumer, ModItems.DIAMOND_SPEAR.get(), Tags.Items.GEMS_DIAMOND);
        registerSpear(pFinishedRecipeConsumer, ModItems.GOLDEN_SPEAR.get(), Tags.Items.INGOTS_GOLD);
        registerSpear(pFinishedRecipeConsumer, ModItems.IRON_SPEAR.get(), Tags.Items.INGOTS_IRON);
        registerSpear(pFinishedRecipeConsumer, ModItems.STONE_SPEAR.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerSpear(pFinishedRecipeConsumer, ModItems.WOODEN_SPEAR.get(), ItemTags.PLANKS);

        registerHalberd(pFinishedRecipeConsumer, ModItems.DIAMOND_HALBERD.get(), Tags.Items.GEMS_DIAMOND);
        registerHalberd(pFinishedRecipeConsumer, ModItems.GOLDEN_HALBERD.get(), Tags.Items.INGOTS_GOLD);
        registerHalberd(pFinishedRecipeConsumer, ModItems.IRON_HALBERD.get(), Tags.Items.INGOTS_IRON);
        registerHalberd(pFinishedRecipeConsumer, ModItems.STONE_HALBERD.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerHalberd(pFinishedRecipeConsumer, ModItems.WOODEN_HALBERD.get(), ItemTags.PLANKS);

        registerGlaive(pFinishedRecipeConsumer, ModItems.DIAMOND_GLAIVE.get(), Tags.Items.GEMS_DIAMOND);
        registerGlaive(pFinishedRecipeConsumer, ModItems.GOLDEN_GLAIVE.get(), Tags.Items.INGOTS_GOLD);
        registerGlaive(pFinishedRecipeConsumer, ModItems.IRON_GLAIVE.get(), Tags.Items.INGOTS_IRON);
        registerGlaive(pFinishedRecipeConsumer, ModItems.STONE_GLAIVE.get(), ItemTags.STONE_TOOL_MATERIALS);
        registerGlaive(pFinishedRecipeConsumer, ModItems.WOODEN_GLAIVE.get(), ItemTags.PLANKS);

        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATSWORD.get(), ModItems.NETHERITE_GREATSWORD.get());
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_GREATAXE.get(), ModItems.NETHERITE_GREATAXE.get());
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_SCIMITAR.get(), ModItems.NETHERITE_SCIMITAR.get());
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_KATANA.get(), ModItems.NETHERITE_KATANA.get());
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_SPEAR.get(), ModItems.NETHERITE_SPEAR.get());
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_HALBERD.get(), ModItems.NETHERITE_HALBERD.get());
        registerNetherite(pFinishedRecipeConsumer, ModItems.DIAMOND_GLAIVE.get(), ModItems.NETHERITE_GLAIVE.get());

        // Copper - Minecraft
        registerGreatsword(pFinishedRecipeConsumer, ModItems.COPPER_GREATSWORD.get(), Tags.Items.INGOTS_COPPER);
        registerGreataxe(pFinishedRecipeConsumer, ModItems.COPPER_GREATAXE.get(), Tags.Items.INGOTS_COPPER);
        registerScimitar(pFinishedRecipeConsumer, ModItems.COPPER_SCIMITAR.get(), Tags.Items.INGOTS_COPPER);
        registerKatana(pFinishedRecipeConsumer, ModItems.COPPER_KATANA.get(), Tags.Items.INGOTS_COPPER);
        registerSpear(pFinishedRecipeConsumer, ModItems.COPPER_SPEAR.get(), Tags.Items.INGOTS_COPPER);
        registerHalberd(pFinishedRecipeConsumer, ModItems.COPPER_HALBERD.get(), Tags.Items.INGOTS_COPPER);
        registerGlaive(pFinishedRecipeConsumer, ModItems.COPPER_GLAIVE.get(), Tags.Items.INGOTS_COPPER);
    }

    private void registerGreatsword(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, " # "," # ","#/#");
    }

    private void registerGreataxe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, "###","#/#"," / ");
    }

    private void registerScimitar(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, "  #"," # "," / ");
    }

    private void registerKatana(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, Items.STICK, "  #"," # ","#/#");
    }

    private void registerSpear(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # "," # "," / ");
    }

    private void registerHalberd(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # ","## ","#/ ");
    }

    private void registerGlaive(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(pFinishedRecipeConsumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # "," # ","#/#");
    }

    private void registerWeapon(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item weaponItem, TagKey<Item> bladeItem,
                                Item handleItem, String pattern1, String pattern2, String pattern3) {
        ShapedRecipeBuilder.shaped(weaponItem)
                .define('#', bladeItem)
                .define('/', handleItem)
                .pattern(pattern1)
                .pattern(pattern2)
                .pattern(pattern3)
                .unlockedBy("has_item", has(bladeItem))
                .save(pFinishedRecipeConsumer);
    }

    private void registerNetherite(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Item baseItem, Item craftItem) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(baseItem), Ingredient.of(Tags.Items.INGOTS_NETHERITE), craftItem)
                .unlocks("has_" + Tags.Items.INGOTS_NETHERITE, has(Tags.Items.INGOTS_NETHERITE))
                .save(pFinishedRecipeConsumer, new ResourceLocation(ForgeRegistries.ITEMS.getKey(craftItem).getNamespace(),
                        craftItem + "_smithing"));
    }
}
