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
import org.joml.Vector3f;

import java.awt.*;

public class ModDimensionSpecialEffects {
    public static final DimensionSpecialEffects LAYER1 = new DimensionSpecialEffects(256, true, DimensionSpecialEffects.SkyType.END, false, false) {
        @Override
        public Vec3 getBrightnessDependentFogColor(Vec3 pFogColor, float pBrightness) {
            return Vec3.fromRGB24(Color.DARK_GRAY.getRGB());
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
        public boolean renderSky(ClientLevel level, int ticks, float partialTick, PoseStack poseStack, Camera camera, Matrix4f projectionMatrix, boolean isFoggy, Runnable setupFog) {

            SkyBoxRenderer.render(poseStack, ticks, partialTick, 255, 0.15f,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1/skybox1")
            );
            SkyBoxRenderer.render(poseStack, ticks, partialTick, 200, 0.3f,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1/skybox2")
            );
            return true;
        }

    };
}
