package net.wren.durabilityless.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import net.wren.durabilityless.potioneffects.ModPotionEffects;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Objects;

@Mixin(LivingEntity.class)

public abstract class RuinedDefensesMixin extends Entity {


    @Shadow
    public abstract boolean hasStatusEffect(StatusEffect effect);

    @Shadow
    @Nullable
    public abstract StatusEffectInstance getStatusEffect(StatusEffect effect);

    @Shadow
    public abstract boolean damage(DamageSource source, float amount);


    public RuinedDefensesMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {

    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {

    }

    @ModifyVariable(method = "damage", at = @At("HEAD"), argsOnly = true)
    public float multiplyDamageForRuinedDefenses(float amount) {
        if (this.hasStatusEffect(ModPotionEffects.RUINEDDEFENSES)) {
            return amount + (amount * (0.25f * (Objects.requireNonNull(this.getStatusEffect(ModPotionEffects.RUINEDDEFENSES)).getAmplifier() + 1)));
        }
        return amount;
    }
}
