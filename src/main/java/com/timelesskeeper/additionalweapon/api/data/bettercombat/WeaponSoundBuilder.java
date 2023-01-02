package com.timelesskeeper.additionalweapon.api.data.bettercombat;

import com.google.gson.JsonObject;

import javax.annotation.Nullable;

public class WeaponSoundBuilder {
    private String id;
    @Nullable private Float volume;
    @Nullable private Float pitch;
    @Nullable private Float randomness;

    public WeaponSoundBuilder(String id) {
        this.id = id;
    }

    public WeaponSoundBuilder volume(float volume) {
        this.volume = volume;
        return this;
    }

    public WeaponSoundBuilder pitch(float pitch) {
        this.pitch = pitch;
        return this;
    }

    public WeaponSoundBuilder randomness(float randomness) {
        this.randomness = randomness;
        return this;
    }

    public JsonObject serialize() {
        JsonObject json = new JsonObject();

        json.addProperty("id", id);
        if (volume != null) { json.addProperty("volume", volume); }
        if (pitch != null) { json.addProperty("pitch", pitch); }
        if (randomness != null) { json.addProperty("randomness", randomness); }

        return json;
    }
}