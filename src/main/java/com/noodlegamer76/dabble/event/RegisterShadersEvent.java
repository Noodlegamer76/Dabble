package com.noodlegamer76.dabble.event;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.client.renderer.ModRenderTypes;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterNamedRenderTypesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;

@Mod.EventBusSubscriber(modid = DabbleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RegisterShadersEvent {
    public static ShaderInstance TEST;

    @SubscribeEvent
    public static void registerShaders(net.minecraftforge.client.event.RegisterShadersEvent event) throws IOException {

        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation(DabbleMod.MODID, "test"), DefaultVertexFormat.POSITION), (e) -> TEST = e);
    }

    @SubscribeEvent
    public static void registerNamedRenderTypes(RegisterNamedRenderTypesEvent event) {
    }
}
