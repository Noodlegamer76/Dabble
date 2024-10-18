package com.noodlegamer76.dabble.event;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.entity.InitEntity;
import com.noodlegamer76.dabble.entity.entities.WardlingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DabbleMod.MODID, value = Dist.CLIENT)
public class RenderEvents {
    private static boolean FboCreated = false;

    @SubscribeEvent
    public static void renderStageEvent(RenderLevelStageEvent event) {
    }

    @SubscribeEvent
    public static void renderStageEvent(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            if (!FboCreated) {
                FboCreated = true;
                int FBO = GlStateManager.glGenFramebuffers();
                System.out.println("FRAME BUFFER GENERATED: " + FBO);


            }
        }
    }
}
