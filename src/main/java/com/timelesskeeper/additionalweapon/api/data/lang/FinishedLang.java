package com.timelesskeeper.additionalweapon.api.data.lang;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;

public interface FinishedLang {
    ResourceLocation getId();

    JsonObject serialize();
}
