package com.timelesskeeper.additionalweapon.api.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.timelesskeeper.additionalweapon.config.CommonConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;

public class ConfigSwordItem extends SwordItem implements IConfigItem {
    private final IConfigTier tier;
    private final float attackDamage;
    private final float attackSpeed;

    public ConfigSwordItem(IConfigTier pTier, float pAttackDamage, float pAttackSpeed, Properties pProperties) {
        super(pTier, (int)pAttackDamage, pAttackSpeed, pProperties);
        this.tier = pTier;
        this.attackDamage = pAttackDamage;
        this.attackSpeed = pAttackSpeed;
    }

    @Override
    public Tier getTier() {
        return new ConfigTier(this.tier);
    }

    @Override
    public String getTierName() {
        return this.tier.getName();
    }

    public float getAttackDamage() {
        return this.attackDamage + this.getTier().getAttackDamageBonus();
    }

    public float getAttackSpeed() { return this.attackSpeed; }

    @Override
    public int getMaxDamage(ItemStack pStack) {
        return this.getTier().getUses();
    }

    @Override
    public int getEnchantmentValue() {
        return this.getTier().getEnchantmentValue();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
        if (pEquipmentSlot == EquipmentSlot.MAINHAND) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier",
                    getAttackDamage(), AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier",
                    getAttackSpeed(), AttributeModifier.Operation.ADDITION));
            return builder.build();
        } else {
            return super.getDefaultAttributeModifiers(pEquipmentSlot);
        }
    }

    public boolean weaponEnable() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return ((ConfigTier)this.getTier()).getEnable() && weaponEnable();
    }
}
