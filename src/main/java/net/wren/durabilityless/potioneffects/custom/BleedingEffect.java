package net.wren.durabilityless.potioneffects.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BleedingEffect extends StatusEffect {
    public BleedingEffect() {
        super(StatusEffectCategory.HARMFUL, 0xFF0000);
    }

    private int ticks = 0;

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        ticks++;
        if (ticks >= 20) {
            float damage = amplifier + 0.5f;
            entity.damage(entity.getDamageSources().magic(), damage);
            ticks = 0;
        }
    }
}
