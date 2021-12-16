package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		//to call destroy use abstractApplication
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//Samosa p = (Samosa) context.getBean("samosa1");
		//System.out.println(p);
		
		
		//Example--..annoatation
		
		Example ex = (Example) context.getBean("example");
		System.out.println(ex);
		context.registerShutdownHook();
	}

}
