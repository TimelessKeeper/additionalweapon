package com.timelesskeeper.additionalweapon.data;

import com.timelesskeeper.additionalweapon.data.custom.BetterCombatDataProvider;
import com.timelesskeeper.additionalweapon.data.custom.FinishedWeaponAttribute;
import com.timelesskeeper.additionalweapon.data.custom.WeaponAttackBuilder;
import com.timelesskeeper.additionalweapon.data.custom.WeaponAttributeBuilder;
import com.timelesskeeper.additionalweapon.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class ModWeaponAttributeProvider extends BetterCombatDataProvider {
    public ModWeaponAttributeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildBetterCombatData(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer) {

        // greatsword
        greatsword(pWeaponAttributeConsumer, ModItems.DIAMOND_GREATSWORD);
        greatsword(pWeaponAttributeConsumer, ModItems.GOLDEN_GREATSWORD);
        greatsword(pWeaponAttributeConsumer, ModItems.IRON_GREATSWORD);
        greatsword(pWeaponAttributeConsumer, ModItems.NETHERITE_GREATSWORD);
        greatsword(pWeaponAttributeConsumer, ModItems.STONE_GREATSWORD);
        greatsword(pWeaponAttributeConsumer, ModItems.WOODEN_GREATSWORD);

        // scimitar
        scimitar(pWeaponAttributeConsumer, ModItems.DIAMOND_SCIMITAR);
        scimitar(pWeaponAttributeConsumer, ModItems.GOLDEN_SCIMITAR);
        scimitar(pWeaponAttributeConsumer, ModItems.IRON_SCIMITAR);
        scimitar(pWeaponAttributeConsumer, ModItems.NETHERITE_SCIMITAR);
        scimitar(pWeaponAttributeConsumer, ModItems.STONE_SCIMITAR);
        scimitar(pWeaponAttributeConsumer, ModItems.WOODEN_SCIMITAR);

        // katana
        katana(pWeaponAttributeConsumer, ModItems.DIAMOND_KATANA);
        katana(pWeaponAttributeConsumer, ModItems.GOLDEN_KATANA);
        katana(pWeaponAttributeConsumer, ModItems.IRON_KATANA);
        katana(pWeaponAttributeConsumer, ModItems.NETHERITE_KATANA);
        katana(pWeaponAttributeConsumer, ModItems.STONE_KATANA);
        katana(pWeaponAttributeConsumer, ModItems.WOODEN_KATANA);

        // greataxe
        greataxe(pWeaponAttributeConsumer, ModItems.DIAMOND_GREATAXE);
        greataxe(pWeaponAttributeConsumer, ModItems.GOLDEN_GREATAXE);
        greataxe(pWeaponAttributeConsumer, ModItems.IRON_GREATAXE);
        greataxe(pWeaponAttributeConsumer, ModItems.NETHERITE_GREATAXE);
        greataxe(pWeaponAttributeConsumer, ModItems.STONE_GREATAXE);
        greataxe(pWeaponAttributeConsumer, ModItems.WOODEN_GREATAXE);

        // spear
        spear(pWeaponAttributeConsumer, ModItems.DIAMOND_SPEAR);
        spear(pWeaponAttributeConsumer, ModItems.GOLDEN_SPEAR);
        spear(pWeaponAttributeConsumer, ModItems.IRON_SPEAR);
        spear(pWeaponAttributeConsumer, ModItems.NETHERITE_SPEAR);
        spear(pWeaponAttributeConsumer, ModItems.STONE_SPEAR);
        spear(pWeaponAttributeConsumer, ModItems.WOODEN_SPEAR);

        // halberd
        halberd(pWeaponAttributeConsumer, ModItems.DIAMOND_HALBERD);
        halberd(pWeaponAttributeConsumer, ModItems.GOLDEN_HALBERD);
        halberd(pWeaponAttributeConsumer, ModItems.IRON_HALBERD);
        halberd(pWeaponAttributeConsumer, ModItems.NETHERITE_HALBERD);
        halberd(pWeaponAttributeConsumer, ModItems.STONE_HALBERD);
        halberd(pWeaponAttributeConsumer, ModItems.WOODEN_HALBERD);

        // glaive
        glaive(pWeaponAttributeConsumer, ModItems.DIAMOND_GLAIVE);
        glaive(pWeaponAttributeConsumer, ModItems.GOLDEN_GLAIVE);
        glaive(pWeaponAttributeConsumer, ModItems.IRON_GLAIVE);
        glaive(pWeaponAttributeConsumer, ModItems.NETHERITE_GLAIVE);
        glaive(pWeaponAttributeConsumer, ModItems.STONE_GLAIVE);
        glaive(pWeaponAttributeConsumer, ModItems.WOODEN_GLAIVE);

        // battlestaff
        battlestaff(pWeaponAttributeConsumer, ModItems.DIAMOND_BATTLESTAFF);
        battlestaff(pWeaponAttributeConsumer, ModItems.GOLDEN_BATTLESTAFF);
        battlestaff(pWeaponAttributeConsumer, ModItems.IRON_BATTLESTAFF);
        battlestaff(pWeaponAttributeConsumer, ModItems.NETHERITE_BATTLESTAFF);
        battlestaff(pWeaponAttributeConsumer, ModItems.STONE_BATTLESTAFF);
        battlestaff(pWeaponAttributeConsumer, ModItems.WOODEN_BATTLESTAFF);

        // Copper - Minecraft
        sword(pWeaponAttributeConsumer, ModItems.COPPER_SWORD);
        greatsword(pWeaponAttributeConsumer, ModItems.COPPER_GREATSWORD);
        scimitar(pWeaponAttributeConsumer, ModItems.COPPER_SCIMITAR);
        katana(pWeaponAttributeConsumer, ModItems.COPPER_KATANA);
        greataxe(pWeaponAttributeConsumer, ModItems.COPPER_GREATAXE);
        spear(pWeaponAttributeConsumer, ModItems.COPPER_SPEAR);
        halberd(pWeaponAttributeConsumer, ModItems.COPPER_HALBERD);
        glaive(pWeaponAttributeConsumer, ModItems.COPPER_GLAIVE);
        battlestaff(pWeaponAttributeConsumer, ModItems.COPPER_BATTLESTAFF);
    }

    private void sword(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:sword").save(pWeaponAttributeConsumer, item.getId());
    }

    private void greatsword(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:claymore").save(pWeaponAttributeConsumer, item.getId());
    }

    private void greataxe(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:heavy_axe").save(pWeaponAttributeConsumer, item.getId());
    }

    private void scimitar(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:cutlass").save(pWeaponAttributeConsumer, item.getId());
    }

    private void katana(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:katana").save(pWeaponAttributeConsumer, item.getId());
    }

    private void spear(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:spear")
                .two_handed(false)
                .attack(new WeaponAttackBuilder().animation("bettercombat:one_handed_stab"))
                .save(pWeaponAttributeConsumer, item.getId());
    }

    private void halberd(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:halberd").save(pWeaponAttributeConsumer, item.getId());
    }

    private void glaive(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:glaive").save(pWeaponAttributeConsumer, item.getId());
    }

    private void battlestaff(Consumer<FinishedWeaponAttribute> pWeaponAttributeConsumer, RegistryObject<Item> item)
    {
        new WeaponAttributeBuilder().parent("bettercombat:battlestaff").save(pWeaponAttributeConsumer, item.getId());
    }
}
