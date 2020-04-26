package com.QATechTesting.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//public class RestfulWebServicesApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(RestfulWebServicesApplication.class, args);
//	}
@EnableSwagger2
	public class StartWebApplication extends SpringBootServletInitializer {

	    public static void main(String[] args) {
	        SpringApplication.run(StartWebApplication.class, args);
	    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(StartWebApplication.class);
	    }
	}
//}