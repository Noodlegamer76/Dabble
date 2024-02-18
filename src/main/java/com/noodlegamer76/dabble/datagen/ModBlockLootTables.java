package com.noodlegamer76.dabble.datagen;

import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        dropSelf(InitBlocks.FRYING_PAN.get());
        dropSelf(InitBlocks.VOID_ASH.get());
        dropSelf(InitBlocks.VOID_INFESTED_STONE.get());
        dropSelf(InitBlocks.VOID_BLOCK.get());
        dropSelf(InitBlocks.VOID_INFESTED_BEDROCK.get());

        dropSelf(InitBlocks.RENDER_TESTER_BLOCK.get());



        dropSelf(InitBlocks.COSMIC_SAPLING.get());

        this.add(InitBlocks.WHITE_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.WHITE_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.LIGHT_GRAY_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.LIGHT_GRAY_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.GRAY_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.GRAY_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.BLACK_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.BLACK_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.RED_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.RED_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.ORANGE_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.ORANGE_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.YELLOW_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.YELLOW_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.LIME_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.LIME_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.GREEN_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.GREEN_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.LIGHT_BLUE_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.LIGHT_BLUE_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.CYAN_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.CYAN_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.BLUE_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.BLUE_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.PURPLE_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.PURPLE_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.MAGENTA_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.MAGENTA_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.PINK_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.PINK_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(InitBlocks.BROWN_COSMIC_LEAVES.get(), (block) ->
                createLeavesDrops(block, InitBlocks.BROWN_COSMIC_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        //dropSelf(BlockInit.CRYSTALLIZED_DIRT.get());

        //this.add(BlockInit.RAINBOW_SLAB.get(),
        //        block -> createSlabItemTable(BlockInit.RAINBOW_SLAB.get()));
        //this.add(BlockInit.RAINBOW_DOOR.get(),
        //        block -> createDoorTable(BlockInit.RAINBOW_DOOR.get()));

        //this.add(BlockInit.RAINBOW_LEAVES.get(), (block) ->
        //        createLeavesDrops(block, BlockInit.RAINBOW_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return InitBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
