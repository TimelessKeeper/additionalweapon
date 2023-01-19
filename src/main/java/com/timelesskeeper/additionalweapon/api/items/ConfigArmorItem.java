package com.timelesskeeper.additionalweapon.api.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

import java.util.UUID;

public class ConfigArmorItem extends ArmorItem implements IConfigItem {
    private static final UUID[] ARMOR_MODIFIER_UUID_PER_SLOT = new UUID[]{
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
    };
    public ConfigArmorItem(IConfigArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public ArmorMaterial getMaterial() {
        return new ConfigArmorMaterial((IConfigArmorMaterial) this.material);
    }

    @Override
    public String getTierName() {
        return ((IConfigArmorMaterial) this.material).getMaterial();
    }

    @Override
    public boolean isEnabled() {
        return ((IConfigArmorMaterial)this.getMaterial()).getEnable();
    }

    @Override
    public int getMaxDamage(ItemStack pStack) {
        return this.getMaterial().getDurabilityForSlot(this.slot);
    }

    @Override
    public int getDefense() {
        return this.getMaterial().getDefenseForSlot(this.slot);
    }

    @Override
    public int getEnchantmentValue() {
        return this.getMaterial().getEnchantmentValue();
    }

    @Override
    public float getToughness() {
        return this.getMaterial().getToughness();
    }

    public float getKnockbackResistance() {
        return this.getMaterial().getKnockbackResistance();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
        if (pEquipmentSlot == this.slot) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            UUID uuid = ARMOR_MODIFIER_UUID_PER_SLOT[this.slot.getIndex()];
            builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier",
                    this.getDefense(), AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness",
                    this.getToughness(), AttributeModifier.Operation.ADDITION));
            if (this.getKnockbackResistance() > 0) {
                builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance",
                        this.getKnockbackResistance(), AttributeModifier.Operation.ADDITION));
            }
            return builder.build();
        } else {
            return super.getDefaultAttributeModifiers(pEquipmentSlot);
        }
    }
}
