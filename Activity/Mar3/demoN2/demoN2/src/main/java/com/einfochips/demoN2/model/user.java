/**
 * 
 */
package com.einfochips.demoN2.model;

/**
 * @author 158417
 *
 */
public class user {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public user(String name) {
		super();
		this.name = name;
	}


	

}
