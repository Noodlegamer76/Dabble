package com.noodlegamer76.dabble.datagen;

import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
       dropSelf(InitBlocks.EXAMPLE_BLOCK.get());
       dropSelf(InitBlocks.PATTERN_WOOL.get());
       dropSelf(InitBlocks.PATTERN_CARPET.get());


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