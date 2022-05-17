package com.genx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genx.model.Genx;

@RestController
@RequestMapping("/genx")
public class GenxController {

	@GetMapping("/")
	public String get() {
		return "welcome to genx";
	}

	@GetMapping("/nexus")
	public String nex() {
		return "Congratulation nexus is working fine";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Genx firstPage() {

		Genx emp = new Genx();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

}
