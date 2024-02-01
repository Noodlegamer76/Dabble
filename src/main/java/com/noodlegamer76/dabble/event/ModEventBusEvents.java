package com.noodlegamer76.dabble.event;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.entity.InitEntity;
import com.noodlegamer76.dabble.entity.entities.WardlingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DabbleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(InitEntity.WARDLING.get(), WardlingEntity.createAttributes().build());
    }
}
