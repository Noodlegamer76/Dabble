package com.noodlegamer76.dabble.entity;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.entity.entities.WardlingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitEntity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DabbleMod.MODID);

    public static final RegistryObject<EntityType<WardlingEntity>> WARDLING = ENTITIES.register("wardling",
            () -> EntityType.Builder.of(WardlingEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 1.3F)
                    .build("wardling"));

}
