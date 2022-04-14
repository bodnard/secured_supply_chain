package com.validation.suplychain.demonstration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class DemonstrationController {

	@GetMapping("/")
	public String index() {
		return "Demonstration App <br>"
				+ "time: " + Instant.now();
	}

}
