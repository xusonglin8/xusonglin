package com.cn.tai.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.tai.pojo.Person;

public class JavaConfig implements ApplicationContextAware {

private ApplicationContext context;

public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	context=new ClassPathXmlApplicationContext("application.xml");
	Person person=(Person)context.getBean("person");
}

}