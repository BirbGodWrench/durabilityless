package net.wren.durabilityless.entities.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.DurabilityLess;
import net.wren.durabilityless.entities.custom.KunaiEntity;


@Environment(value= EnvType.CLIENT)
public class KunaiEntityRenderer extends ProjectileEntityRenderer<KunaiEntity> {


    public KunaiEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(KunaiEntity entity) {
        return new Identifier(DurabilityLess.MOD_ID,"textures/entity/kunai.png");
    }
}
