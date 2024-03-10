package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;

public class VampiricEnchant extends Enchantment {
    public VampiricEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, slotTypes);
    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        user.heal(2);
        super.onTargetDamaged(user, target, level);
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || stack.getItem() instanceof AxeItem ||
                stack.getItem() instanceof TridentItem || stack.getItem() instanceof CrossbowItem ||
                stack.getItem() instanceof BowItem;
    }
}
