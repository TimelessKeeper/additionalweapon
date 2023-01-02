package com.timelesskeeper.additionalweapon.data;

import com.google.common.collect.ImmutableMap;
import com.timelesskeeper.additionalweapon.api.data.BaseRecipeProvider;
import com.timelesskeeper.additionalweapon.api.items.MaterialData;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Map;
import java.util.function.Consumer;

public class ModRecipeProvider extends BaseRecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    private static final Map<String, String> smithMaterials = ImmutableMap.of(
            "netherite", "diamond"
    );

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModItems.WOODEN_POLE.get())
                .define('/', Items.STICK)
                .pattern("  /")
                .pattern(" / ")
                .pattern("/  ")
                .unlockedBy("has_item", has(Items.STICK))
                .save(pFinishedRecipeConsumer);

        for (MaterialData data : ModItems.moddedMaterials) {
            if (smithMaterials.containsKey(data.getName())) {
                String smithBase = smithMaterials.get(data.getName());
                registerNetherite(pFinishedRecipeConsumer, ModItems.GREATSWORDS.get(smithBase).get(),
                        ModItems.GREATSWORDS.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.GREATAXES.get(smithBase).get(),
                        ModItems.GREATAXES.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.SCIMITARS.get(smithBase).get(),
                        ModItems.SCIMITARS.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.KATANAS.get(smithBase).get(),
                        ModItems.KATANAS.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.SPEARS.get(smithBase).get(),
                        ModItems.SPEARS.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.HALBERDS.get(smithBase).get(),
                        ModItems.HALBERDS.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.GLAIVES.get(smithBase).get(),
                        ModItems.GLAIVES.get(data.getName()).get());
                registerNetherite(pFinishedRecipeConsumer, ModItems.BATTLESTAFFS.get(smithBase).get(),
                        ModItems.BATTLESTAFFS.get(data.getName()).get());

            } else {
                registerGreatsword(pFinishedRecipeConsumer, ModItems.GREATSWORDS.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.SCIMITARS.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.KATANAS.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.GREATAXES.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.SPEARS.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.HALBERDS.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.GLAIVES.get(data.getName()).get(),
                        data.getBladeItem());
                registerGreatsword(pFinishedRecipeConsumer, ModItems.BATTLESTAFFS.get(data.getName()).get(),
                        data.getBladeItem());

                if (ModItems.vanillaMaterials.containsKey(data.getName()))
                {
                    registerHelmet(pFinishedRecipeConsumer, ModItems.HELMETS.get(data.getName()).get(),
                            data.getBladeItem());
                    registerChestplate(pFinishedRecipeConsumer, ModItems.CHESTPLATES.get(data.getName()).get(),
                            data.getBladeItem());
                    registerLeggings(pFinishedRecipeConsumer, ModItems.LEGGINGS.get(data.getName()).get(),
                            data.getBladeItem());
                    registerBoots(pFinishedRecipeConsumer, ModItems.BOOTS.get(data.getName()).get(),
                            data.getBladeItem());
                    registerSword(pFinishedRecipeConsumer, ModItems.SWORDS.get(data.getName()).get(),
                            data.getBladeItem());
                    registerShovel(pFinishedRecipeConsumer, ModItems.SHOVELS.get(data.getName()).get(),
                            data.getBladeItem());
                    registerPickaxe(pFinishedRecipeConsumer, ModItems.PICKAXES.get(data.getName()).get(),
                            data.getBladeItem());
                    registerAxe(pFinishedRecipeConsumer, ModItems.AXES.get(data.getName()).get(),
                            data.getBladeItem());
                    registerHoe(pFinishedRecipeConsumer, ModItems.HOES.get(data.getName()).get(),
                            data.getBladeItem());
                }
            }
        }
    }
}
