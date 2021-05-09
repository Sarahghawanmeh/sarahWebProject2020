package com.example.demo.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.pwease;
@Repository
@Transactional
public interface demodemo extends JpaRepository<pwease,Integer>{
	

}
