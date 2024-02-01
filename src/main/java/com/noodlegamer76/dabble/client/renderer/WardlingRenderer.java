package com.noodlegamer76.dabble.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.client.model.ModModelLayers;
import com.noodlegamer76.dabble.client.model.WardlingModel;
import com.noodlegamer76.dabble.entity.entities.WardlingEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WardlingRenderer extends MobRenderer<WardlingEntity, WardlingModel<WardlingEntity>> {
    public WardlingRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new WardlingModel<>(pContext.bakeLayer(ModModelLayers.WARDLING_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(WardlingEntity pEntity) {
            return new ResourceLocation(DabbleMod.MODID, "textures/entity/wardling.png");
    }

    @Override
    public void render(WardlingEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
