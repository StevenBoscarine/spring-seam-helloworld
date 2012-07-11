package org.jboss.as.quickstarts.seamspringhelloworld.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.as.quickstarts.seamspringhelloworld.jee.cdi.CDIExample;
import org.jboss.as.quickstarts.seamspringhelloworld.spring.SimpleBean;
import org.jboss.as.quickstarts.seamspringhelloworld.spring.autowired.SimpleAutowiredBean;

/**
 * Standard Servlet 3.0 Servlet.
 * Annotations enable us to register servlet without a web.xml entry.  <p>By default, the servlet below can be viewed at http://localhost:8080/seam-spring-helloworld/</p>
 */
@WebServlet(name = "springHelloWorld", urlPatterns = "/")
public class ServletExample extends HttpServlet {
    // Inject CDI managed beans 
    @Inject
    private CDIExample cdi;
    //The CDISpringBridge exposes this Spring bean as a CDI bean.
    @Inject
    private SimpleAutowiredBean springAutowired;
    //The CDISpringBridge exposes this Spring bean as a CDI bean.
    @Inject
    private SimpleBean springXML;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>" + "<head><title>Spring Servlet Injection Example</title></head>" + "<body>"
                + "<h1>Ladies and Gentlemen...Behold!!!</h1>"
                + "<p>This Servlet contains the following resources injected:</p>" + "<ul>"
                // Simple HTML output.  We're listing each bean to the user to confirm they were injected correctly.
                + "<li>A Spring Bean constructed via annotations: [" + springAutowired + "]</li>"
                //
                + "<li>A Spring Bean constructed via XML: [" + springXML + "]</li>"
                //
                + "<li>An ordinary CDI Bean:[" + cdi + "]</li>" +

                "</ul>" + "</body>" + "</html>");
    }

    private static final long serialVersionUID = 1L;
}