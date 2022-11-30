package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] data = {"Good luck!", "You are so lazy!", "Co'mon man", "It's in the baggggg!"};
    private Random randomNumber = new Random();
    @Override
    public String getFortune() {
        int index = randomNumber.nextInt(data.length);
        return data[index];
    }
}
