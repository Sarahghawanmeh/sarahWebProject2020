package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.demodemo;
import com.example.demo.models.pwease;

@Service
public class pweaseService {
	@Autowired
	private demodemo repos;

	public demodemo getRepos() {
		return repos;
	}

	public void setRepos(demodemo repos) {
		this.repos = repos;
	}
	public pwease addPwease(pwease usr) {
return repos.save(usr);
	}
	public Collection<pwease> getAllpwease(){
		return repos.findAll();
	}
	public void deleterPwease(pwease u) {
		repos.delete(u);
	}


	
		
		
	
}
