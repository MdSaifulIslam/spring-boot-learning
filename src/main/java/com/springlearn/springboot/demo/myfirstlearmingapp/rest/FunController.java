package com.springlearn.springboot.demo.myfirstlearmingapp.rest;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String printHello() {

		return "===> Time updated test:- " + LocalTime.now() + "  " + coachName + "  " + teamName;
	}
	
	@GetMapping("/workout")
	public String getWorkout() {
		
		return "===> Time started for workout not:- " + LocalTime.now();
	}

}
