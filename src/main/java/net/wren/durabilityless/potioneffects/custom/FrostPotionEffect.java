package net.wren.durabilityless.potioneffects.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FrostPotionEffect extends StatusEffect {
    public FrostPotionEffect() {
        super(StatusEffectCategory.HARMFUL, 1693439);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.setFrozenTicks(800 * (amplifier + 1));
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.setFrozenTicks(0);
        super.onRemoved(entity, attributes, amplifier);
    }
}