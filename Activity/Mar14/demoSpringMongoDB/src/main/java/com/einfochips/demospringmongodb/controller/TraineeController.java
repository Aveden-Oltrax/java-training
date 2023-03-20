package com.einfochips.demospringmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.demospringmongodb.model.Trainee;
import com.einfochips.demospringmongodb.repo.TraineeRepo;

@RestController
public class TraineeController {
	
	@Autowired
	TraineeRepo tr;
	
	@RequestMapping("/insertTrainee")
	private ModelAndView insertTrainee() {
		ModelAndView mv = new ModelAndView("Success");
		Trainee t = new Trainee("1", "Akshay", "Pune");
		tr.save(t);
		return mv;
	}
	
	@RequestMapping("/viewTrainee")
	private List<Trainee> getTrainees() {
		return tr.findAll();
	}
	
	@RequestMapping("/updateTrainee")
	public Trainee UpdateTrainee() {
		return tr.save(new Trainee("2","Kavi","Mumbai"));
	}
	
//	@RequestMapping("/traineebyloc")
//	public List<Trainee> getTraineeByLoc(){
//		return tr.getTraineeByLocation();
//	}
//	
}	
