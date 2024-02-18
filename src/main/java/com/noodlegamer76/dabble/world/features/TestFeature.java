package com.noodlegamer76.dabble.world.features;

import com.mojang.serialization.Codec;
import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class TestFeature extends Feature<NoneFeatureConfiguration> {
    public TestFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        pContext.level().setBlock(pContext.origin(), InitBlocks.VOID_ASH.get().defaultBlockState(), 3);
        return true;
    }
}
