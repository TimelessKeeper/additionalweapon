package com.timelesskeeper.additionalweapon.api.data;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class BaseItemModelProvider extends ItemModelProvider {
    public BaseItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AdditionalWeapon.MOD_ID, existingFileHelper);
    }

    protected ItemModelBuilder[] builders(String name)
    {
        ModelFile greatswordParent = getModedModelFile("iron_greatsword");
        ModelFile scimitarParent = getModedModelFile("iron_scimitar");
        ModelFile katanaParent = getModedModelFile("iron_katana");
        ModelFile greataxeParent = getModedModelFile("iron_greataxe");
        ModelFile spearParent = getModedModelFile("iron_spear");
        ModelFile halberdParent = getModedModelFile("iron_halberd");
        ModelFile glaiveParent = getModedModelFile("iron_glaive");
        ModelFile battlestaffParent = getModedModelFile("iron_battlestaff");

        return new ItemModelBuilder[]{
                builder(greatswordParent, name + "_greatsword"),
                builder(scimitarParent, name + "_scimitar"),
                builder(katanaParent, name + "_katana"),
                builder(greataxeParent, name + "_greataxe"),
                builder(spearParent, name + "_spear"),
                builder(halberdParent, name + "_halberd"),
                builder(glaiveParent, name + "_glaive"),
                builder(battlestaffParent, name + "_battlestaff")
        };
    }

    protected ItemModelBuilder[] buildersVanilla(String name)
    {
        ModelFile swordParent = getVanillaModelFile("iron_sword");
        ModelFile shovelParent = getVanillaModelFile("iron_shovel");
        ModelFile pickaxeParent = getVanillaModelFile("iron_pickaxe");
        ModelFile axeParent = getVanillaModelFile("iron_axe");
        ModelFile hoeParent = getVanillaModelFile("iron_hoe");

        return new ItemModelBuilder[]{
                builder(swordParent, name + "_sword"),
                builder(shovelParent, name + "_shovel"),
                builder(pickaxeParent, name + "_pickaxe"),
                builder(axeParent, name + "_axe"),
                builder(hoeParent, name + "_hoe")
        };
    }

    protected ItemModelBuilder[] buildersArmor(String name)
    {
        ModelFile helmetParent = getVanillaModelFile("iron_helmet");
        ModelFile chestplateParent = getVanillaModelFile("iron_chestplate");
        ModelFile leggingsParent = getVanillaModelFile("iron_leggings");
        ModelFile bootsParent = getVanillaModelFile("iron_boots");

        return new ItemModelBuilder[]{
                builder(helmetParent, name + "_helmet"),
                builder(chestplateParent, name + "_chestplate"),
                builder(leggingsParent, name + "_leggings"),
                builder(bootsParent, name + "_boots")
        };
    }

    protected ItemModelBuilder builder(String name) {
        return getBuilder(name).parent(getExistingFile(mcLoc("minecraft:item/generated")))
                .texture("layer0", "item/" + name);
    }

    protected ItemModelBuilder builder(ModelFile parent, String name) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }

    protected  ModelFile getModedModelFile(String name) {
        return  getExistingFile(mcLoc(AdditionalWeapon.MOD_ID + ":item/" + name));
    }

    protected  ModelFile getVanillaModelFile(String name) {
        return  getExistingFile(mcLoc("minecraft:item/" + name));
    }
}
