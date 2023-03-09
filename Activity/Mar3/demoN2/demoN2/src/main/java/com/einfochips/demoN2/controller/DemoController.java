/**
 * 
 */
package com.einfochips.demoN2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 158417
 *
 */
@RestController
public class DemoController {
	@RequestMapping("/home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/register")
	public ModelAndView getRegistration() {
		return new ModelAndView("reg");
	}

	@RequestMapping("/checkUserGet")
	public ModelAndView getCheckGet(@RequestParam("uname") String name) {

		ModelAndView mv = new ModelAndView("successget");
		System.out.println(name);
		mv.addObject("value1", name);
		return mv;
	}
	
	@RequestMapping(value="/checkUserPost", method = RequestMethod.POST)
	public ModelAndView getCheckPost(@RequestParam("uname") String name) {

		ModelAndView mv = new ModelAndView("successpost");
		System.out.println(name);
		mv.addObject("value1", name);
		return mv;
	}

}
