/**
 * 
 */
package com.einfochips.springtesting.model;

/**
 * @author 158417
 *
 */
public class Member {
	
	private String email;
	private String name;
	private String mobile;
	private String gender;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Member() {
	}
	public Member(String email, String name, String mobile, String gender) {
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
	}
	
	
	

}
