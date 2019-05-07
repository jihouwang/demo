package com.ceshi.demo.dao;

import com.ceshi.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 姬厚望 on 2019/3/8.
 */
@Mapper
public interface StudentMapper {
   public List<Student> findAll();
}
