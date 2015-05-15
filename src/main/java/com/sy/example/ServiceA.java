package com.sy.example;

import com.sy.example.SingletonGenerator;

public class ServiceA {
	
	public long processNumber() {
		
		long num = SingletonGenerator.newInstance().getRandomNumber();
		
		if (num % 2 == 0) {
			//Do stuff that we care to unit test on
			// ... ...
			System.out.println("Got even number");
		} else {
			//Do other stuff that we care to unit test on
			// ... ...
			System.out.println("Got odd number");
		}
		
		return num;
	}
}
