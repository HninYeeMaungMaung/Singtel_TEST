package com.main.bird;

//QA.2
public class Chicken extends Bird {
	
	@Override
	public void sing() {
		System.out.print("Cluck, cluck");		
	}
	
	@Override
	public void fly() {
		 throw new UnsupportedOperationException();
	}
	
}
