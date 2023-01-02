package com.timelesskeeper.additionalweapon.api.data.bettercombat;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;

public interface FinishedWeaponAttribute {
    ResourceLocation getId();

    JsonObject serialize();
}
