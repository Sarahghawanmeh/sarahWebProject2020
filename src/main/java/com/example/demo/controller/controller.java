package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller{
	@RequestMapping("/test")
	@ResponseBody
public String name(){
		return "hi everybody, how r u?";
}
	@GetMapping("/hello")
	@ResponseBody
	public String hello (@RequestParam(value="name", defaultValue="world")String name) {
		return String.format("hello %s!", name);
	}
}