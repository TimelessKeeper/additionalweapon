package com.timelesskeeper.additionalweapon.api.items.impl;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.timelesskeeper.additionalweapon.api.items.ConfigTier;
import com.timelesskeeper.additionalweapon.api.items.IConfigItem;
import com.timelesskeeper.additionalweapon.api.items.IConfigTier;
import com.timelesskeeper.additionalweapon.config.CommonConfig;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ConfigAxeItem extends AxeItem implements IConfigItem {
    private final IConfigTier tier;
    private final TagKey<Block> blocks;
    private final float attackDamage;
    private final float attackSpeed;

    public ConfigAxeItem(IConfigTier pTier, Properties pProperties) {
        super(pTier, 6.5F, -3.15F, pProperties);
        this.tier = pTier;
        this.blocks = BlockTags.MINEABLE_WITH_AXE;
        this.attackDamage = 6.5F;
        this.attackSpeed = -3.15F;
    }

    @Override
    public Tier getTier() {
        return new ConfigTier(this.tier);
    }

    @Override
    public String getTierName() {
        return this.tier.getName();
    }

    @Override
    public boolean isEnabled() {
        return ((ConfigTier)this.getTier()).getEnable();
    }

    public float getAttackDamage() {
        return this.attackDamage + this.getTier().getAttackDamageBonus();
    }

    public float getAttackSpeed() { return this.attackSpeed; }

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

    @Override
    public float getDestroySpeed(ItemStack pStack, BlockState pState) {
        return pState.is(this.blocks) ? this.speed + this.tier.getSpeed() : 1.0F;
    }

    @Override
    public int getMaxDamage(ItemStack pStack) {
        return this.getTier().getUses();
    }

    @Override
    public int getEnchantmentValue() {
        return this.getTier().getEnchantmentValue();
    }
}
