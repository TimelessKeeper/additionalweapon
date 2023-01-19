package com.timelesskeeper.additionalweapon.api.items;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.config.CommonConfig;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.crafting.Ingredient;

public class ConfigArmorMaterial implements IConfigArmorMaterial {
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private boolean enable;
    private final int[] durabilityAddition;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    public ConfigArmorMaterial(IConfigArmorMaterial pTier) {
        this.name = pTier.getMaterial();
        this.durabilityMultiplier = pTier.getDurabilityMultiplier();
        this.enable = CommonConfig.MATERIALS.get(this.name).ENABLER.get();

        if (CommonConfig.MATERIALS.containsKey(this.name)) {
            this.durabilityAddition = new int[] {
                    CommonConfig.MATERIALS.get(this.name).ARMOR.HELMET_PROT_MOD.get(),
                    CommonConfig.MATERIALS.get(this.name).ARMOR.CHESTPLATE_PROT_MOD.get(),
                    CommonConfig.MATERIALS.get(this.name).ARMOR.LEGGINGS_PROT_MOD.get(),
                    CommonConfig.MATERIALS.get(this.name).ARMOR.BOOTS_PROT_MOD.get()
            };
            this.slotProtections = new int[] {
                    pTier.getSlotProtections()[0] + CommonConfig.MATERIALS.get(this.name).ARMOR.HELMET_PROT_MOD.get(),
                    pTier.getSlotProtections()[1] + CommonConfig.MATERIALS.get(this.name).ARMOR.CHESTPLATE_PROT_MOD.get(),
                    pTier.getSlotProtections()[2] + CommonConfig.MATERIALS.get(this.name).ARMOR.LEGGINGS_PROT_MOD.get(),
                    pTier.getSlotProtections()[3] + CommonConfig.MATERIALS.get(this.name).ARMOR.BOOTS_PROT_MOD.get()
            };
            this.enchantmentValue = pTier.getEnchantmentValue() + CommonConfig.MATERIALS.get(this.name).ARMOR.ENCHANT_MOD.get();
            this.toughness = (float)(pTier.getToughness() + CommonConfig.MATERIALS.get(this.name).ARMOR.TOUGHNESS_MOD.get());
            this.knockbackResistance = (float)(pTier.getKnockbackResistance() + CommonConfig.MATERIALS.get(this.name).ARMOR.KNOCKBACK_RES_MOD.get());
        } else {
            this.durabilityAddition = new int[] {0, 0, 0, 0};
            this.slotProtections = pTier.getSlotProtections();
            this.enchantmentValue = pTier.getEnchantmentValue();
            this.toughness = pTier.getToughness();
            this.knockbackResistance = pTier.getKnockbackResistance();
        }
        this.sound = pTier.getEquipSound();
        this.repairIngredient = new LazyLoadedValue<>(() -> pTier.getRepairIngredient());
    }

    public String getName() {
        return AdditionalWeapon.MOD_ID + ":" + this.name;
    }

    public String getMaterial() {
        return this.name;
    }

    @Override
    public boolean getEnable() {
        return this.enable;
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier + this.durabilityAddition[pSlot.getIndex()];
    }

    @Override
    public int getDurabilityMultiplier() {
        return this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    @Override
    public int[] getSlotProtections() {
        return this.slotProtections;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
