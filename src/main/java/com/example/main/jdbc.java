package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class jdbc {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void hello() {
	
		System.out.println("EXCUTE INSERT MEMBER");
		jdbcTemplate.update(
				"INSERT INTO ecip.role_page (enterprise_id, role_id, page_id, read_only,"
				+ " data_create_time, data_update_time, data_update_user) "
						+ "VALUES (?,?,?,?,NOW(),NOW(),?)",1,1,1,1,1 );
		
	}
}
