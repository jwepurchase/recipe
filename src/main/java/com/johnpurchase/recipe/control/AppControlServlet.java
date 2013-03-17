package com.johnpurchase.recipe.control;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppControlServlet extends HttpServlet {
	
	private static final Logger LOG = Logger.getLogger(AppControlServlet.class.getName());
	
	private AppState state = new WelcomeAppState();

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		doRequest(req, resp);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		doRequest(req, resp);
	}
	
	private void doRequest(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		assert state != null : "state is null";
		
		LOG.info(getServletInfo());
		
		state = state.handleRequest(req, resp);
		
		assert state != null : "state switched to null";
	}

}
