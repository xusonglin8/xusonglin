package com.cn.tai.pojo;

import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
	private int years;
	private String ultimateAnswer;
	public ExampleBean(int years, String ultimateAnswer) {
	this.years = years;
	this.ultimateAnswer = ultimateAnswer;
	}
	public ExampleBean() {
		super();
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getUltimateAnswer() {
		return ultimateAnswer;
	}
	public void setUltimateAnswer(String ultimateAnswer) {
		this.ultimateAnswer = ultimateAnswer;
	}
	
	}