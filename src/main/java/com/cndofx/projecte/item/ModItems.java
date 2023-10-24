package com.cndofx.projecte.item;

import com.cndofx.projecte.ProjectE;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PHILOSOPHERS_STONE = registerItem("philosophers_stone",
            new Item(new FabricItemSettings()));

    public static final ItemGroup PROJECTE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ProjectE.MOD_ID, "projectegroup"),
            FabricItemGroup
                    .builder()
                    .displayName(Text.translatable("projectegroup"))
                    .icon(() -> new ItemStack(ModItems.PHILOSOPHERS_STONE))
                    .entries((displayContext, entries) -> {
                        entries.add(PHILOSOPHERS_STONE);
                    }).build());

    public static void registerItems() {
        ProjectE.LOGGER.info("Registering mod items");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ProjectE.MOD_ID, name), item);
    }
}
