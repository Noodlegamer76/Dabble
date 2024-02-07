package com.noodlegamer76.dabble.block;

import com.noodlegamer76.dabble.DabbleMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DabbleMod.MODID);


    public static final RegistryObject<Block> FRYING_PAN = BLOCKS.register("frying_pan",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).noOcclusion()) {
                @Override
                public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
                    return Block.box(3.0D, 0.0D, 3.0D, 13.0D, 4.0D, 13.0D);
                }
            });

    public static final RegistryObject<Block> NORMAL_VOID_BLOCK = BLOCKS.register("normal_void_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.BLACK)));



}
