package com.genx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genx")
public class GenxController {
	
	@GetMapping("/")
	public String get() {
		return "welcome to genx";
	}

}
