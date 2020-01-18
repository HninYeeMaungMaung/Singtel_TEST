package com.main.fish;

//QB.2
public class Clownfish extends Fish implements FishSpecialization{

	@Override
	public void getSize() {
		System.out.print("I am so small");
	}

	@Override
	public void getColor() {
		System.out.print("My color is orange");		
	}

	@Override
	public void getHabit() {
		System.out.print("I like to make jokes");		
	}

}