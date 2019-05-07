package com.ceshi.demo;

import com.ceshi.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private StudentService studentService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testttt(){
		List list = studentService.StudentFindAll();
	}

}
