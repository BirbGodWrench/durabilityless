package net.wren.durabilityless.mixin;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ItemStack.class)
public class DurabilityLessMixin {

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public boolean damage(int amount, Random random, @Nullable ServerPlayerEntity player) {
        return false;
    }
}
