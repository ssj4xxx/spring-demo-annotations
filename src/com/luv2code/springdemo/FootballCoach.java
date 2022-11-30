package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 10km around the stadium";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
