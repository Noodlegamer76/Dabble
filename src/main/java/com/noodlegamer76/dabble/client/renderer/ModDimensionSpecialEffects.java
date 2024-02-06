package com.noodlegamer76.dabble.client.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import com.noodlegamer76.dabble.DabbleMod;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

import java.awt.*;

public class ModDimensionSpecialEffects {
    public static final DimensionSpecialEffects LAYER1 = new DimensionSpecialEffects(100, false, DimensionSpecialEffects.SkyType.END, true, true) {
        @Override
        public Vec3 getBrightnessDependentFogColor(Vec3 pFogColor, float pBrightness) {
            return Vec3.fromRGB24(Color.WHITE.getRGB());
        }

        @Nullable
        @Override
        public float[] getSunriseColor(float pTimeOfDay, float pPartialTicks) {
            return null;
        }

        @Override
        public boolean isFoggyAt(int pX, int pY) {
            return false;
        }

        @Override
        public boolean renderSky(ClientLevel level, int ticks, float partialTick, PoseStack pPoseStack, Camera camera, Matrix4f projectionMatrix, boolean isFoggy, Runnable setupFog) {

            SkyBoxRenderer.render(pPoseStack,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1_skybox/front.png"),
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1_skybox/back.png"),
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1_skybox/left.png"),
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1_skybox/right.png"),
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1_skybox/top.png"),
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1_skybox/bottom.png")
                    );


            return true;
        }

    };
}
