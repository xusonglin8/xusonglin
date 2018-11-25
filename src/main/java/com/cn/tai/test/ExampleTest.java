package com.cn.tai.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.tai.pojo.Person;
@RunWith(JUnit4.class)
public class ExampleTest {
	private ApplicationContext context;
	@Test
	public void test01() {
		context=new ClassPathXmlApplicationContext("application.xml");
		Person person=(Person)context.getBean("person");
		System.out.println(person);
	}
}
