package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestingApplication {
	
	
	
	
	@PostMapping("/posting")
	public String post() {
		return "this is posting message";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerTestingApplication.class, args);
	}

}
