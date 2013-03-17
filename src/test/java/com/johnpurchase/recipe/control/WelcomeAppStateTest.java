package com.johnpurchase.recipe.control;

import static org.junit.Assert.*;

import org.junit.Test;

public class WelcomeAppStateTest {

	@Test
	public void testTransition() {
		WelcomeAppState subject = new WelcomeAppState();
		
		assertEquals(RecipeViewState.class, subject.transition(AppCommand.VIEW_RECIPE).getClass());
	}

}
