package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.pwease;
import com.example.demo.service.pweaseService;

@RestController
public class admin {
	@Autowired
	pweaseService uDao;
	
	@PostMapping(
			  value = "/admin/addpwease", consumes = "application/json", produces = "application/json")
	public pwease  addpwease(@RequestBody pwease usr)
	{
		//ResponseEntity<String>
		pwease n = new  pwease();
		System.out.println(usr);
		n.setEmail(usr.getEmail());
		n.setFname(usr.getFname());
		n.setLname(usr.getLname());
		n.setPhone(usr.getPhone());
		n.setPassword(usr.getPassword());
		
		 HttpHeaders httpHeaders = new HttpHeaders();

	    //  return new ResponseEntity<>("{}", httpHeaders, HttpStatus.CREATED);
		 return n;
		
	}
	@GetMapping("/admin/getAll")
	public Collection<pwease>getAllUsers()
	{
		return uDao.getAllpwease();
	}
	
	@RequestMapping("/admin/testMethods/hi")
	@ResponseBody
	public String printHi()
	{
		return "hi";
	}

}



