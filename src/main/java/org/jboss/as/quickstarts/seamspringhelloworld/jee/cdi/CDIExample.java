package org.jboss.as.quickstarts.seamspringhelloworld.jee.cdi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.as.quickstarts.seamspringhelloworld.jee.Element;

/**
 * Example of 'vanilla' CDI Bean. We will inject this via CDI into a Servlet and into Spring via seam-spring.
 */
public class CDIExample {
    
    @SuppressWarnings("unchecked")
    public List<Element> listAllPeriodicTableElements() {
        return em.createQuery("from Element").getResultList();
    }

    /**
     * This method is handy for displaying debugging information.
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " was constructed by CDI";
    }

    @PersistenceContext
    private EntityManager em;
}