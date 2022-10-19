package com.timelesskeeper.additionalweapon.data.client;

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
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(ModItems.WOODEN_POLE.get())
                .define('/', Items.STICK)
                .pattern("  /")
                .pattern(" / ")
                .pattern("/  ")
                .unlockedBy("has_item", has(Items.STICK))
                .save(consumer);

        registerGreatsword(consumer, ModItems.DIAMOND_GREATSWORD, Tags.Items.GEMS_DIAMOND);
        registerGreatsword(consumer, ModItems.GOLDEN_GREATSWORD, Tags.Items.INGOTS_GOLD);
        registerGreatsword(consumer, ModItems.IRON_GREATSWORD, Tags.Items.INGOTS_IRON);
        registerGreatsword(consumer, ModItems.STONE_GREATSWORD, ItemTags.STONE_TOOL_MATERIALS);
        registerGreatsword(consumer, ModItems.WOODEN_GREATSWORD, ItemTags.PLANKS);

        registerGreataxe(consumer, ModItems.DIAMOND_GREATAXE, Tags.Items.GEMS_DIAMOND);
        registerGreataxe(consumer, ModItems.GOLDEN_GREATAXE, Tags.Items.INGOTS_GOLD);
        registerGreataxe(consumer, ModItems.IRON_GREATAXE, Tags.Items.INGOTS_IRON);
        registerGreataxe(consumer, ModItems.STONE_GREATAXE, ItemTags.STONE_TOOL_MATERIALS);
        registerGreataxe(consumer, ModItems.WOODEN_GREATAXE, ItemTags.PLANKS);

        registerScimitar(consumer, ModItems.DIAMOND_SCIMITAR, Tags.Items.GEMS_DIAMOND);
        registerScimitar(consumer, ModItems.GOLDEN_SCIMITAR, Tags.Items.INGOTS_GOLD);
        registerScimitar(consumer, ModItems.IRON_SCIMITAR, Tags.Items.INGOTS_IRON);
        registerScimitar(consumer, ModItems.STONE_SCIMITAR, ItemTags.STONE_TOOL_MATERIALS);
        registerScimitar(consumer, ModItems.WOODEN_SCIMITAR, ItemTags.PLANKS);

        registerKatana(consumer, ModItems.DIAMOND_KATANA, Tags.Items.GEMS_DIAMOND);
        registerKatana(consumer, ModItems.GOLDEN_KATANA, Tags.Items.INGOTS_GOLD);
        registerKatana(consumer, ModItems.IRON_KATANA, Tags.Items.INGOTS_IRON);
        registerKatana(consumer, ModItems.STONE_KATANA, ItemTags.STONE_TOOL_MATERIALS);
        registerKatana(consumer, ModItems.WOODEN_KATANA, ItemTags.PLANKS);

        registerSpear(consumer, ModItems.DIAMOND_SPEAR, Tags.Items.GEMS_DIAMOND);
        registerSpear(consumer, ModItems.GOLDEN_SPEAR, Tags.Items.INGOTS_GOLD);
        registerSpear(consumer, ModItems.IRON_SPEAR, Tags.Items.INGOTS_IRON);
        registerSpear(consumer, ModItems.STONE_SPEAR, ItemTags.STONE_TOOL_MATERIALS);
        registerSpear(consumer, ModItems.WOODEN_SPEAR, ItemTags.PLANKS);

        registerHalberd(consumer, ModItems.DIAMOND_HALBERD, Tags.Items.GEMS_DIAMOND);
        registerHalberd(consumer, ModItems.GOLDEN_HALBERD, Tags.Items.INGOTS_GOLD);
        registerHalberd(consumer, ModItems.IRON_HALBERD, Tags.Items.INGOTS_IRON);
        registerHalberd(consumer, ModItems.STONE_HALBERD, ItemTags.STONE_TOOL_MATERIALS);
        registerHalberd(consumer, ModItems.WOODEN_HALBERD, ItemTags.PLANKS);

        registerGlaive(consumer, ModItems.DIAMOND_GLAIVE, Tags.Items.GEMS_DIAMOND);
        registerGlaive(consumer, ModItems.GOLDEN_GLAIVE, Tags.Items.INGOTS_GOLD);
        registerGlaive(consumer, ModItems.IRON_GLAIVE, Tags.Items.INGOTS_IRON);
        registerGlaive(consumer, ModItems.STONE_GLAIVE, ItemTags.STONE_TOOL_MATERIALS);
        registerGlaive(consumer, ModItems.WOODEN_GLAIVE, ItemTags.PLANKS);

        registerNetherite(consumer, ModItems.DIAMOND_GREATSWORD, ModItems.NETHERITE_GREATSWORD);
        registerNetherite(consumer, ModItems.DIAMOND_GREATAXE, ModItems.NETHERITE_GREATAXE);
        registerNetherite(consumer, ModItems.DIAMOND_SCIMITAR, ModItems.NETHERITE_SCIMITAR);
        registerNetherite(consumer, ModItems.DIAMOND_KATANA, ModItems.NETHERITE_KATANA);
        registerNetherite(consumer, ModItems.DIAMOND_SPEAR, ModItems.NETHERITE_SPEAR);
        registerNetherite(consumer, ModItems.DIAMOND_HALBERD, ModItems.NETHERITE_HALBERD);
        registerNetherite(consumer, ModItems.DIAMOND_GLAIVE, ModItems.NETHERITE_GLAIVE);
    }

    private void registerGreatsword(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK, " # "," # ","#/#");
    }

    private void registerGreataxe(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK, "###","#/#"," / ");
    }

    private void registerScimitar(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK, "  #"," # "," / ");
    }

    private void registerKatana(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, Items.STICK, "  #"," # ","#/#");
    }

    private void registerSpear(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # "," # "," / ");
    }

    private void registerHalberd(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # ","## ","#/ ");
    }

    private void registerGlaive(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem) {
        registerWeapon(consumer, weaponItem, bladeItem, ModItems.WOODEN_POLE.get(), " # "," # ","#/#");
    }

    private void registerWeapon(Consumer<FinishedRecipe> consumer, RegistryObject<Item> weaponItem, TagKey<Item> bladeItem,
                                Item handleItem, String pattern1, String pattern2, String pattern3) {
        ShapedRecipeBuilder.shaped(weaponItem.get())
                .define('#', bladeItem)
                .define('/', handleItem)
                .pattern(pattern1)
                .pattern(pattern2)
                .pattern(pattern3)
                .unlockedBy("has_item", has(bladeItem))
                .save(consumer);
    }

    private void registerNetherite(Consumer<FinishedRecipe> consumer, RegistryObject<Item> baseItem, RegistryObject<Item> craftItem) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(baseItem.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), craftItem.get())
                .unlocks("has_" + Tags.Items.INGOTS_NETHERITE.toString(), has(Tags.Items.INGOTS_NETHERITE))
                .save(consumer, new ResourceLocation(ForgeRegistries.ITEMS.getKey(craftItem.get()).getNamespace(), craftItem.get().toString() + "_smithing"));
     }
}
