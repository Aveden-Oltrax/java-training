/**
 * 
 */
package com.einfochips.progtest.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.progtest.Model.User;
import com.einfochips.progtest.dao.UserDAO;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author 158417
 *
 */
@RestController
public class AppController {

	@Autowired
	UserDAO userdao;

	@RequestMapping(value = "/register")
	public ModelAndView getRegister() {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/login")
	public ModelAndView getLogin() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/register-user", method = RequestMethod.POST)
	public ModelAndView registerUser(HttpServletRequest req) {
		LocalDate date = LocalDate.parse(req.getParameter("date-input"));
		User user = new User(0, req.getParameter("uname"), req.getParameter("fname"), req.getParameter("lname"),
				req.getParameter("password"), req.getParameter("gender"), date, "user", req.getParameter("location"));
		System.out.println(user);
		userdao.save(user);
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login-user", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest req) {
		String userName = req.getParameter("uname");
		String password = req.getParameter("password");

		User user = userdao.findByEmail(userName);
		if (user != null && user.getPassword().equals(password)) {
			return new ModelAndView("success");
		} else {
			return new ModelAndView("invalid");
		}
	}

}
