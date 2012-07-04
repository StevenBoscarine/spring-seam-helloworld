package com.boscarine.example.jee;

/**
 * Example of 'vanilla' CDI Bean.  We will inject this via CDI into a Servlet and into Spring via seam-spring.
 */
public class CDIExample {
	private final String source;

	public CDIExample(String source) {
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
