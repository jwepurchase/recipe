package com.johnpurchase.recipe;

import org.apache.tiles.startup.TilesInitializer;
import org.apache.tiles.web.startup.AbstractTilesListener;

public class RecipeTilesListener extends AbstractTilesListener {

	@Override
	protected TilesInitializer createTilesInitializer() {
		return new RecipeTilesInitializer();
	}
	

}
