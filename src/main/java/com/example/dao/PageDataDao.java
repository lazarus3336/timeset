package com.example.dao;

import com.example.entity.PageData;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class PageDataDao {
	
	@Autowired
	private PageDataMapper pd;
	
	public void insert(PageData record) {
		pd.insert( record);
	}
	
    

}