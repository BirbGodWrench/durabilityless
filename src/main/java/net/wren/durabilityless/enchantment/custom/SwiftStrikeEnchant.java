package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

import java.util.UUID;

public class SwiftStrikeEnchant extends Enchantment {

    private static final double MAX_ATTACK_SPEED_MODIFIER = 2.0;

    public SwiftStrikeEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.VERY_RARE, EnchantmentTarget.WEAPON, slotTypes);
    }




    @Override
    public void onTargetDamaged(LivingEntity user, net.minecraft.entity.Entity target, int level) {
        if (user != null && target != null) {
            double attackSpeedModifier = 0.1 * level;
            user.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_SPEED)
                    .removeModifier(UUID.fromString("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa"));
            user.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_SPEED)
                    .addPersistentModifier(new EntityAttributeModifier(UUID.fromString("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa"), "SwiftStrike",
                            attackSpeedModifier, EntityAttributeModifier.Operation.ADDITION));
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem;
    }
}