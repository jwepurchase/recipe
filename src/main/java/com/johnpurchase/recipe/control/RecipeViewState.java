package com.johnpurchase.recipe.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecipeViewState extends AppState {

	@Override
	protected AppState transition(AppCommand command) {
		AppState result;
		switch(command){
		case HELLO: 
			result = new WelcomeAppState();
			break;
			
		default:
			result = this;
		}
		
		return result;
	}

	@Override
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException {
		
		resp.sendRedirect("recipe.jsp");

	}

}
