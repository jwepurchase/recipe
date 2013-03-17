package com.johnpurchase.recipe.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AppState {
	
	private static final HashMap<String, AppCommand> commandMap = new HashMap<String, AppCommand>();
	static {
		assert commandMap.isEmpty();
		for (AppCommand cmd : AppCommand.values()) {
			assert cmd != null;
			assert cmd.getKey() != null : "command key is null";
			
			commandMap.put(cmd.getKey(), cmd);
		}
	}
	
	private static Logger log = Logger.getLogger(AppState.class.getName());
	
	public final AppState handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		AppState next = transition(getCommand(req));
		assert next != null : "transition failed to return valid AppState";
		log.info("State is same type? " + getClass().equals(next.getClass()));
		
		next.processRequest(req, resp);
		return next;
	}
	
	protected abstract AppState transition(AppCommand command);
	
	protected abstract void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException;
	
	private AppCommand getCommand(HttpServletRequest req) {
		
		assert req != null : "request was null";
		
		AppCommand result = commandMap.get(req.getParameter("cmd"));
		if (result == null){
			log.warning("Application command '" + req.getParameter("cmd") + "' is not defined");
			result = AppCommand.UNDEFINED;
		}
		
		assert result != null : "didn't find " + req.getParameter("cmd") + " in AppCommand map";
		return result;
	}

}
