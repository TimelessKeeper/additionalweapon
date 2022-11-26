
package com.timelesskeeper.additionalweapon.data.custom;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;

public interface FinishedWeaponAttribute {
    ResourceLocation getId();

    String getPath();

    JsonObject serialize();
}