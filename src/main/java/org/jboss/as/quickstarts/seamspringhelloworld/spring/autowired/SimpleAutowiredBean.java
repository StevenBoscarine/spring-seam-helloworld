package org.jboss.as.quickstarts.seamspringhelloworld.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * This is a simple bean, proving that we can use annotation-based Spring config from Spring 2.x+. Everything in this class can
 * run in any Spring container.
 */
@Component
public final class SimpleAutowiredBean {
    private final String source;

    @Autowired
    private SimpleAutowiredBean(@Qualifier("source") String source) {
        super();
        this.source = source;
    }

    /**
     * This method is handy for displaying debugging information.
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " was constructed by " + source;
    }
}
