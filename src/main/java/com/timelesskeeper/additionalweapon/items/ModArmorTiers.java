package com.timelesskeeper.additionalweapon.items;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum ModArmorTiers implements ArmorMaterial {
    TIN(AdditionalWeapon.MOD_ID + ":tin", 8, new int[]{2, 3, 5, 2},
            22, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(ModTags.INGOTS_TIN)),
    ZINC(AdditionalWeapon.MOD_ID + ":zinc", 9, new int[]{2, 3, 5, 2},
            20, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(ModTags.INGOTS_ZINC)),
    COPPER(AdditionalWeapon.MOD_ID + ":copper", 11, new int[]{2, 4, 6, 2},
            18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(Tags.Items.INGOTS_COPPER)),
    BRASS(AdditionalWeapon.MOD_ID + ":brass", 11, new int[]{2, 4, 6, 2},
            18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(ModTags.INGOTS_BRASS)),
    BRONZE(AdditionalWeapon.MOD_ID + ":bronze", 13, new int[]{2, 5, 6, 2},
            16, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
            () -> Ingredient.of(ModTags.INGOTS_BRONZE)),
    ROSEGOLD(AdditionalWeapon.MOD_ID + ":rosegold", 11, new int[]{2, 4, 5, 2},
            22, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.of(ModTags.INGOTS_ROSEGOLD)),
    STEEL(AdditionalWeapon.MOD_ID + ":steel", 20, new int[]{2, 5, 7, 3},
            10, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F,
            () -> Ingredient.of(ModTags.INGOTS_STEEL));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorTiers(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}