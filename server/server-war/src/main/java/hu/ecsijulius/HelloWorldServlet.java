package hu.ecsijulius;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.inject.Inject;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Hello")
@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {

	@Inject
	TestClass test;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello AppEngine with GUICE!");

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		resp.getWriter().println("Date is: " + sdf.format(test.getDate()));
	}
}
