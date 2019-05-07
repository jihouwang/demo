package com.ceshi.demo.controller;

import com.ceshi.demo.entity.Student;
import com.ceshi.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 姬厚望 on 2019/3/7.
 */
@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    public String StuList(Model model,HttpSession session){
        List<Student> stuList = studentService.StudentFindAll();
        //model.addAttribute("stuList",stuList);
        session.setAttribute("stuList",stuList);
        return "index";
    }
}
