package com.cn.tai.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	int count=context.getBeanDefinitionCount();
	System.out.println("¸öÊý"+count);
	String[] names=context.getBeanDefinitionNames();
	for(String name:names) {
		System.out.println(name+"-->");
		Object bean=context.getBean(name);
		System.out.println(bean.getClass());
	}
}
@Test
public void test() {
}
}