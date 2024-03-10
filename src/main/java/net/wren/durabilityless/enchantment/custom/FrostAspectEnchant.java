package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.wren.durabilityless.potioneffects.ModPotionEffects;

public class FrostAspectEnchant extends Enchantment {
    public FrostAspectEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (EnchantmentHelper.getLevel(Enchantments.FIRE_ASPECT, user.getActiveItem()) > 0) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(
                    ModPotionEffects.FROST, 120, level));

        } else {
            if (target instanceof LivingEntity) {
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(
                        ModPotionEffects.FROST, 120, level));
            }
            super.onTargetDamaged(user, target, level);
        }
    }
    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || stack.getItem() instanceof AxeItem;
    }
}