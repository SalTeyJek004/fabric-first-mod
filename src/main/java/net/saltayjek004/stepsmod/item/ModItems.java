package net.saltayjek004.stepsmod.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.saltayjek004.stepsmod.StepsMod;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StepsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StepsMod.LOGGER.info("registering mod items for "+ StepsMod.MOD_ID);
    }

}
