package com.timelesskeeper.additionalweapon.api.crafting;

import com.mojang.logging.LogUtils;
import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = AdditionalWeapon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConditionRegisterEvent {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void registerSerializers(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.RECIPE_SERIALIZERS,
                helper -> CraftingHelper.register(ConfigEnableCondition.Serializer.INSTANCE)
        );
    }
}
