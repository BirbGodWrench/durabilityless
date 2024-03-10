package net.wren.durabilityless.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public class SniperEnchant extends Enchantment {

    public SniperEnchant(EquipmentSlot... slotTypes) {
        super(Rarity.UNCOMMON, EnchantmentTarget.CROSSBOW, slotTypes);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof CrossbowItem;
    }


    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        int Damage = 10;

        DamageSource customDamage = new DamageSource(RegistryEntry.of(new DamageType
                ("customdamage",1))) {};
        target.damage(customDamage,Damage);
        super.onTargetDamaged(user, target, level);
    }
}