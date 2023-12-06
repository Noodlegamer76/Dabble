package com.noodlegamer76.dabble.entity;

import com.noodlegamer76.dabble.DabbleMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitEntity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DabbleMod.MODID);
    public static final RegistryObject<EntityType<HumanEntity>> HUMAN = ENTITIES.register("human",
            () -> EntityType.Builder.of(HumanEntity::new, MobCategory.MISC)
                    .sized(0.6F, 1.8F)
                    .clientTrackingRange(10)
                    .updateInterval(10)
                    .canSpawnFarFromPlayer()
                    .build(DabbleMod.MODID + ":human"));

    public static final RegistryObject<EntityType<BouncyBallEntity>> BOUNCY_BALL = ENTITIES.register("bouncy_ball",
            () -> EntityType.Builder.of(BouncyBallEntity::new, MobCategory.MISC)
                    .sized(1.0F, 1.0F)
                    .clientTrackingRange(10)
                    .updateInterval(10)
                    .canSpawnFarFromPlayer()
                    .build(DabbleMod.MODID + ":bouncy_ball"));

}
