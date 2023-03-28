/**
 * 
 */
package com.einfochips.SpringJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.SpringJPA.dao.MovieDAO;
import com.einfochips.SpringJPA.model.Movie;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author 158417
 *
 */
@RestController
public class Controller {
	
	@Autowired
	MovieDAO md;

	@RequestMapping("/")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("addMovie")
	public ModelAndView addMovie() {
		return new ModelAndView("addMovie");
	}

	@RequestMapping(value = "insertMovie", method = RequestMethod.POST)
	public ModelAndView insertMovie(HttpServletRequest req, @RequestParam("mname") String movieName,
			@RequestParam String lang) {
//		int movieId = Integer.parseInt(req.getParameter("mid"));

		Movie mv = new Movie(0, movieName, req.getParameter("dir"), lang);
		md.save(mv);
		System.out.println(mv);
		return new ModelAndView("success");
	}

	@RequestMapping("viewMovies")
	public ModelAndView viewMovies() {
		ModelAndView mv = new ModelAndView("viewallmovies");
		List<Movie> li = md.findAll();
		mv.addObject("movies",li);
		return mv;
	}
	
	@RequestMapping("viewmoviebylaguage")
	public ModelAndView viewMoviesByLang(String lang) {
		ModelAndView mv = new ModelAndView("viewbylang");
		List<Movie> li = md.findMovieByLanguage(lang);
		mv.addObject("movies", li);
		mv.addObject("lang",lang);
		return mv;
	}
//	
	@RequestMapping("deleteMovie")
	public void delMovie(@RequestParam("movieId") int movieId ) {
		ModelAndView mv1 = new ModelAndView("viewallMovies");
		md.deleteMovieById(movieId);
		
	}
	
//	@RequestMapping("editMovie")
//	public ModelAndView getMovieById(@RequestParam("id") int id) {
//		ModelAndView mv = new ModelAndView("editMovie");
//		Movie m = md.getById(id);
//		
//		mv.addObject("movie", m);
//		return mv;
//	}

}
