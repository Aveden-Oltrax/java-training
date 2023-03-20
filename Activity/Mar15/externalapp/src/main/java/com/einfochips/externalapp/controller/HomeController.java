/**
 * 
 */
package com.einfochips.externalapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author 158417
 *
 */
@RestController
public class HomeController {
	

	WebClient wc = WebClient.create();
	
	
	
	@RequestMapping("trainee")
	public ResponseEntity<String> getTrainee(){
		RestTemplate rt = new RestTemplate();
		return rt.getForEntity("http://localhost:8080/ext", String.class);
	}
	
//	@RequestMapping("reacttrainer")
//	public Flux<String> getreact(){
//		return wc.get().uri("http://loalhost:8080/exttrainer").retrieve().bodyToFlux(String.class);
//	}

}
