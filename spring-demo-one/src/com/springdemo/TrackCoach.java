package com.springdemo;

public class TrackCoach implements Coach {
 private FortuneService fortuneService;
 
	public TrackCoach(FortuneService fortuneService) {
	super();
	this.fortuneService = fortuneService;
}

	@Override
	public String getResults() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "just Do It:"+ fortuneService.getFortune();
	}
	//add an init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside method");
	}
    //add a destroy method
	public void doMyEndupStuff()
	{
		System.out.println("TrackCoach: end method");
	}
}
