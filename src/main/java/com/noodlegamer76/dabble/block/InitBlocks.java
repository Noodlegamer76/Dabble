package com.noodlegamer76.dabble.block;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.world.features.InitFeatures;
import com.noodlegamer76.dabble.world.tree.CosmicTreeGrower;
import net.minecraft.commands.arguments.ResourceKeyArgument;
import net.minecraft.commands.arguments.ResourceOrTagKeyArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class InitBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DabbleMod.MODID);


    public static final RegistryObject<Block> FRYING_PAN = BLOCKS.register("frying_pan",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).noOcclusion()) {
                @Override
                public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
                    return Block.box(3.0D, 0.0D, 3.0D, 13.0D, 4.0D, 13.0D);
                }
            });


    public static final RegistryObject<Block> VOID_ASH = BLOCKS.register("void_ash",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> VOID_BLOCK = BLOCKS.register("void_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> VOID_INFESTED_STONE = BLOCKS.register("void_infested_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> VOID_INFESTED_BEDROCK = BLOCKS.register("void_infested_bedrock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> RENDER_TESTER_BLOCK = BLOCKS.register("render_tester",
            () -> new RenderTesterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.BLACK).noCollission().noOcclusion()));


    public static final RegistryObject<Block> COSMIC_SAPLING = BLOCKS.register("cosmic_sapling",
            () -> new SaplingBlock(new CosmicTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).mapColor(DyeColor.BLACK))
            {
                @Override
                protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
                    return pState.is(BlockTags.DIRT)|| pState.is(Blocks.FARMLAND) || pState.is(InitBlocks.VOID_ASH.get());
                }
            });
    public static final RegistryObject<Block> WHITE_COSMIC_LEAVES = BLOCKS.register("white_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> LIGHT_GRAY_COSMIC_LEAVES = BLOCKS.register("light_gray_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> GRAY_COSMIC_LEAVES = BLOCKS.register("gray_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.GRAY)));
    public static final RegistryObject<Block> BLACK_COSMIC_LEAVES = BLOCKS.register("black_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> RED_COSMIC_LEAVES = BLOCKS.register("red_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> ORANGE_COSMIC_LEAVES = BLOCKS.register("orange_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> YELLOW_COSMIC_LEAVES = BLOCKS.register("yellow_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> LIME_COSMIC_LEAVES = BLOCKS.register("lime_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> GREEN_COSMIC_LEAVES = BLOCKS.register("green_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_COSMIC_LEAVES = BLOCKS.register("light_blue_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> CYAN_COSMIC_LEAVES = BLOCKS.register("cyan_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> BLUE_COSMIC_LEAVES = BLOCKS.register("blue_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> PURPLE_COSMIC_LEAVES = BLOCKS.register("purple_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.PURPLE)));
    public static final RegistryObject<Block> MAGENTA_COSMIC_LEAVES = BLOCKS.register("magenta_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.MAGENTA)));
    public static final RegistryObject<Block> PINK_COSMIC_LEAVES = BLOCKS.register("pink_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> BROWN_COSMIC_LEAVES = BLOCKS.register("brown_cosmic_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.BROWN)));


}
