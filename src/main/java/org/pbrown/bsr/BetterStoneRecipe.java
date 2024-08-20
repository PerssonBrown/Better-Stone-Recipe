package org.pbrown.bsr;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterStoneRecipe implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("better-stone-recipe");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}