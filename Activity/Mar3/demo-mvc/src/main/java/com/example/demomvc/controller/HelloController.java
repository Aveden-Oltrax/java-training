/**
 * 
 */
package com.example.demomvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 158417
 *
 */

@RestController
public class HelloController {

	
	@RequestMapping("/coffee")
	public String getCoffee() {
		return "Coffee";
	}
}
