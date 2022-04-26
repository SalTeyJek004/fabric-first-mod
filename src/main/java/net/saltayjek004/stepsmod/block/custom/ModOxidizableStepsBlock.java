package net.saltayjek004.stepsmod.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class ModOxidizableStepsBlock extends ModStepsBlock implements Oxidizable {
    private final OxidationLevel oxidationLevel;

    public ModOxidizableStepsBlock(OxidationLevel oxidationLevel, BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
