package com.QATechTesting.rest.webservices.restfulwebservices;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	  @GetMapping({"/"})
	public String helloWorld(Principal principal) {
		  	//The Principal interface stores the name of the current user. Spring Security takes care of the dirty work: you only need to add it as an argument
		return "Hi... "+principal.getName();
	}

    //hello-world/with path-variable
	@GetMapping(path = "/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("You entered... , %s", name));
	}
}