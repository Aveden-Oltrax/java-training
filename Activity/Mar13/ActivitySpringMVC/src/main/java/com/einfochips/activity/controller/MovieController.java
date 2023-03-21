/**
 * 
 */
package com.einfochips.activity.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.activity.dao.TicketDAO;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author 158417
 *
 */
@RestController
public class MovieController {
	
	@Autowired
	TicketDAO td;

	@RequestMapping("/home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/bookTicket")
	public ModelAndView addMovie() { 
		return new ModelAndView("bookticket");
	}

	@RequestMapping(value = "/checkAvailability", method = RequestMethod.POST)
	public boolean checkAvailability(HttpServletRequest req) {
		
		String mob = req.getParameter("phone");
		String mname = req.getParameter("moviename");
		String date = req.getParameter("date-input");
		String showTime = req.getParameter("showtime");
		String ticketType = req.getParameter("ttype");
		String noOfTickets = req.getParameter("integer");
		
		System.out.println(mob+ mname + date+ showTime +ticketType + noOfTickets);
		
		return false;

	}
}
