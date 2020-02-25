package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);
        //comparing
        boolean result = (theCoach == alphaCoach);
        System.out.println("\n pointing to the same object:"+result);
        System.out.println("\n memory location for the coach:"+theCoach);
        System.out.println("\n memory location for the coach:"+alphaCoach +"\n");
	    context.close();
	}
	

}
