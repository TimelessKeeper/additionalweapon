package com.timelesskeeper.additionalweapon.data.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class WeaponAttributeBuilder {
    @Nullable private String parent;
    private Boolean hasAttribute;
    @Nullable private Double attack_range;
    @Nullable private String pose;
    @Nullable private String off_hand_pose;
    @Nullable private Boolean two_handed;
    @Nullable private String category;
    private WeaponAttackBuilder[] attacks;

    public WeaponAttributeBuilder() {
        this.parent = null;
        this.hasAttribute = false;
        this.attack_range = null;
        this.pose = null;
        this.off_hand_pose = null;
        this.two_handed = null;
        this.category = null;
        this.attacks  = new WeaponAttackBuilder[]{};
    }

    public WeaponAttributeBuilder parent(String parent) {
        this.parent = parent;
        return this;
    }

    public WeaponAttributeBuilder attack_range(double attack_range) {
        this.hasAttribute = true;
        this.attack_range = attack_range;
        return this;
    }

    public WeaponAttributeBuilder pose(String pose) {
        this.hasAttribute = true;
        this.pose = pose;
        return this;
    }

    public WeaponAttributeBuilder off_hand_pose(String off_hand_pose) {
        this.hasAttribute = true;
        this.off_hand_pose = off_hand_pose;
        return this;
    }

    public WeaponAttributeBuilder two_handed(Boolean two_handed) {
        this.hasAttribute = true;
        this.two_handed = two_handed;
        return this;
    }

    public WeaponAttributeBuilder category(String category) {
        this.hasAttribute = true;
        this.category = category;
        return this;
    }

    public WeaponAttributeBuilder attack(WeaponAttackBuilder attack) {
        this.hasAttribute = true;
        this.attacks = ArrayUtils.add(this.attacks, attack);
        return this;
    }

    public void save(Consumer<FinishedWeaponAttribute> pFinishedWeaponAttributeConsumer, ResourceLocation pRecipeId) {
        pFinishedWeaponAttributeConsumer.accept(new WeaponAttributeBuilder.Result(pRecipeId, this.parent, this.hasAttribute, this.attack_range, this.pose,
                this.off_hand_pose, this.two_handed, this.category, this.attacks));
    }

    public static class Result implements FinishedWeaponAttribute {
        public final ResourceLocation id;
        @Nullable private String parent;
        private Boolean hasAttribute;
        @Nullable private Double attack_range;
        @Nullable private String pose;
        @Nullable private String off_hand_pose;
        @Nullable private Boolean two_handed;
        @Nullable private String category;
        private WeaponAttackBuilder[] attacks;

        public Result(ResourceLocation pId, @Nullable String pParent, Boolean pHasAttribute, @Nullable Double pAttackRange, @Nullable String pPose,
                      String pOffHandPose, @Nullable Boolean pTwoHanded, @Nullable String pCategory, WeaponAttackBuilder[] pAttacks) {
            id = pId;
            parent = pParent;
            hasAttribute = pHasAttribute;
            attack_range = pAttackRange;
            pose = pPose;
            off_hand_pose = pOffHandPose;
            two_handed = pTwoHanded;
            category = pCategory;
            attacks = pAttacks;
        }

        public ResourceLocation getId() {
            return this.id;
        }

        public JsonObject serialize() {
            JsonObject json = new JsonObject();

            if (this.parent != null) { json.addProperty("parent", this.parent); }
            if (hasAttribute) { json.add("attributes", attributesSerialize()); }

            return json;
        }

        private JsonObject attributesSerialize() {
            JsonObject json = new JsonObject();

            if (this.attack_range != null) { json.addProperty("attack_range", this.attack_range); }
            if (this.pose != null) { json.addProperty("pose", this.pose); }
            if (this.off_hand_pose != null) { json.addProperty("off_hand_pose", this.off_hand_pose); }
            if (this.two_handed != null) {  json.addProperty("two_handed", this.two_handed); }
            if (this.category != null) { json.addProperty("category", this.category); }

            if (!ArrayUtils.isEmpty(this.attacks)) {
                JsonArray attacks = new JsonArray();
                for (WeaponAttackBuilder t : this.attacks) { attacks.add(t.serialize()); }
                json.add("attacks", attacks);
            }

            return json;
        }
    }
}