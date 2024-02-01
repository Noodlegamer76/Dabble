package com.noodlegamer76.dabble.creativetabs;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.item.InitItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class InitCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DabbleMod.MODID);

    public static RegistryObject<CreativeModeTab> DABBLE_TAB = CREATIVE_TABS.register("dabble_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("dabble.creative_tab"))
            .icon(() -> new ItemStack(InitItems.FRYING_PAN.get()))
            .build());
}
