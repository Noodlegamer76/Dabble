package com.noodlegamer76.dabble.client.renderer;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.shaders.Shader;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.client.model.BlockModel;
import com.noodlegamer76.dabble.entity.BouncyBallEntity;
import com.noodlegamer76.dabble.entity.block.EndSkyEntity;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RegisterShadersEvent;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.lwjgl.opengl.GL11;

import java.util.UUID;

public class BouncyBallRenderer extends EntityRenderer<BouncyBallEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DabbleMod.MODID, "textures/block/pattern_wool.png");
    ModelPart model;

    public BouncyBallRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        model = pContext.bakeLayer(BlockModel.LAYER_LOCATION);
    }


    @Override
    public void render(BouncyBallEntity pEntity, float pEntityYaw, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.pushPose();
        pPoseStack.translate(0, -1.5, 0);
        model.render(pPoseStack, pBuffer.getBuffer(RenderType.entityCutout(TEXTURE)), pPackedLight, 0);
        pPoseStack.popPose();
    }

    @Override
    public ResourceLocation getTextureLocation(BouncyBallEntity pEntity) {
        return TEXTURE;
    }
}
