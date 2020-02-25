package com.springdemo;

public class BaseCoach implements Coach {
	//define a private field for the dependency
	private FortuneService fortuneService;
	//define the constructor for dependency injection
	public BaseCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getResults()
	{
		return "hai i got 100 marks";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
