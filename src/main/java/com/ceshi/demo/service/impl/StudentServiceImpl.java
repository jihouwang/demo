package com.ceshi.demo.service.impl;

import com.ceshi.demo.dao.StudentMapper;
import com.ceshi.demo.entity.Student;
import com.ceshi.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 姬厚望 on 2019/3/12.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List <Student> StudentFindAll() {
        return  studentMapper.findAll();
    }
}