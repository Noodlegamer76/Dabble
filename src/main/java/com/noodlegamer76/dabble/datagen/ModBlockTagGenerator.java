package com.noodlegamer76.dabble.datagen;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider  {
    public static final TagKey<Block> VOID_REPLACEABLE = BlockTags.create(new ResourceLocation(DabbleMod.MODID, "void_replaceable"));
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(VOID_REPLACEABLE)
                .addTags(
                        BlockTags.MINEABLE_WITH_AXE,
                        BlockTags.MINEABLE_WITH_HOE,
                        BlockTags.MINEABLE_WITH_PICKAXE,
                        BlockTags.MINEABLE_WITH_SHOVEL
                );

        this.tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(
                        InitBlocks.WHITE_COSMIC_LEAVES.get(),
                        InitBlocks.LIGHT_GRAY_COSMIC_LEAVES.get(),
                        InitBlocks.GRAY_COSMIC_LEAVES.get(),
                        InitBlocks.BLACK_COSMIC_LEAVES.get(),
                        InitBlocks.RED_COSMIC_LEAVES.get(),
                        InitBlocks.ORANGE_COSMIC_LEAVES.get(),
                        InitBlocks.YELLOW_COSMIC_LEAVES.get(),
                        InitBlocks.LIME_COSMIC_LEAVES.get(),
                        InitBlocks.GREEN_COSMIC_LEAVES.get(),
                        InitBlocks.LIGHT_BLUE_COSMIC_LEAVES.get(),
                        InitBlocks.CYAN_COSMIC_LEAVES.get(),
                        InitBlocks.BLUE_COSMIC_LEAVES.get(),
                        InitBlocks.PURPLE_COSMIC_LEAVES.get(),
                        InitBlocks.MAGENTA_COSMIC_LEAVES.get(),
                        InitBlocks.PINK_COSMIC_LEAVES.get(),
                        InitBlocks.BROWN_COSMIC_LEAVES.get()
                );
    }
}
