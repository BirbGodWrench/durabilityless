package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.wren.durabilityless.item.custom.SoulScytheItem;

public class SharpSoulEnchant extends Enchantment {
    public SharpSoulEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.COMMON, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        return 1.0f + (float) Math.max(0, level - 1) * 0.5f;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SoulScytheItem;
    }
}