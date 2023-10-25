package com.cndofx.projecte;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cndofx.projecte.block.ModBlocks;
import com.cndofx.projecte.item.ModItemGroups;
import com.cndofx.projecte.item.ModItems;

public class ProjectE implements ModInitializer {
	public static final String MOD_ID = "projecte";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModItemGroups.registerItemGroups();
	}
}