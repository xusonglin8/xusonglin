package com.cn.tai.pojo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
// @ComponentScan("com.cn.tai")
public class SampleConfig {
	@Bean
	public Person person() {
		Person person=new Person();
		return person;
	}
   @Bean
	public ExampleBean exampleBean() {
		ExampleBean examplebean=new ExampleBean();
		return examplebean;
	}
   @Bean
	public AnotherExampleBean anotherExampleBean() {
	   AnotherExampleBean anotherexamplebean=new AnotherExampleBean();
		return anotherexamplebean;
	}
   
   @Bean
  	public AnotherBean anotherBean() {
  	   AnotherBean anotherbean=new AnotherBean();
  		return anotherbean;
  	}
   @Bean
  	public yetAnotherBean yetanotherBean() {
  	   yetAnotherBean yetanotherbean=new yetAnotherBean();
  		return yetanotherbean;
  	}


	
}
