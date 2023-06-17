package com.example.dailyCodeBuffer.SpringBoot.Tutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
class HelloController {

	@GetMapping("/")
	public String helloWorld()
	{
		return "Welcome........To.........Dubai...._________Funny..............";
	}
}
