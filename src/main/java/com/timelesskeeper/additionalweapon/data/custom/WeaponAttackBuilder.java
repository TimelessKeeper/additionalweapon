package com.timelesskeeper.additionalweapon.data.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.bettercombat.api.WeaponAttributes;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class WeaponAttackBuilder {

    private WeaponAttributes.Condition[] conditions;
    @Nullable private WeaponAttributes.HitBoxShape hitbox;
    @Nullable private Double damage_multiplier;
    @Nullable private Double angle;
    @Nullable private Double upswing;
    @Nullable private String animation;
    @Nullable private WeaponSoundBuilder swing_sound;
    @Nullable private WeaponSoundBuilder impact_sound;

    public WeaponAttackBuilder() {
        this.conditions = new WeaponAttributes.Condition[]{};
        this.hitbox = null;
        this.damage_multiplier = null;
        this.angle = null;
        this.upswing = null;
        this.animation = null;
        this.swing_sound = null;
        this.impact_sound = null;
    }

    public WeaponAttackBuilder condition(WeaponAttributes.Condition condition) {
        this.conditions = ArrayUtils.add(this.conditions, condition);
        return this;
    }

    public WeaponAttackBuilder hitbox(WeaponAttributes.HitBoxShape hitbox) {
        this.hitbox = hitbox;
        return this;
    }

    public WeaponAttackBuilder damage_multiplier(Double damage_multiplier) {
        this.damage_multiplier = damage_multiplier;
        return this;
    }

    public WeaponAttackBuilder angle(Double angle) {
        this.angle = angle;
        return this;
    }

    public WeaponAttackBuilder upswing(Double upswing) {
        this.upswing = upswing;
        return this;
    }

    public WeaponAttackBuilder animation(String animation) {
        this.animation = animation;
        return this;
    }

    public WeaponAttackBuilder swing_sound(WeaponSoundBuilder sound) {
        this.swing_sound = sound;
        return this;
    }

    public WeaponAttackBuilder impact_sound(WeaponSoundBuilder sound) {
        this.impact_sound = sound;
        return this;
    }

    public JsonObject serialize() {
        JsonObject json = new JsonObject();

        if (!ArrayUtils.isEmpty(this.conditions)) {
            JsonArray conditions = new JsonArray();
            for (WeaponAttributes.Condition t : this.conditions) { conditions.add(t.toString()); }
            json.add("conditions", conditions);
        }

        if (this.hitbox != null) { json.addProperty("hitbox", this.hitbox.toString()); }
        if (this.damage_multiplier != null) { json.addProperty("damage_multiplier", this.damage_multiplier); }
        if (this.angle != null) { json.addProperty("angle", this.angle); }
        if (this.upswing != null) { json.addProperty("upswing", this.upswing); }
        if (this.animation != null) { json.addProperty("animation", this.animation); }
        if (this.swing_sound != null) { json.add("swing_sound", this.swing_sound.serialize()); }
        if (this.impact_sound != null) { json.add("impact_sound", this.impact_sound.serialize()); }

        return json;
    }
}
