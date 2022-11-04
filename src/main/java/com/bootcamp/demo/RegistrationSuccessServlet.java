package com.bootcamp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bootcamp.demo.bean.RegistrationFormBean;

/**
 * Servlet implementation class RegistrationSuccessServlet
 */
//@WebServlet("/RegistrationSuccessServlet")
public class RegistrationSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LogManager.getLogger(ServletB.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final RegistrationFormBean registrationFormBean = (RegistrationFormBean) request
				.getAttribute("registrationFormBean");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(String.format("<h1>Welcome %s %s</h1>", registrationFormBean.getFirstName(),
				registrationFormBean.getLastName()));
//		out.println(String.format("<h1>%s</h1>", email));
		out.flush();
		out.close();
		
		LOGGER.info("action=registration, status=success, registration_form_bean={}", registrationFormBean);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
