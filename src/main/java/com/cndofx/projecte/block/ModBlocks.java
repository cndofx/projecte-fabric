package com.cndofx.projecte.block;

import com.cndofx.projecte.ProjectE;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ALCHEMICAL_COAL_BLOCK = registerBlock("alchemical_coal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).mapColor(MapColor.RED)));
    public static final Block MOBIUS_FUEL_BLOCK = registerBlock("mobius_fuel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).mapColor(MapColor.RED)));
    public static final Block AETERNALIS_FUEL_BLOCK = registerBlock("aeternalis_fuel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).mapColor(MapColor.WHITE)));

    public static void registerBlocks() {
        ProjectE.LOGGER.info("Registering mod blocks");
        FuelRegistry.INSTANCE.add(ALCHEMICAL_COAL_BLOCK, 16000 * 4);
        FuelRegistry.INSTANCE.add(MOBIUS_FUEL_BLOCK, 16000 * 4 * 4);
        FuelRegistry.INSTANCE.add(AETERNALIS_FUEL_BLOCK, 16000 * 4 * 4 * 4);
    }

    private static Block registerBlock(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(ProjectE.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(ProjectE.MOD_ID, name), block);
    }
}
