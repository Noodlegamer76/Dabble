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
        public void adjustLightmapColors(ClientLevel level, float partialTicks, float skyDarken, float blockLightRedFlicker, float skyLight, int pixelX, int pixelY, Vector3f colors) {
            super.adjustLightmapColors(level, partialTicks, skyDarken, blockLightRedFlicker, skyLight, pixelX, pixelY, colors);
        }


        @Override
        public boolean renderSky(ClientLevel level, int ticks, float partialTick, PoseStack pPoseStack, Camera camera, Matrix4f projectionMatrix, boolean isFoggy, Runnable setupFog) {

            SkyBoxRenderer.render(pPoseStack, ticks, partialTick, 255, 0.25f,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1/skybox1")
            );
            SkyBoxRenderer.render(pPoseStack, ticks, partialTick, 180, 0.6f,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1/skybox2")
            );
            SkyBoxRenderer.render(pPoseStack, ticks, partialTick, 127, 1.0f,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1/skybox3")
            );
            SkyBoxRenderer.render(pPoseStack, ticks, partialTick, 96, 1.5f,
                    new ResourceLocation(DabbleMod.MODID, "textures/environment/layer1/skybox4")
            );
            return true;
        }

    };
}
