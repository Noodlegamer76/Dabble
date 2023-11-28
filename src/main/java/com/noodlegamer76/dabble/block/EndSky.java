package com.noodlegamer76.dabble.block;

import com.noodlegamer76.dabble.entity.block.EndSkyEntity;
import com.noodlegamer76.dabble.entity.block.InitBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class EndSky extends BaseEntityBlock implements EntityBlock {

    public EndSky(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new EndSkyEntity(pPos, pState);
    }
}
