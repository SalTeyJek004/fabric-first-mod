package net.saltayjek004.stepsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.saltayjek004.stepsmod.StepsMod;
import net.saltayjek004.stepsmod.block.custom.ModOxidizable;
import net.saltayjek004.stepsmod.block.custom.ModOxidizableStepsBlock;
import net.saltayjek004.stepsmod.block.custom.ModStepsBlock;
import net.saltayjek004.stepsmod.item.ModItemGroup;

public class ModBlocks {

    //Wood variants
    public static final Block OAK_STEPS = registerBlock("oak_steps",
        new ModStepsBlock(Blocks.OAK_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block SPRUCE_STEPS = registerBlock("spruce_steps",
            new ModStepsBlock(Blocks.SPRUCE_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block BIRCH_STEPS = registerBlock("birch_steps",
            new ModStepsBlock(Blocks.BIRCH_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block JUNGLE_STEPS = registerBlock("jungle_steps",
            new ModStepsBlock(Blocks.JUNGLE_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block ACACIA_STEPS = registerBlock("acacia_steps",
            new ModStepsBlock(Blocks.ACACIA_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block DARK_OAK_STEPS = registerBlock("dark_oak_steps",
            new ModStepsBlock(Blocks.DARK_OAK_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block CRIMSON_STEPS = registerBlock("crimson_steps",
            new ModStepsBlock(Blocks.CRIMSON_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);
    public static final Block WARPED_STEPS = registerBlock("warped_steps",
            new ModStepsBlock(Blocks.WARPED_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);

    //Stone variants
    public static final Block COBBLESTONE_STEPS = registerBlock("cobblestone_steps",
        new ModStepsBlock(Blocks.COBBLESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block STONE_STEPS = registerBlock("stone_steps",
            new ModStepsBlock(Blocks.STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block GRANITE_STEPS = registerBlock("granite_steps",
            new ModStepsBlock(Blocks.GRANITE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block POLISHED_GRANITE_STEPS = registerBlock("polished_granite_steps",
            new ModStepsBlock(Blocks.POLISHED_GRANITE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block DIORITE_STEPS = registerBlock("diorite_steps",
            new ModStepsBlock(Blocks.DIORITE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block POLISHED_DIORITE_STEPS = registerBlock("polished_diorite_steps",
            new ModStepsBlock(Blocks.POLISHED_DIORITE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block ANDESITE_STEPS = registerBlock("andesite_steps",
            new ModStepsBlock(Blocks.ANDESITE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block POLISHED_ANDESITE_STEPS = registerBlock("polished_andesite_steps",
            new ModStepsBlock(Blocks.POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block MOSSY_COBBLESTONE_STEPS = registerBlock("mossy_cobblestone_steps",
            new ModStepsBlock(Blocks.MOSSY_COBBLESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block STONE_BRICK_STEPS = registerBlock("stone_brick_steps",
            new ModStepsBlock(Blocks.STONE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block MOSSY_STONE_BRICK_STEPS = registerBlock("mossy_stone_brick_steps",
            new ModStepsBlock(Blocks.MOSSY_STONE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);

    //cut copper steps
    public static final Block CUT_COPPER_STEPS = registerBlock("cut_copper_steps",
            new ModOxidizableStepsBlock(ModOxidizable.OxidationLevel.UNAFFECTED, Blocks.CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);
    public static final Block EXPOSED_CUT_COPPER_STEPS = registerBlock("exposed_cut_copper_steps",
            new ModOxidizableStepsBlock(ModOxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);
    public static final Block WEATHERED_CUT_COPPER_STEPS = registerBlock("weathered_cut_copper_steps",
            new ModOxidizableStepsBlock(ModOxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);
    public static final Block OXIDIZED_CUT_COPPER_STEPS = registerBlock("oxidized_cut_copper_steps",
            new ModOxidizableStepsBlock(ModOxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);

    //waxed cut copper steps
    public static final Block WAXED_CUT_COPPER_STEPS = registerBlock("waxed_cut_copper_steps",
            new ModStepsBlock(Blocks.WAXED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);
    public static final Block WAXED_EXPOSED_CUT_COPPER_STEPS = registerBlock("waxed_exposed_cut_copper_steps",
            new ModStepsBlock(Blocks.WAXED_EXPOSED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);
    public static final Block WAXED_WEATHERED_CUT_COPPER_STEPS = registerBlock("waxed_weathered_cut_copper_steps",
            new ModStepsBlock(Blocks.WAXED_WEATHERED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);
    public static final Block WAXED_OXIDIZED_CUT_COPPER_STEPS = registerBlock("waxed_oxidized_cut_copper_steps",
            new ModStepsBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER.getDefaultState(), FabricBlockSettings.of(Material.METAL)), ModItemGroup.STEPS);

    //dark stone variants
    public static final Block COBBLED_DEEPSLATE_STEPS = registerBlock("cobbled_deepslate_steps",
            new ModStepsBlock(Blocks.COBBLED_DEEPSLATE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block POLISHED_DEEPSLATE_STEPS = registerBlock("polished_deepslate_steps",
            new ModStepsBlock(Blocks.POLISHED_DEEPSLATE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block DEEPSLATE_BRICK_STEPS = registerBlock("deepslate_brick_steps",
            new ModStepsBlock(Blocks.DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block DEEPSLATE_TILE_STEPS = registerBlock("deepslate_tile_steps",
            new ModStepsBlock(Blocks.DEEPSLATE_TILES.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block BLACKSTONE_STEPS = registerBlock("blackstone_steps",
            new ModStepsBlock(Blocks.BLACKSTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block POLISHED_BLACKSTONE_STEPS = registerBlock("polished_blackstone_steps",
            new ModStepsBlock(Blocks.POLISHED_BLACKSTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);
    public static final Block POLISHED_BLACKSTONE_BRICK_STEPS = registerBlock("polished_blackstone_brick_steps",
            new ModStepsBlock(Blocks.POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(StepsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(StepsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        StepsMod.LOGGER.info("Registering ModBlocks for "+ StepsMod.MOD_ID);
    }
}
