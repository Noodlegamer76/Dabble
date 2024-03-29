package com.noodlegamer76.dabble.datagen;

import com.noodlegamer76.dabble.DabbleMod;
import com.noodlegamer76.dabble.block.InitBlocks;
import com.noodlegamer76.dabble.item.InitItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DabbleMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(InitBlocks.WHITE_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.LIGHT_GRAY_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.GRAY_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.BLACK_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.RED_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.ORANGE_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.YELLOW_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.LIME_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.GREEN_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.LIGHT_BLUE_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.CYAN_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.BLUE_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.PURPLE_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.PINK_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.MAGENTA_COSMIC_LEAVES);
        evenSimplerBlockItem(InitBlocks.BROWN_COSMIC_LEAVES);

        withExistingParent(InitItems.WARDLING_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DabbleMod.MODID, "block/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(DabbleMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(DabbleMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(DabbleMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(DabbleMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DabbleMod.MODID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DabbleMod.MODID, "item/" + block.getId().getPath()));
    }
    private ItemModelBuilder slabItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("block/slab")).texture("layer0",
                new ResourceLocation(DabbleMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DabbleMod.MODID, "item/" + item.getId().getPath()));
    }

}
