package net.saltayjek004.stepsmod;

import net.fabricmc.api.ModInitializer;
import net.saltayjek004.stepsmod.block.ModBlocks;
import net.saltayjek004.stepsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepsMod implements ModInitializer {
	public static final String MOD_ID = "stepsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
