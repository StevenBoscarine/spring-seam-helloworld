package org.jboss.as.quickstarts.seamspringhelloworld.spring;

import java.util.List;

import org.jboss.as.quickstarts.seamspringhelloworld.jee.Element;
import org.jboss.as.quickstarts.seamspringhelloworld.jee.cdi.CDIExample;

/**
 * This is a simple bean wired via Spring 1.x XML configuration.
 */
public final class SimpleBean {
    // Set to private because we only want this constructed by Spring
    private SimpleBean(String source, CDIExample cdiInjectedBean) {
        super();
        this.source = source;
        this.cdiBean = cdiInjectedBean;
    }

    // Injected from Spring
    private final String source;
    
    // CDI bean constructed by CDI and passed to Spring container.
    private final CDIExample cdiBean;

    /**
     * We're calling this query from Spring as an example of calling CDI from Spring.
     * 
     * @return results of our JPA query executed from a CDI bean.
     */
    public List<Element> listAllPeriodicTableElements() {
        return cdiBean.listAllPeriodicTableElements();
    }

    /**
     * This method is handy for displaying debugging information.
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " was constructed by " + source + " and has a child bean: " + cdiBean;
    }
}