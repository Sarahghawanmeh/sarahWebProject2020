package com.example.demo.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.pwease;
@Repository
@Transactional
public interface demodemo extends JpaRepository<pwease,Integer>{
	

	@Query("select a from pwease a where a.email=:email and a.password=:password")
	public pwease checkUser(@Param("email") String email , @Param("password")String password);
}
