package com.noodlegamer76.dabble.item;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.block.InitBlocks;
import com.noodlegamer76.dabble.entity.InitEntity;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DabbleMod.MODID);

    //dev stuff
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new TestItem(new Item.Properties()));
        public static final RegistryObject<Item> RENDER_TESTER_BLOCK_ITEM = ITEMS.register("render_tester_block",
            () -> new BlockItem(InitBlocks.RENDER_TESTER_BLOCK.get(), new Item.Properties()));


    public static final RegistryObject<Item> WARDLING_SPAWN_EGG = ITEMS.register("wardling_spawn_egg",
            () -> new ForgeSpawnEggItem(InitEntity.WARDLING,
                    new Color(155, 245, 66).getRGB(),
                    new Color(66, 245, 245).getRGB(),
                    new Item.Properties()));

    public static final RegistryObject<Item> FRYING_PAN = ITEMS.register("frying_pan",
            () -> new FryingPan(InitBlocks.FRYING_PAN.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOID_BLOCK = ITEMS.register("void_block",
            () -> new BlockItem(InitBlocks.VOID_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOID_INFESTED_STONE = ITEMS.register("void_infested_stone",
            () -> new BlockItem(InitBlocks.VOID_INFESTED_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOID_ASH = ITEMS.register("void_ash",
            () -> new BlockItem(InitBlocks.VOID_ASH.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOID_INFESTED_BEDROCK = ITEMS.register("void_infested_bedrock",
            () -> new BlockItem(InitBlocks.VOID_INFESTED_BEDROCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> COSMIC_SAPLING = ITEMS.register("cosmic_sapling",
            () -> new BlockItem(InitBlocks.COSMIC_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_COSMIC_LEAVES = ITEMS.register("white_cosmic_leaves",
            () -> new BlockItem(InitBlocks.WHITE_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_COSMIC_LEAVES = ITEMS.register("light_gray_cosmic_leaves",
            () -> new BlockItem(InitBlocks.LIGHT_GRAY_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_COSMIC_LEAVES = ITEMS.register("gray_cosmic_leaves",
            () -> new BlockItem(InitBlocks.GRAY_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_COSMIC_LEAVES = ITEMS.register("black_cosmic_leaves",
            () -> new BlockItem(InitBlocks.BLACK_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_COSMIC_LEAVES = ITEMS.register("red_cosmic_leaves",
            () -> new BlockItem(InitBlocks.RED_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_COSMIC_LEAVES = ITEMS.register("orange_cosmic_leaves",
            () -> new BlockItem(InitBlocks.ORANGE_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_COSMIC_LEAVES = ITEMS.register("yellow_cosmic_leaves",
            () -> new BlockItem(InitBlocks.YELLOW_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_COSMIC_LEAVES = ITEMS.register("lime_cosmic_leaves",
            () -> new BlockItem(InitBlocks.LIME_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_COSMIC_LEAVES = ITEMS.register("green_cosmic_leaves",
            () -> new BlockItem(InitBlocks.GREEN_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_COSMIC_LEAVES = ITEMS.register("light_blue_cosmic_leaves",
            () -> new BlockItem(InitBlocks.LIGHT_BLUE_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_COSMIC_LEAVES = ITEMS.register("cyan_cosmic_leaves",
            () -> new BlockItem(InitBlocks.CYAN_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_COSMIC_LEAVES = ITEMS.register("blue_cosmic_leaves",
            () -> new BlockItem(InitBlocks.BLUE_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_COSMIC_LEAVES = ITEMS.register("purple_cosmic_leaves",
            () -> new BlockItem(InitBlocks.PURPLE_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_COSMIC_LEAVES = ITEMS.register("magenta_cosmic_leaves",
            () -> new BlockItem(InitBlocks.MAGENTA_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_COSMIC_LEAVES = ITEMS.register("pink_cosmic_leaves",
            () -> new BlockItem(InitBlocks.PINK_COSMIC_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_COSMIC_LEAVES = ITEMS.register("brown_cosmic_leaves",
            () -> new BlockItem(InitBlocks.BROWN_COSMIC_LEAVES.get(), new Item.Properties()));
}
