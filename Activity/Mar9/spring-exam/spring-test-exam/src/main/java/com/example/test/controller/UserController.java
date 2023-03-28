package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.model.User;
import com.example.test.repo.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository ur;
	
	@RequestMapping("/register")
	public ModelAndView registerPage() {
		
		return new ModelAndView("register.jsp");
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam String email, String firstname, String lastname, String password, String gender, String dob, String address) {
		
		ur.save(new User(email, firstname, lastname, password, gender, dob, address));
		
		return new ModelAndView("login.jsp");
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		
		return new ModelAndView("login.jsp");
	}
	
	@RequestMapping("/checkUser")
	public ModelAndView checkUser(@RequestParam String email, String password) {
		
		Optional<User> u = ur.findById(email);
		
		if (!u.isPresent()) {
			return new ModelAndView("failed.jsp");
		}
		else {
			User user = u.get();
			if (user.getPassword().equals(password)) {
				ModelAndView mv=new ModelAndView("success.jsp");
				mv.addObject("FirstName",user.getFirstname());
				mv.addObject("LastName",user.getLastname());
				
				return mv;
			}
			
				
			
		
			return new ModelAndView("failed.jsp");
	}

}}
