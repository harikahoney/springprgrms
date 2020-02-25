package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle.xml");
        Coach theCoach = context.getBean("myCoach",TrackCoach.class);
       System.out.println(theCoach.getResults());
	    context.close();
	}
	

}