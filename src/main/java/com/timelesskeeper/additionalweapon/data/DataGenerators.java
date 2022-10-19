package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.data.client.ModItemModelProvider;
import com.timelesskeeper.additionalweapon.data.client.ModRecipeProvider;
import com.timelesskeeper.additionalweapon.data.client.WeaponAttributeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = AdditionalWeapon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
        gen.addProvider(new ModRecipeProvider(gen));
        gen.addProvider(new WeaponAttributeProvider(gen));
    }
}
