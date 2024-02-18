package com.noodlegamer76.dabble.world.features.FeatureKeys;

import com.noodlegamer76.dabble.DabbleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class FeatureKeys {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_COSMIC_TREE = registerKey("white_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_COSMIC_TREE = registerKey("light_gray_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_COSMIC_TREE = registerKey("gray_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_COSMIC_TREE = registerKey("black_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_COSMIC_TREE = registerKey("red_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_COSMIC_TREE = registerKey("orange_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_COSMIC_TREE = registerKey("yellow_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_COSMIC_TREE = registerKey("lime_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_COSMIC_TREE = registerKey("green_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_COSMIC_TREE = registerKey("light_blue_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_COSMIC_TREE = registerKey("cyan_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_COSMIC_TREE = registerKey("blue_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_COSMIC_TREE = registerKey("purple_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_COSMIC_TREE = registerKey("magenta_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_COSMIC_TREE = registerKey("pink_cosmic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_COSMIC_TREE = registerKey("brown_cosmic_tree");

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(DabbleMod.MODID, name));
    }
}
