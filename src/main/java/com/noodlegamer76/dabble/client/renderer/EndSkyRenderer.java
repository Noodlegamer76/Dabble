package com.noodlegamer76.dabble.client.renderer;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.shaders.Shader;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.client.model.BlockModel;
import com.noodlegamer76.dabble.entity.block.EndSkyEntity;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import org.joml.Matrix4f;

import java.util.UUID;

public class EndSkyRenderer implements BlockEntityRenderer<EndSkyEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DabbleMod.MODID, "textures/block/pattern_wool.png");
    ModelPart model;

    public EndSkyRenderer(BlockEntityRendererProvider.Context context) {
        model = context.bakeLayer(BlockModel.LAYER_LOCATION);
    }
    @Override
    public void render(EndSkyEntity pBlockEntity, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, int pPackedOverlay) {

        RenderSystem.enableBlend();
        RenderSystem.depthMask(false);
        RenderSystem.renderCrosshair(100);
        RenderSystem.setShader(GameRenderer::getRendertypeEndPortalShader);
        RenderSystem.setShaderTexture(0, TEXTURE);



        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
    }
}
