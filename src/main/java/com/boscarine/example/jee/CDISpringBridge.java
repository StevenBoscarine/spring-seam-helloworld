package com.boscarine.example.jee;

import javax.enterprise.inject.Produces;

import org.jboss.seam.spring.context.SpringContext;
import org.jboss.seam.spring.context.Web;
import org.jboss.seam.spring.inject.SpringBean;
import org.springframework.context.ApplicationContext;

import com.boscarine.example.spring.SimpleBean;
import com.boscarine.example.spring.autowired.SimpleAutowiredBean;

/**
 * We use this bean to expose Spring classes to CDI.
 */
@SuppressWarnings("unused")
public class CDISpringBridge {
	// Is this boilerplate?
	@Produces
	@Web
	@SpringContext
	private ApplicationContext context;

	//For each bean we wish to inject into a CDI-managed resource, we do need a CDI producer method.
	@Produces
	@SpringBean
	private SimpleAutowiredBean autowiredBean;
	@Produces
	@SpringBean
	private SimpleBean xmlWiredBean;
}
