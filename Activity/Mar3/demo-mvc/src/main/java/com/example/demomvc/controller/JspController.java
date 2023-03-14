/**
 * 
 */
package com.example.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demomvc.jdbc.UserDAO;
import com.example.demomvc.model.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author 158417
 *
 */
@Controller
public class JspController {

	@RequestMapping("/index")
	public String fristPage() {
		return "index.jsp";
	}

	@RequestMapping("/register")
	public String RegPage() {
		return "registration.jsp";
	}

	/*
	 * @RequestMapping("/adddata") public String addRegister(HttpServletRequest req)
	 * { System.out.println(req.getParameter("uname"));
	 * System.out.println(req.getParameter("email"));
	 * System.out.println(req.getParameter("pass"));
	 * System.out.println(req.getParameter("address"));
	 * System.out.println(req.getParameter("mobile")); return
	 * req.getParameter("uname"); }
	 */

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}

	/*
	 * @RequestMapping("/adddata") public ModelAndView
	 * addRegister(HttpServletRequest req) { ModelAndView mv = new
	 * ModelAndView("success.jsp"); String name = req.getParameter("uname"); if
	 * (name.length() >= 1) { mv.addObject("value1", name); } else {
	 * mv.addObject("value1", "you have entered less than 1"); }
	 * 
	 * // return req.getParameter("uname"); return mv; }
	 */
	
//	@RequestMapping("/adddata")
//	public ModelAndView addRegister(HttpServletRequest req) {
//		ModelAndView mv = new ModelAndView("success.jsp");
//		String name = req.getParameter("uname");
//		if (name.length() >= 1) {
//			mv.addObject("value1", name);
//		} else {
//			mv.addObject("value1", "you have entered less than 1");
//		}
//
//		
//		return mv;
//	}

	@RequestMapping("/adddata")
	public ModelAndView addRegister(HttpServletRequest req) {

		User user = new User();
//		ModelAndView mv = new ModelAndView("success.jsp");
		String name = req.getParameter("uname");
		String password = req.getParameter("pass");

		user.setName(name);
		user.setPassword(password);
		UserDAO ud = new UserDAO();
		ud.save(user);
		
		l
		if (name.length() >= 1) {
			mv.addObject("value1", name);
		} else {
			mv.addObject("value1", "you have entered less than 1");
		}

		return mv;
	}

}
