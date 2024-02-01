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

    //item i use to trigger stuff in this mod
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new TestItem(new Item.Properties()));
    public static final RegistryObject<Item> WARDLING_SPAWN_EGG = ITEMS.register("wardling_spawn_egg",
            () -> new ForgeSpawnEggItem(InitEntity.WARDLING,
                    new Color(155, 245, 66).getRGB(),
                    new Color(66, 245, 245).getRGB(),
                    new Item.Properties()));

    public static final RegistryObject<Item> FRYING_PAN = ITEMS.register("frying_pan",
            () -> new FryingPan(InitBlocks.FRYING_PAN.get(), new Item.Properties()));
}
