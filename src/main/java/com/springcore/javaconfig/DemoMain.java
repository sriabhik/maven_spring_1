package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(javaConfig.class);
		Student d = con.getBean("student",Student.class);
		System.out.println(d);
		d.study();
	}

}
