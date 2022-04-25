package net.saltayjek004.stepsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.saltayjek004.stepsmod.StepsMod;
import net.saltayjek004.stepsmod.block.custom.ModStepsBlock;
import net.saltayjek004.stepsmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block OAK_STEPS = registerBlock("oak_steps",
        new ModStepsBlock(Blocks.OAK_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)), ModItemGroup.STEPS);

    //Wood variants
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

    public static final Block COBBLESTONE_STEPS = registerBlock("cobblestone_steps",
        new ModStepsBlock(Blocks.COBBLESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)), ModItemGroup.STEPS);

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
