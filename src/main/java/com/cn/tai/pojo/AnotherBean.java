package com.cn.tai.pojo;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

/*	public AnotherBean(String name) {
		super();
		this.name = name;
	}*/

	public AnotherBean() {
		super();
	}

}
