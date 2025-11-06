package com.SampleJenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/getHello")
	public String hellowWorld() {
		return "Hello World from jenkins";
	}
}
