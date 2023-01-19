package com.timelesskeeper.additionalweapon;

import com.mojang.logging.LogUtils;
import com.timelesskeeper.additionalweapon.api.crafting.ConfigEnableCondition;
import com.timelesskeeper.additionalweapon.config.CommonConfig;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.crafting.CraftingHelper;
import org.slf4j.Logger;

@Mod(AdditionalWeapon.MOD_ID)
public class AdditionalWeapon
{
    public static final String MOD_ID = "additionalweapon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdditionalWeapon()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC, "additionalweapon-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }
}
