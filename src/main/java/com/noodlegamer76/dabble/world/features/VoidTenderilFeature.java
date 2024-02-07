package com.noodlegamer76.dabble.world.features;

import com.mojang.serialization.Codec;
import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class VoidTenderilFeature extends Feature<NoneFeatureConfiguration> {
    public VoidTenderilFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        WorldGenLevel level = pContext.level();
        BlockPos origin = pContext.origin();
        RandomSource random = pContext.random();

        BlockPos.MutableBlockPos current = origin.mutable();

        int radius = 10;
        int yLevel = origin.getY() - 10;

        while(radius > 0) {
            current.setY(origin.getY() + yLevel);

            for (int x = -radius; x < radius; x++) {
                current.setX(origin.getX() + x);

                for(int z = -radius; z < radius; z++) {
                    current.setZ(origin.getZ() + z);

                    if (origin.distSqr(current) <= radius * radius - radius * 0.01) {

                        level.setBlock(current, Blocks.SMOOTH_STONE.defaultBlockState(), 2);
                    }
                }
            }
            yLevel++;
            radius--;
        }
        return true;
    }
}
