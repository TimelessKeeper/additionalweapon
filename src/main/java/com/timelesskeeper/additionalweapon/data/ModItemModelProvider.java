package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AdditionalWeapon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        builders("diamond");
        builders("golden");
        builders("netherite");
        builders("stone");
        builders("wooden");

        // Copper - Minecraft
        buildersArmor("copper");
        buildersVanilla("copper");
        builders("copper");
    }

    private ItemModelBuilder[] builders(String name)
    {
        ModelFile greatswordParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_greatsword"));
        ModelFile greataxeParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_greataxe"));
        ModelFile scimitarParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_scimitar"));
        ModelFile katanaParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_katana"));
        ModelFile spearParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_spear"));
        ModelFile halberdParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_halberd"));
        ModelFile glaiveParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_glaive"));
        ModelFile battlestaffParent = getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/iron_battlestaff"));

        return new ItemModelBuilder[]{
                builder(greatswordParent, name + "_greatsword"),
                builder(greataxeParent, name + "_greataxe"),
                builder(scimitarParent, name + "_scimitar"),
                builder(katanaParent, name + "_katana"),
                builder(spearParent, name + "_spear"),
                builder(halberdParent, name + "_halberd"),
                builder(glaiveParent, name + "_glaive"),
                builder(battlestaffParent, name + "_battlestaff")
        };
    }

    private ItemModelBuilder[] buildersVanilla(String name)
    {
        ModelFile swordParent = getExistingFile(mcLoc("minecraft:item/iron_sword"));
        ModelFile shovelParent = getExistingFile(mcLoc("minecraft:item/iron_shovel"));
        ModelFile pickaxeParent = getExistingFile(mcLoc("minecraft:item/iron_pickaxe"));
        ModelFile axeParent = getExistingFile(mcLoc("minecraft:item/iron_axe"));
        ModelFile hoeParent = getExistingFile(mcLoc("minecraft:item/iron_hoe"));

        return new ItemModelBuilder[]{
                builder(swordParent, name + "_sword"),
                builder(shovelParent, name + "_shovel"),
                builder(pickaxeParent, name + "_pickaxe"),
                builder(axeParent, name + "_axe"),
                builder(hoeParent, name + "_hoe")
        };
    }

    private ItemModelBuilder[] buildersArmor(String name)
    {
        ModelFile helmetParent = getExistingFile(mcLoc("minecraft:item/iron_helmet"));
        ModelFile chestplateParent = getExistingFile(mcLoc("minecraft:item/iron_chestplate"));
        ModelFile leggingsParent = getExistingFile(mcLoc("minecraft:item/iron_leggings"));
        ModelFile bootsParent = getExistingFile(mcLoc("minecraft:item/iron_boots"));

        return new ItemModelBuilder[]{
                builder(helmetParent, name + "_helmet"),
                builder(chestplateParent, name + "_chestplate"),
                builder(leggingsParent, name + "_leggings"),
                builder(bootsParent, name + "_boots")
        };
    }

    private ItemModelBuilder builder(ModelFile parent, String name) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }
}
