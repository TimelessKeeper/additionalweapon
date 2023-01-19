package com.timelesskeeper.additionalweapon.api.items;

import com.timelesskeeper.additionalweapon.AdditionalWeapon;
import com.timelesskeeper.additionalweapon.config.CommonConfig;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.crafting.Ingredient;

public class ConfigTier implements IConfigTier {
    private final String name;
    private boolean enable;
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    public ConfigTier(IConfigTier pTier) {
        this.name = pTier.getName();

        if (CommonConfig.MATERIALS.containsKey(this.name)) {
            this.enable = CommonConfig.MATERIALS.get(this.name).ENABLER.get();
            this.level = pTier.getLevel() + CommonConfig.MATERIALS.get(this.name).TOOL.LEVEL_MOD.get();
            this.uses = pTier.getUses() + CommonConfig.MATERIALS.get(this.name).TOOL.USE_MOD.get();
            this.speed = (float)(pTier.getSpeed() + CommonConfig.MATERIALS.get(this.name).TOOL.BLOCK_SPEED_MOD.get());
            this.damage = (float)(pTier.getAttackDamageBonus() + CommonConfig.MATERIALS.get(this.name).TOOL.DAMAGE_MOD.get());
            this.enchantmentValue = pTier.getEnchantmentValue() + CommonConfig.MATERIALS.get(this.name).TOOL.ENCHANT_MOD.get();
        } else {
            this.enable = true;
            this.level = pTier.getLevel();
            this.uses = pTier.getUses();
            this.speed = pTier.getSpeed();
            this.damage = pTier.getAttackDamageBonus();
            this.enchantmentValue = pTier.getEnchantmentValue();
        }

        this.repairIngredient = new LazyLoadedValue<>(() -> pTier.getRepairIngredient());
    }

    @Override
    public String getName() { return this.name; }

    @Override
    public boolean getEnable() {
        return this.enable;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
