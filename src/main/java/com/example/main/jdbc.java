package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class jdbc {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public void hello() {
	
		System.out.println("EXCUTE INSERT MEMBER");
		jdbcTemplate.update(
				"INSERT INTO ecip.enterprise_data (enterprise_id, enterprise_name, enterprise_email, enterprise_email_domain,"
				+ " bound_cathay_wellness_data,"
				+ " bound_cathay_group_ins_data, data_create_time, data_update_time, data_update_user) "
						+ "VALUES (?,?,?,?,?,?,NOW(),NOW(),?)",1,1,1,1,1,1,1 );
		
	}
}
