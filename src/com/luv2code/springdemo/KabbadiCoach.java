package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KabbadiCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice Kabbadi for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(email);
		System.out.println(team);
		return fortuneService.getFortune();
	}

}
