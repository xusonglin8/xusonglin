package com.cn.tai.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Value("aaa")
  private String name;
	@Value("18")
  public int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public Person() {
	super();
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}

}
