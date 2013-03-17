package com.johnpurchase.recipe;

import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.factory.BasicTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.startup.AbstractTilesInitializer;

public class RecipeTilesInitializer extends AbstractTilesInitializer {

	@Override
	protected AbstractTilesContainerFactory createContainerFactory(
			ApplicationContext ctx) {
		BasicTilesContainerFactory result = new BasicTilesContainerFactory();
		assert result != null;
		return new BasicTilesContainerFactory();
	}

}
