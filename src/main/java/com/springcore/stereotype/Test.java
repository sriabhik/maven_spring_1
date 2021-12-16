package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student s = (Student)con.getBean("student",Student.class);
		Student s1 = (Student)con.getBean("student",Student.class);
		System.out.println(s);
		System.out.println("_____________________________________");
		System.out.println(s.getAddress());
		//getting same  hashcode for both object(singleton scope for object)
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Teacher t1 = (Teacher)con.getBean("teacher",Teacher.class);
		Teacher t2 = (Teacher)con.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
