package com.example.main;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.PageDataDao;
import com.example.dao.PageDataMapper;
import com.example.entity.PageData;

@Component
public class jdbc {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PageDataDao pageDataDao;
	
	@Autowired
	private PageData pd;
	
	public void hello() {
		
		pd.setDataCreateTime(LocalDateTime.now());
		pd.setDataUpdateTime(LocalDateTime.now());
		pd.setDataUpdateUser("2");
		pd.setEffective("Y");
		pd.setPageId("2");
		pd.setPageName("2");
		pd.setParentMenuId("2");
		pd.setParentPageId("2");
		pd.setSerNo(2);
		pd.setUrl("2");
	
		
		pageDataDao.insert(pd);
		
		System.out.println("EXCUTE INSERT MEMBER");
		jdbcTemplate.update(
				"INSERT INTO ecip.role_page (enterprise_id, role_id, page_id, read_only,"
				+ " data_create_time, data_update_time, data_update_user) "
						+ "VALUES (?,?,?,?,NOW(),NOW(),?)",1,1,1,1,1 );
		
	}
}
