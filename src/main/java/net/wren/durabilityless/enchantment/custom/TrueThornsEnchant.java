package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;
import net.wren.durabilityless.potioneffects.ModPotionEffects;

import java.util.Map;

public class TrueThornsEnchant extends Enchantment {
    public TrueThornsEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR, slotTypes);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if (stack.getItem() instanceof ArmorItem) {
            return true;
        }
        return super.isAcceptableItem(stack);
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        Random random = user.getRandom();
        Map.Entry<EquipmentSlot, ItemStack> entry = EnchantmentHelper.chooseEquipmentWith(Enchantments.THORNS, user);
        if (attacker != null) {
            if (attacker.isLiving()) {
                LivingEntity LivingAttacker = (LivingEntity) attacker;
                LivingAttacker.setStatusEffect(new StatusEffectInstance(ModPotionEffects.RUINEDDEFENSES, 20, 1 * level - 1), user);
            }
        }
    }
    @Override
    public int getMaxLevel() {
        return 2;
    }
}