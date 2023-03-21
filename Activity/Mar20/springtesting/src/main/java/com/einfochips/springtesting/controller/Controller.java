/**
 * 
 */
package com.einfochips.springtesting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 158417
 *
 */
@RestController
public class Controller {
	
	@RequestMapping("/home")
	public String getHome() {
		return "Hello Home Page";
	}
	
	@RequestMapping("/index")
	public String getIndex() {
		return "Hey";
	}
}
