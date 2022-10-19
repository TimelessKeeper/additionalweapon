package com.timelesskeeper.additionalweapon;

import com.mojang.logging.LogUtils;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AdditionalWeapon.MOD_ID)
public class AdditionalWeapon
{
    public static final String MOD_ID= "additionalweapon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AdditionalWeapon()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
