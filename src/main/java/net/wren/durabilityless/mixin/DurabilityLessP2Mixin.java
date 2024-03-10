package net.wren.durabilityless.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Item.class)
public class DurabilityLessP2Mixin {

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public final int getMaxDamage() {
        return 0;
    }

    /**
     * @author Wren
     * @reason no
     */
    @Overwrite
    public boolean isDamageable() {
        return false;
    }
/**
 * @author Wren
 * @reason no
 */
    @Overwrite
    public boolean isEnchantable(ItemStack stack) {
        return stack.getItem().getMaxCount() == 1;
    }
}
