package com.timelesskeeper.additionalweapon.api.data;

import com.timelesskeeper.additionalweapon.api.data.bettercombat.BetterCombatDataProvider;
import com.timelesskeeper.additionalweapon.api.data.bettercombat.FinishedWeaponAttribute;
import com.timelesskeeper.additionalweapon.api.data.bettercombat.WeaponAttackBuilder;
import com.timelesskeeper.additionalweapon.api.data.bettercombat.WeaponAttributeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public abstract class BaseWeaponAttributeProvider extends BetterCombatDataProvider {
    public BaseWeaponAttributeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    protected void sword(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:sword").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void greatsword(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:claymore").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void greataxe(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:heavy_axe").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void scimitar(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:cutlass").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void katana(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:katana").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void spear(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:spear")
                .two_handed(false)
                .attack(new WeaponAttackBuilder().animation("bettercombat:one_handed_stab"))
                .save(pWeaponAttributeConsumer, item.getId());
    }

    protected void halberd(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:halberd").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void glaive(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:glaive").save(pWeaponAttributeConsumer, item.getId());
    }

    protected void battlestaff(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:battlestaff").save(pWeaponAttributeConsumer, item.getId());
    }
}
