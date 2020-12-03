package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1")
public class WelcomeController {
	@RequestMapping("hello")
	@ResponseBody
	public String display(){
		return "welcome to java express";
	}

}
//http://localhost:8888/api/v1/hello
//GET
//POST
//DELETE
//UPADTE