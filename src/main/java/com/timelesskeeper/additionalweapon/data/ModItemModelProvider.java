package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.api.data.BaseItemModelProvider;
import com.timelesskeeper.additionalweapon.api.items.MaterialData;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends BaseItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (MaterialData data : ModItems.moddedMaterials) {
            if (data.getName() != "iron")
            {
                builders(data.getName());
                if (ModItems.vanillaMaterials.containsKey(data.getName())) {
                    AdditionalWeapon.LOGGER.info(data.getName());
                    buildersArmor(data.getName());
                    buildersVanilla(data.getName());
                }
            }
        }
    }
}
