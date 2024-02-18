package com.noodlegamer76.dabble.creativetabs;

import com.noodlegamer76.dabble.item.InitItems;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DabbleTab {
    @SubscribeEvent
    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == InitCreativeTabs.DABBLE_TAB.getKey()) {
            event.accept(InitItems.FRYING_PAN);
            event.accept(InitItems.TEST_ITEM);
            event.accept(InitItems.WARDLING_SPAWN_EGG);
            event.accept(InitItems.VOID_BLOCK);
            event.accept(InitItems.VOID_INFESTED_STONE);
            event.accept(InitItems.VOID_INFESTED_BEDROCK);
            event.accept(InitItems.VOID_ASH);
            event.accept(InitItems.RENDER_TESTER_BLOCK_ITEM);
            event.accept(InitItems.COSMIC_SAPLING);
            event.accept(InitItems.WHITE_COSMIC_LEAVES);
            event.accept(InitItems.LIGHT_GRAY_COSMIC_LEAVES);
            event.accept(InitItems.GRAY_COSMIC_LEAVES);
            event.accept(InitItems.BLACK_COSMIC_LEAVES);
            event.accept(InitItems.RED_COSMIC_LEAVES);
            event.accept(InitItems.ORANGE_COSMIC_LEAVES);
            event.accept(InitItems.YELLOW_COSMIC_LEAVES);
            event.accept(InitItems.LIME_COSMIC_LEAVES);
            event.accept(InitItems.GREEN_COSMIC_LEAVES);
            event.accept(InitItems.LIGHT_BLUE_COSMIC_LEAVES);
            event.accept(InitItems.CYAN_COSMIC_LEAVES);
            event.accept(InitItems.BLUE_COSMIC_LEAVES);
            event.accept(InitItems.PURPLE_COSMIC_LEAVES);
            event.accept(InitItems.MAGENTA_COSMIC_LEAVES);
            event.accept(InitItems.PINK_COSMIC_LEAVES);
            event.accept(InitItems.BROWN_COSMIC_LEAVES);
        }
    }
}
