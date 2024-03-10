package net.wren.durabilityless;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.wren.durabilityless.entities.ModEntities;
import net.wren.durabilityless.entities.renderer.KunaiEntityRenderer;

public class DurabilityLessClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register your KunaiEntityRenderer with Fabric
        EntityRendererRegistry.register(ModEntities.KUNAI, KunaiEntityRenderer::new);
    }
}
