package com.springlearn.springboot.demo.myfirstlearmingapp.rest;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
	
	@GetMapping("/")
	public String printHello() {

		return "===> Time updated test:- " + LocalTime.now();
	}
	
	@GetMapping("/workout")
	public String getWorkout() {
		
		return "===> Time started for workout not:- " + LocalTime.now();
	}

}
