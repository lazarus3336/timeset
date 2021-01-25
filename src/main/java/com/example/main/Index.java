package com.example.main;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

	@Autowired
	jdbc jdbc;
	
	@RequestMapping("/22")
	public String hello() {
		

		jdbc.hello();
		return "Hey, Spring Boot 的 Hello World ! ";
	}

}