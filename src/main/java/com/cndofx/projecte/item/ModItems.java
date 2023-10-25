package com.cndofx.projecte.item;

import com.cndofx.projecte.ProjectE;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PHILOSOPHERS_STONE = registerItem("philosophers_stone",
            new PhilosophersStoneItem(new FabricItemSettings().maxCount(1)));

    public static final Item ALCHEMICAL_COAL = registerItem("alchemical_coal", new Item(new FabricItemSettings()));
    public static final Item MOBIUS_FUEL = registerItem("mobius_fuel", new Item(new FabricItemSettings()));
    public static final Item AETERNALIS_FUEL = registerItem("aeternalis_fuel", new Item(new FabricItemSettings()));

    public static void registerItems() {
        ProjectE.LOGGER.info("Registering mod items");
        FuelRegistry.INSTANCE.add(ALCHEMICAL_COAL, 1600 * 4);
        FuelRegistry.INSTANCE.add(MOBIUS_FUEL, 1600 * 4 * 4);
        FuelRegistry.INSTANCE.add(AETERNALIS_FUEL, 1600 * 4 * 4 * 4);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ProjectE.MOD_ID, name), item);
    }
}
