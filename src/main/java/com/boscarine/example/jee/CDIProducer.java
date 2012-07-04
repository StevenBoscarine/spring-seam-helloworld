package com.boscarine.example.jee;

import java.util.Date;

import javax.enterprise.inject.Produces;

/**
 * This is a 'vanilla' CDI Producer class. There's nothing special about this
 * class. The @Produces method could be put on any class. We declared it in
 * isolation for readability.
 */
@SuppressWarnings("unused") // Tells eclipse not to complain that this private method is never used.
public class CDIProducer {
	/**
	 * Used by CDI only.  
	 * @return CDIExample bean to CDI container.
	 */
	@Produces
	private CDIExample cdiExampleFactory() {
		return new CDIExample("CDI at " + new Date());
	}
}
