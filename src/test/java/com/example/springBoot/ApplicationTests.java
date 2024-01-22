package com.example.springBoot;

import com.example.springBoot.test.MathHelper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ComponentScan(basePackages = "com.example.springBoot")
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	MathHelper mathHelper;

//	@Test
//	public void add001(){
//		int actualResult = mathHelper.add(2,3);
//		int expect = 5;
//		assertEquals(expect,actualResult);
//	}
//
//	@Test
//	public void add002(){
//		int actualResult = mathHelper.add2(2,0);
//		int expect = 2;
//		assertEquals(actualResult,expect);
//	}
}
