package com.boscarine.example.spring;

import com.boscarine.example.jee.CDIExample;

/**
 * This is a simple bean wired via Spring XML configuration.
 */
public final class SimpleBean {
	/**
	 * Injected from Spring
	 */
	private final String source;
	/**
	 * CDI bean constructed by CDI and passed to Spring container.
	 */
	private final CDIExample cdiBean;

	/**
	 * This method is handy for displaying debugging information.
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " was constructed by " + source + " and has a child bean: " + cdiBean;
	}

	public SimpleBean(String source, CDIExample cdiInjectedBean) {
		super();
		this.source = source;
		this.cdiBean = cdiInjectedBean;
	}
}
