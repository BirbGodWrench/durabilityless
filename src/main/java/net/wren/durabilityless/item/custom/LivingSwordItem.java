package net.wren.durabilityless.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LivingSwordItem extends SwordItem {
    private static final String XP_KEY = "xp";

    public LivingSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of("XP: " + getXP(stack)));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        setXP(stack, getXP(stack));
        return super.postHit(stack, target, attacker);
    }

    public int getXP(ItemStack stack) {
        NbtCompound tag = stack.getOrCreateNbt();
        return tag.getInt(XP_KEY);
    }

    public void setXP(ItemStack stack, int xp) {
        NbtCompound tag = stack.getOrCreateNbt();
        tag.putInt(XP_KEY, xp);
    }
}
