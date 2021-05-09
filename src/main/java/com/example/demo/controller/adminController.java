package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.pwease;
import com.example.demo.service.pweaseService;

@RestController
public class adminController {
	@Autowired
	private pweaseService serv;
	
	@PostMapping("admin/addPwease")
	public String addPweases(pwease u) {
		serv.addPwease(u);
		return "good";
	}

}
