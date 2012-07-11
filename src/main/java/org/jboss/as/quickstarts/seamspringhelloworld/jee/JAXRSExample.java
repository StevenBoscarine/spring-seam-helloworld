package org.jboss.as.quickstarts.seamspringhelloworld.jee;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.as.quickstarts.seamspringhelloworld.spring.SimpleBean;

/**
 * This is a simple example of how to inject both Spring into a Java EE resource.
 * <p>
 * JAX-RS example, creates a simple REST service and calls a Spring bean.
 * </p>
 * <p>
 * By default, the service below can be viewed at http://localhost:8080/seam-spring-helloworld/rest/webservice/elements
 * </p>
 */
@Path("/periodicTable")
@RequestScoped
public class JAXRSExample {

    @GET
    @Path("/elements")
    public List<Element> showElements() {
        return springXML.listAllPeriodicTableElements();
    }

    //The CDISpringBridge exposes this Spring bean as a CDI bean.
    @Inject
    private SimpleBean springXML;
}
