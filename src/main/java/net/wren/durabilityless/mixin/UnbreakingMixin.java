package net.wren.durabilityless.mixin;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UnbreakingEnchantment.class)
public class UnbreakingMixin extends Enchantment {
    protected UnbreakingMixin(Rarity weight, EnchantmentTarget target, EquipmentSlot[] slotTypes) {
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


    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public int getMaxLevel() {
        return -1;
    }

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public boolean isAcceptableItem(ItemStack stack) {
        return false;
    }

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public static boolean shouldPreventDamage(ItemStack item, int level, Random random) {
        return false;
    }
}
