package com.main.fish;

import com.main.AquaticAnimal;

/**
 * QB.3.a 
 * just AquaticAnimal, good swimmers
 * 
 */
public class Dolphin extends AquaticAnimal {

	/*
	 * QB.3.b => avoid duplicating code or introducing unneeded overhead by abstracting (cohesion) 
	 * 
	 */

	@Override
	public String toString() {
		return "Dolphin : can swim";
	}	
}