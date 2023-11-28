package com.noodlegamer76.dabble.entity.block;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DabbleMod.MODID);

    public static final RegistryObject<BlockEntityType<EndSkyEntity>> END_SKY_ENTITY = BLOCK_ENTITIES.register("end_sky",
            () -> BlockEntityType.Builder.of(EndSkyEntity::new, InitBlocks.END_SKY_BLOCK.get()).build(null));
}
