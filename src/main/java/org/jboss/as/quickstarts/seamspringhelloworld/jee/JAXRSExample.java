package org.jboss.as.quickstarts.seamspringhelloworld.jee;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.as.quickstarts.seamspringhelloworld.jee.cdi.CDIExample;

/**
 * This is a simple example of how to inject both Spring and CDI into a Java EE resource.
 * @author sboscarine
 *
 */
@Path("/webservice")
@RequestScoped
public class JAXRSExample {
    @GET
    @Path("/helloWorld")
    public String simpleDiagnostics() {
        return "Hello World";
    }

    @GET
    @Path("/elements")
    public List<Element> showElements() {
        return cdi.listAllPeriodicTableElements();
    }

    @Inject
    private CDIExample cdi;
}
