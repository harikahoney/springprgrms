package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCricket",CricketCoach.class);
		System.out.println(theCoach.getResults());
		System.out.println(theCoach.getFortune());
		System.out.println(((CricketCoach) theCoach).getTeam());
		System.out.println(((CricketCoach) theCoach).getEmailAddress());
		
         context.close();
	}

}
