package net.wren.durabilityless.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.enchantment.custom.*;

import static net.wren.durabilityless.DurabilityLess.MOD_ID;

public class ModEnchantments {

    public static final Enchantment FrostAspect = new FrostAspectEnchant(
            EquipmentSlot.MAINHAND);
    public static final Enchantment ProtectingBlade = new ProtectingBladeEnchant(
            EquipmentSlot.MAINHAND);
    public static final Enchantment Sniper = new SniperEnchant(
            EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND);
    public static final Enchantment SwiftStrike = new SwiftStrikeEnchant(
            EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND);
    public static final Enchantment SharpSoul = new SharpSoulEnchant(
            EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND);
    public static final Enchantment Vampiric = new VampiricEnchant(
            EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND);
    public static final Enchantment TrueThorns = new TrueThornsEnchant(
            EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.HEAD, EquipmentSlot.LEGS);
    public static final Enchantment SpeedyArmor = new SwiftnessEnchant(
            EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.HEAD, EquipmentSlot.LEGS);
    public static final Enchantment JaggedBlade = new JaggedBladeEnchant(
            EquipmentSlot.MAINHAND);


    public static void RegisterEnchants() {
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "frostaspect")
                , FrostAspect);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "protectingblade"),
                ProtectingBlade);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "sniper"),
                Sniper);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "swiftstrike"),
                SwiftStrike);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "truethorns"),
                TrueThorns);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "speedyarmor"),
                SpeedyArmor);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "sharpsoul"),
                SharpSoul);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "vampiric"),
                Vampiric);
        Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, "jaggedblade"),
                JaggedBlade);
    }
}