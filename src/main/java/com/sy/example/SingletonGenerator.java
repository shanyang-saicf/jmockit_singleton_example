package com.sy.example;

import java.util.UUID;

public class SingletonGenerator {
	
	private SingletonGenerator() {}
	
	public static SingletonGenerator newInstance() {
		return new SingletonGenerator();
	}

	public long getRandomNumber() {
		return Math.round(Math.random());
	}
	
	public String getRandomUID() {
		return UUID.randomUUID().toString();
	}
}
