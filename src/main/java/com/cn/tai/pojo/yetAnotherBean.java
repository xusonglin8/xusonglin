package com.cn.tai.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class yetAnotherBean {
private String name="yetanotherbean";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public yetAnotherBean(String name) {
	super();
	this.name = name;
}
public yetAnotherBean() {
	super();
}

}
