package com.example.dao;

import com.example.entity.PageData;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface PageDataMapper {
    int deleteByPrimaryKey(String pageId);

    int insert(PageData record);

    PageData selectByPrimaryKey(String pageId);

    List<PageData> selectAll();

    int updateByPrimaryKey(PageData record);
}