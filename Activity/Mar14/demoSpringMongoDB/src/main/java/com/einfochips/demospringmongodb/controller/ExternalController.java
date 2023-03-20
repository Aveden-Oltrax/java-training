/**
 * 
 */
package com.einfochips.demospringmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.demospringmongodb.model.Trainee;
import com.einfochips.demospringmongodb.repo.TraineeRepo;

/**
 * @author 158417
 *
 */
@RestController
public class ExternalController {
	
	@Autowired
	TraineeRepo tr;
	
	
	@GetMapping("ext")
	public List<Trainee> getTrainers(){
		return tr.findAll();
	}

}
