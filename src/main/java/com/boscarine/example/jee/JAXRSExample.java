package com.boscarine.example.jee;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/webservice")
@RequestScoped
public class JAXRSExample {
	@GET
	@Path("/helloWorld")
	public String simpleDiagnostics() {
		return "Hello World";
	}
}
