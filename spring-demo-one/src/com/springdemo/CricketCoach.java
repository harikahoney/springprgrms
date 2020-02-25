package com.springdemo;

public class CricketCoach implements Coach {
	
  private FortuneService fortuneService;
  //add new fields
  private String emailAddress;
  private String team;
  
  public String getEmailAddress() {
	  
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	System.out.println("inside setter method setemailaddress");
	this.emailAddress = emailAddress;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	System.out.println("inside setter method setteam");
	this.team = team;
}

//create no-arg constructor
  public CricketCoach()
  {
	  System.out.println("no-arg consructor");
  }
  
  //our setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter method");
	this.fortuneService = fortuneService;
}

	@Override
	public String getResults() {
		// TODO Auto-generated method stub
		return "Practice fast for better results";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
