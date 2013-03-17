package com.johnpurchase.recipe.control;

public enum AppCommand {
	
	UNDEFINED ("undefined"),
	HELLO ("hello"),
	VIEW_RECIPE ("view_recipe");

	private final String key;

	AppCommand(String key) {
		this.key = key;
	}
	
	public final String getKey() {
		return key;
	}

}
