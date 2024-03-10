package net.wren.durabilityless.entities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.DurabilityLess;
import net.wren.durabilityless.entities.custom.KunaiEntity;

public class ModEntities {

    public static final EntityType<KunaiEntity> KUNAI = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(DurabilityLess.MOD_ID, "kunai"),
            FabricEntityTypeBuilder.<KunaiEntity>create(SpawnGroup.MISC, KunaiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build());
}
