package com.ceshi.demo.entity;

import java.util.List;

/**
 * Created by 姬厚望 on 2019/3/7.
 */
public class Grade {

    private Integer id;
    private String  gradename;
    //学生集合
    private List<Student> stuList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }

    public List <Student> getStuList() {
        return stuList;
    }

    public void setStuList(List <Student> stuList) {
        this.stuList = stuList;
    }
}
