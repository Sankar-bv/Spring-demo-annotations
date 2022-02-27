package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//If we give just @Component it will take bean id as class name with first lowercase letter i.e. tennisCoach
//or we can provide with bean id as @Component("thetennis")
public class TennisCoach implements Coach {
	
	//Autowire Field injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//Autowire constructor injection
	/*
	 * @Autowired public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	//Autowire setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	//Autowire method injection
	/*
	 * @Autowired public void anyMethodInjection(FortuneService fortuneService) {
	 * System.out.println("TennisCoach: inside any method autowire injection");
	 * this.fortuneService = fortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Practice Tennis for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
