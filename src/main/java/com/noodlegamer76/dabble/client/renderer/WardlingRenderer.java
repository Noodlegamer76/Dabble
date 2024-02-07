package com.noodlegamer76.dabble.client.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.client.model.ModModelLayers;
import com.noodlegamer76.dabble.client.model.WardlingModel;
import com.noodlegamer76.dabble.entity.entities.WardlingEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class WardlingRenderer extends MobRenderer<WardlingEntity, WardlingModel<WardlingEntity>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(DabbleMod.MODID, "textures/entity/wardling.png");
    public WardlingRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new WardlingModel<>(pContext.bakeLayer(ModModelLayers.WARDLING_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(WardlingEntity pEntity) {
            return TEXTURE;
    }

    @Nullable
    @Override
    protected RenderType getRenderType(WardlingEntity pLivingEntity, boolean pBodyVisible, boolean pTranslucent, boolean pGlowing) {
        return ModRenderTypes.TEST_RENDERER;
    }

    @Override
    public void render(WardlingEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
