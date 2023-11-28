package com.noodlegamer76.dabble.block;

import com.noodlegamer76.dabble.DabbleMod;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DabbleMod.MODID);


    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> END_SKY_BLOCK = BLOCKS.register("end_sky",
            () -> new EndSky(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)) {
                @Override
                public RenderShape getRenderShape(BlockState pState) {
                    return RenderShape.INVISIBLE;
                }
            });
    public static final RegistryObject<Block> PATTERN_WOOL = BLOCKS.register("pattern_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> PATTERN_CARPET = BLOCKS.register("pattern_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET)));
    public static final RegistryObject<Block> FRYING_PAN = BLOCKS.register("frying_pan",
            () -> new FryingPan(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).noOcclusion()));



}
