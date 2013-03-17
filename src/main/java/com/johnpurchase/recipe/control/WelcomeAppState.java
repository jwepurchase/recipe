package com.johnpurchase.recipe.control;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeAppState extends AppState {
	
	private static Logger log = Logger.getLogger(WelcomeAppState.class.getName());

	@Override
	protected AppState transition(AppCommand command) {
		
		assert command != null : "null command";
		
		AppState result;
		switch(command) {
		case VIEW_RECIPE:
			result = new RecipeViewState();
			break;
			
		default:
			log.info("using default mapping");
			result = new RecipeViewState();
		}
		
		assert result != null : "failed to map transition";
		return result;
	}

	@Override
	protected void processRequest(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		
		assert req != null : "null request";
		assert resp != null : "null response";
		
		resp.sendRedirect("welcome.jsp");
		
	}

}
