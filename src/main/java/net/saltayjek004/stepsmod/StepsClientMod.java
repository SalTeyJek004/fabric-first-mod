package net.saltayjek004.stepsmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.saltayjek004.stepsmod.block.ModBlocks;

public class StepsClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //Wood Variants
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_STEPS, RenderLayer.getCutout());

        //Stone Variants
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COBBLESTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRANITE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POLISHED_GRANITE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIORITE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POLISHED_DIORITE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANDESITE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POLISHED_ANDESITE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_COBBLESTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STONE_BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_STONE_BRICK_STEPS, RenderLayer.getCutout());

        //Cut Copper Variants
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EXPOSED_CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEATHERED_CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OXIDIZED_CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_EXPOSED_CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_WEATHERED_CUT_COPPER_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_STEPS, RenderLayer.getCutout());

        //Dark Variants
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COBBLED_DEEPSLATE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POLISHED_DEEPSLATE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPSLATE_BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPSLATE_TILE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKSTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POLISHED_BLACKSTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POLISHED_BLACKSTONE_BRICK_STEPS, RenderLayer.getCutout());

        //Misc Variants
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.END_STONE_BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PRISMARINE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_PRISMARINE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PRISMARINE_BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SANDSTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMOOTH_SANDSTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_SANDSTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMOOTH_RED_SANDSTONE_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.QUARTZ_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMOOTH_QUARTZ_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NETHER_BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_NETHER_BRICK_STEPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPUR_STEPS, RenderLayer.getCutout());
    }
}
