package net.wren.durabilityless.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SoulScytheItem extends LivingSwordItem {
    public SoulScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        setXP(stack, getXP(stack) + 1);
        return super.postHit(stack, target, attacker);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        int currentXP = getXP(stack);
        if (currentXP >= 500) {
            setXP(stack, currentXP - 100);
            return new TypedActionResult<>(ActionResult.SUCCESS, stack);
        } else {
            return new TypedActionResult<>(ActionResult.FAIL, stack);
        }
    }
}