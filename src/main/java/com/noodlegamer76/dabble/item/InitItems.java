package com.noodlegamer76.dabble.item;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.block.InitBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DabbleMod.MODID);


    public static final RegistryObject<Item> FRYING_PAN = ITEMS.register("frying_pan",
            () -> new FryingPan(InitBlocks.FRYING_PAN.get(), new Item.Properties()));

    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block",
            () -> new BlockItem(InitBlocks.EXAMPLE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PATTERN_WOOL = ITEMS.register("pattern_wool",
            () -> new BlockItem(InitBlocks.PATTERN_WOOL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PATTERN_CARPET = ITEMS.register("pattern_carpet",
            () -> new BlockItem(InitBlocks.PATTERN_CARPET.get(), new Item.Properties()));

}
