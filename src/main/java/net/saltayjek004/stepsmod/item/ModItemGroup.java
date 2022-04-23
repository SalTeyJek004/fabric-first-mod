package net.saltayjek004.stepsmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.saltayjek004.stepsmod.StepsMod;
import net.saltayjek004.stepsmod.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup STEPS = FabricItemGroupBuilder.build(new Identifier(StepsMod.MOD_ID, "steps"),
            () -> new ItemStack(ModBlocks.OAK_STEPS));
}
