package com.cn.tai.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
   public class AnotherExampleBean {
	//@Autowired                     
	//@Qualifier("aa")
	@Autowired
	private AnotherBean anotherBean;
	@Autowired
	private yetAnotherBean yetanotherBean;
	private int i ;
	
	
	public AnotherBean getAnotherBean() {
		return anotherBean;
	}


	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}


	public yetAnotherBean getYetanotherBean() {
		return yetanotherBean;
	}


	public void setYetanotherBean(yetAnotherBean yetanotherBean) {
		this.yetanotherBean = yetanotherBean;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	/*public AnotherExampleBean(@Autowired AnotherBean beanOne,@Autowired yetAnotherBean beanTwo, int i) {
		super();
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.i = i;
	}*/
	public AnotherExampleBean() {
		super();
	}
	
/*	@Autowired
	public static AnotherExampleBean createInstance (
			AnotherBean anotherBean, yetAnotherBean yetAnotherBean, int i) {
			AnotherExampleBean eb = new AnotherExampleBean (anotherBean,yetAnotherBean,i);
			return eb;
			}*/
	
}
