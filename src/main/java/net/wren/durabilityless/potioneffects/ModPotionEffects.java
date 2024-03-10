package net.wren.durabilityless.potioneffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.potioneffects.custom.BleedingEffect;
import net.wren.durabilityless.potioneffects.custom.FrostPotionEffect;
import net.wren.durabilityless.potioneffects.custom.RuinedDefensesPotionEffect;

import static net.wren.durabilityless.DurabilityLess.MOD_ID;

public class ModPotionEffects {
    public static final StatusEffect FROST = new FrostPotionEffect();
    public static final StatusEffect RUINEDDEFENSES = new RuinedDefensesPotionEffect();
    public static final StatusEffect BLEEDING = new BleedingEffect();

    public static void RegisterStatusEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "frost"), FROST);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "ruineddefenses"), RUINEDDEFENSES);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "bleeding"), BLEEDING);
    }
}
