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

        builders("copper"); // Minecraft
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

        return new ItemModelBuilder[]{
                builder(greatswordParent, name + "_greatsword"),
                builder(greataxeParent, name + "_greataxe"),
                builder(scimitarParent, name + "_scimitar"),
                builder(katanaParent, name + "_katana"),
                builder(spearParent, name + "_spear"),
                builder(halberdParent, name + "_halberd"),
                builder(glaiveParent, name + "_glaive")
        };
    }

    private ItemModelBuilder builder(ModelFile parent, String name) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }
}
