package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class ProtectingBladeEnchant extends Enchantment {
    public ProtectingBladeEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, slotTypes);
    }
    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if(user instanceof LivingEntity) {
            ((LivingEntity) user).addStatusEffect(new StatusEffectInstance(
                    StatusEffects.RESISTANCE,120, level - 1));
        }
        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || stack.getItem() instanceof AxeItem;
    }
}