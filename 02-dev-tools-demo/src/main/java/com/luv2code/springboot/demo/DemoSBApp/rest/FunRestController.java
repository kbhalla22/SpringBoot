package com.luv2code.springboot.demo.DemoSBApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//expose a / end point
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the server is" +LocalDateTime.now();
	}
	
	//expose a new endpoind for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "run a hard 5k";
	}
}
