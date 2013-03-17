package com.johnpurchase.recipe.control;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class AppControlServletTest {

	@Test
	public void testDoGetDoPost() throws Exception {
		
		HttpServletRequest req = mock(HttpServletRequest.class);
		when(req.getParameter("cmd")).thenReturn("hello");
		HttpServletResponse resp = mock(HttpServletResponse.class);
		
		AppControlServlet subject = new AppControlServlet();
		
		subject.doGet(req, resp);
		subject.doPost(req, resp);
	}

}
