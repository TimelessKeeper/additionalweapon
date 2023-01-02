package com.timelesskeeper.additionalweapon;

import com.mojang.logging.LogUtils;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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

        MinecraftForge.EVENT_BUS.register(this);
    }
}
