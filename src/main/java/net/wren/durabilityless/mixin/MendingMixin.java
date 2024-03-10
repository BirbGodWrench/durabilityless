package net.wren.durabilityless.mixin;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MendingEnchantment.class)
public class MendingMixin extends Enchantment {
    protected MendingMixin(Rarity weight, EnchantmentTarget target, EquipmentSlot[] slotTypes) {
        super(weight, target, slotTypes);
    }

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public int getMinPower(int level) {
        return -1;
    }

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public int getMaxPower(int level) {
        return -1;
    }


    public int getMaxLevel() {
        return -1;
    }


    public boolean isAcceptableItem(ItemStack stack) {
        return false;
    }
    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public boolean isTreasure() {
        return false;
    }
}
