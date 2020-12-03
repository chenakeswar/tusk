package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class EmployeeController {
	@RequestMapping("hello")

	public String display(){
		return "welcome to java express ";
	}
	@RequestMapping("employees")
	public String displayValues(){
		return "welcome to java express in the book";
	}

}
//http://localhost:8888/api/v2/hello/employees
//GET
//POST
//DELETE
//UPADT