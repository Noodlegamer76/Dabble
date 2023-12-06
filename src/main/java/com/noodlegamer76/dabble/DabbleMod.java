package com.noodlegamer76.dabble;

import com.mojang.logging.LogUtils;
import com.noodlegamer76.dabble.block.InitBlocks;
import com.noodlegamer76.dabble.client.model.BlockModel;
import com.noodlegamer76.dabble.client.renderer.BouncyBallRenderer;
import com.noodlegamer76.dabble.client.renderer.EndSkyRenderer;
import com.noodlegamer76.dabble.creativetabs.DabbleTab;
import com.noodlegamer76.dabble.creativetabs.InitCreativeTabs;
import com.noodlegamer76.dabble.entity.InitEntity;
import com.noodlegamer76.dabble.entity.block.EndSkyEntity;
import com.noodlegamer76.dabble.entity.block.InitBlockEntities;
import com.noodlegamer76.dabble.item.InitItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.blockentity.CampfireRenderer;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterShadersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import java.awt.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DabbleMod.MODID)
public class DabbleMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "dabble";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public DabbleMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        InitBlocks.BLOCKS.register(modEventBus);
        InitItems.ITEMS.register(modEventBus);
        InitBlockEntities.BLOCK_ENTITIES.register(modEventBus);

        InitCreativeTabs.CREATIVE_TABS.register(modEventBus);
        InitEntity.ENTITIES.register(modEventBus);
        modEventBus.register(new DabbleTab());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }

        @SubscribeEvent
        public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(InitBlockEntities.END_SKY_ENTITY.get(), EndSkyRenderer::new);
            event.registerEntityRenderer(InitEntity.BOUNCY_BALL.get(), BouncyBallRenderer::new);
        }
        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(BlockModel.LAYER_LOCATION, BlockModel::createBodyLayer);
        }

        @SubscribeEvent
        public static void assignBlockColors(RegisterColorHandlersEvent.Block event) {
            event.register((state, level, pos, tintIndex) -> pos != null && level != null ?
                            Color.getHSBColor((float) (Math.sin(pos.getX()) + Math.sin(pos.getZ()) + Math.sin(pos.getY())), 0.75F, 0.85F).getRGB() : 0,
                    InitBlocks.PATTERN_WOOL.get(),
                    InitBlocks.PATTERN_CARPET.get()

            );
        }

        @SubscribeEvent
        public static void assignItemColors(RegisterColorHandlersEvent.Item event) {
            event.register((item,tintIndex) -> tintIndex != -1 ? Color.getHSBColor(0, 1.0F, 1.0F).getRGB() : Color.RED.getRGB(),
                    InitItems.PATTERN_WOOL.get(),
                    InitItems.PATTERN_CARPET.get()
            );

        }
        @SubscribeEvent
        public static void registerShadersEvent(RegisterShadersEvent event) {

        }
    }
}
