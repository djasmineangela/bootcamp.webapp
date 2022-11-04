package com.bootcamp.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ServletA extends HttpServlet{

	private static final long serialVersionUID = 4835150738055117383L;
	private static final Logger LOGGER = LogManager.getLogger(ServletA.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info("action=do_get, source=servlet_a");
		
		final ServletContext context = getServletContext();
		context.setAttribute("name", "John Doe");
		req.setAttribute("email", "john.doe@gmail.com");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/servletb");
		dispatcher.forward(req, resp); // it connects the servlet a and b // it forwards the same reference, same request chain
//		resp.sendRedirect("./servletb");
	}

}
