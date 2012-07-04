package com.boscarine.example.jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boscarine.example.spring.SimpleBean;
import com.boscarine.example.spring.autowired.SimpleAutowiredBean;

/**
 * Standard Servlet 3.0 Servlet.
 * 
 * @author sboscarine
 * 
 */
@WebServlet(name = "springHelloWorld", urlPatterns = "/")
// replaces config in web.xml
public class ServletExample extends HttpServlet {
	// put in by author to make development easier...ensures I know if change
	// was reloaded correctly.
	private static Date constructionDate = new Date();

	@Inject
	private SimpleAutowiredBean springAutowired;
	@Inject
	private SimpleBean springXML;
	@Inject
	private CDIExample cdi;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>" + "<head><title>Spring Servlet Injection Example</title></head>" + "<body>"
				+ "<h1>Ladies and Gentlemen!!!....Behold!...</h1>"
				+ "<p>This Servlet contains the following resources injected:</p>" + "<ul>"
				+ "<li>A Spring Bean constructed via annotations: [" + springAutowired + "]</li>"
				+ "<li>A Spring Bean constructed via XML: [" + springXML + "]</li>" + 
				"<li>An ordinary CDI Bean:[" + cdi+ "]</li>" +

				"</ul>" + "<div>constructed at " + constructionDate + "</div>" + "</body>" + "</html>");
	}

	private static final long serialVersionUID = 1L;
}