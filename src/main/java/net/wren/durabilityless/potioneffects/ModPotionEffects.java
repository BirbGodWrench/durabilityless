package net.wren.durabilityless.potioneffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.potioneffects.custom.BleedingEffect;
import net.wren.durabilityless.potioneffects.custom.FrostPotionEffect;
import net.wren.durabilityless.potioneffects.custom.RuinedDefensesPotionEffect;
import net.wren.durabilityless.potioneffects.custom.WraithEffect;

import static net.wren.durabilityless.DurabilityLess.MOD_ID;

public class ModPotionEffects {
    public static final StatusEffect FROST = new FrostPotionEffect();
    public static final StatusEffect RUINEDDEFENSES = new RuinedDefensesPotionEffect();
    public static final StatusEffect BLEEDING = new BleedingEffect();
    public static final StatusEffect WRAITH = new WraithEffect();

    public static void RegisterStatusEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "frost"),
                FROST);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "ruineddefenses"),
                RUINEDDEFENSES);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "bleeding"),
                BLEEDING);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "wraith"),
                WRAITH);
    }
}
