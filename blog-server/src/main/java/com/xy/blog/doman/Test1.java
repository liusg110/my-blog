package com.xy.blog.doman;

import java.util.Date;

public class Test1 {
    /** */
    private Long id;

    /** */
    private String name;

    /** */
    private Date update1;

    /** */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getUpdate1() {
        return update1;
    }

    public void setUpdate1(Date update1) {
        this.update1 = update1;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Test1(Long id, String name, Date update1, Date updateTime) {
        this.id = id;
        this.name = name;
        this.update1 = update1;
        this.updateTime = updateTime;
    }
}