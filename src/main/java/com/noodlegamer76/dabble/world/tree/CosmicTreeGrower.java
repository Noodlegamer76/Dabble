package com.noodlegamer76.dabble.world.tree;

import com.noodlegamer76.dabble.world.features.FeatureKeys.FeatureKeys;
import com.noodlegamer76.dabble.world.features.InitFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class CosmicTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return switch (pRandom.nextIntBetweenInclusive(1, 16)) {
            case 1 -> FeatureKeys.WHITE_COSMIC_TREE;
            case 2 -> FeatureKeys.LIGHT_GRAY_COSMIC_TREE;
            case 3 -> FeatureKeys.GRAY_COSMIC_TREE;
            case 4 -> FeatureKeys.BLACK_COSMIC_TREE;
            case 5 -> FeatureKeys.RED_COSMIC_TREE;
            case 6 -> FeatureKeys.ORANGE_COSMIC_TREE;
            case 7 -> FeatureKeys.YELLOW_COSMIC_TREE;
            case 8 -> FeatureKeys.LIME_COSMIC_TREE;
            case 9 -> FeatureKeys.GREEN_COSMIC_TREE;
            case 10 -> FeatureKeys.LIGHT_BLUE_COSMIC_TREE;
            case 11 -> FeatureKeys.CYAN_COSMIC_TREE;
            case 12 -> FeatureKeys.BLUE_COSMIC_TREE;
            case 13 -> FeatureKeys.PURPLE_COSMIC_TREE;
            case 14 -> FeatureKeys.MAGENTA_COSMIC_TREE;
            case 15 -> FeatureKeys.PINK_COSMIC_TREE;
            case 16 -> FeatureKeys.BROWN_COSMIC_TREE;
            default -> FeatureKeys.PINK_COSMIC_TREE;
        };
    }
}
