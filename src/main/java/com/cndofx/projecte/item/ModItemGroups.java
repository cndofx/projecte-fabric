package com.cndofx.projecte.item;

import com.cndofx.projecte.ProjectE;
import com.cndofx.projecte.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PROJECTE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ProjectE.MOD_ID, "projectegroup"),
            FabricItemGroup
                    .builder()
                    .displayName(Text.translatable("projectegroup"))
                    .icon(() -> new ItemStack(ModItems.PHILOSOPHERS_STONE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PHILOSOPHERS_STONE);

                        entries.add(ModItems.ALCHEMICAL_COAL);
                        entries.add(ModItems.MOBIUS_FUEL);
                        entries.add(ModItems.AETERNALIS_FUEL);

                        entries.add(ModBlocks.ALCHEMICAL_COAL_BLOCK);
                        entries.add(ModBlocks.MOBIUS_FUEL_BLOCK);
                        entries.add(ModBlocks.AETERNALIS_FUEL_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        ProjectE.LOGGER.info("Registering mod item groups...");
    }
}
