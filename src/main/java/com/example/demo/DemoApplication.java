package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // Add this
import org.springframework.boot.builder.SpringApplicationBuilder; // Add this
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer { // Extend this

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

	@GetMapping("/")
	public String home() {
		return "Spring is here!- By Ibrahim Ajaoun et Aboubaker Tounli";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}