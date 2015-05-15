package com.sy.example;

public class SingletonGenerator {
	
	private SingletonGenerator() {}
	
	public static SingletonGenerator newInstance() {
		return new SingletonGenerator();
	}

	public long getRandomNumber() {
		return Math.round(Math.random());
	}
}
