package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.api.data.BaseWeaponAttributeProvider;
import com.timelesskeeper.additionalweapon.api.data.bettercombat.FinishedWeaponAttribute;
import com.timelesskeeper.additionalweapon.api.items.MaterialData;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;

import java.util.function.Consumer;

public class ModWeaponAttributeProvider extends BaseWeaponAttributeProvider {
    public ModWeaponAttributeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildBetterCombatData(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer) {
        for (MaterialData data : ModItems.moddedMaterials) {
            weapons(pWeaponAttributeConsumer, data.getName());
        }
        ModItems.vanillaMaterials.forEach((name, tier) -> {
            sword(pWeaponAttributeConsumer, ModItems.SWORDS.get(name));
        });
    }

    private void weapons(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, String name) {
        greatsword(pWeaponAttributeConsumer, ModItems.GREATSWORDS.get(name));
        scimitar(pWeaponAttributeConsumer, ModItems.SCIMITARS.get(name));
        katana(pWeaponAttributeConsumer, ModItems.KATANAS.get(name));
        greataxe(pWeaponAttributeConsumer, ModItems.GREATAXES.get(name));
        spear(pWeaponAttributeConsumer, ModItems.SPEARS.get(name));
        halberd(pWeaponAttributeConsumer, ModItems.HALBERDS.get(name));
        glaive(pWeaponAttributeConsumer, ModItems.GLAIVES.get(name));
        battlestaff(pWeaponAttributeConsumer, ModItems.BATTLESTAFFS.get(name));
    }
}
