package com.noodlegamer76.dabble.creativetabs;

import com.noodlegamer76.dabble.item.InitItems;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DabbleTab {
    @SubscribeEvent
    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == InitCreativeTabs.DABBLE_TAB.getKey()) {
            event.accept(InitItems.EXAMPLE_BLOCK_ITEM);
            event.accept(InitItems.FRYING_PAN);
            event.accept(InitItems.PATTERN_WOOL);
            event.accept(InitItems.PATTERN_CARPET);
            event.accept(InitItems.END_SKY);
            event.accept(InitItems.TEST_ITEM);
        }
    }
}
