package com.example.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class PageData {
    private String pageId;

    private String pageName;

    private String parentMenuId;

    private String parentPageId;

    private Integer serNo;

    private String effective;

    private String url;

    private LocalDateTime dataCreateTime;

    private LocalDateTime dataUpdateTime;

    private String dataUpdateUser;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getParentPageId() {
        return parentPageId;
    }

    public void setParentPageId(String parentPageId) {
        this.parentPageId = parentPageId;
    }

    public Integer getSerNo() {
        return serNo;
    }

    public void setSerNo(Integer serNo) {
        this.serNo = serNo;
    }

    public String getEffective() {
        return effective;
    }

    public void setEffective(String effective) {
        this.effective = effective;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(LocalDateTime dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public LocalDateTime getDataUpdateTime() {
        return dataUpdateTime;
    }

    public void setDataUpdateTime(LocalDateTime dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
    }

    public String getDataUpdateUser() {
        return dataUpdateUser;
    }

    public void setDataUpdateUser(String dataUpdateUser) {
        this.dataUpdateUser = dataUpdateUser;
    }
}