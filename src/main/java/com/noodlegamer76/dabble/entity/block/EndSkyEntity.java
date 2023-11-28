package com.noodlegamer76.dabble.entity.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class EndSkyEntity extends BlockEntity {
    public EndSkyEntity(BlockPos pos, BlockState blockState) {
        super(InitBlockEntities.END_SKY_ENTITY.get(), pos, blockState);
    }
}
