package com.noodlegamer76.dabble.world.features;

import com.noodlegamer76.dabble.DabbleMod;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, DabbleMod.MODID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> TEST = FEATURES.register(
            "test",
            () -> new TestFeature(NoneFeatureConfiguration.CODEC)
    );
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> VOID_TENDRIL = FEATURES.register(
            "void_tendril",
            () -> new VoidTenderilFeature(NoneFeatureConfiguration.CODEC)
    );
    public static final RegistryObject<Feature<OreConfiguration>> VOID_SPLOTCH = FEATURES.register(
            "void_splotch",
            () -> new OreFeature(OreConfiguration.CODEC)
    );
}
