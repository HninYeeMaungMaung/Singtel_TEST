package com.main;

import com.main.bird.Bird;
import com.main.bird.Chicken;
import com.main.bird.Duck;
import com.main.bird.Parrot;
import com.main.bird.Rooster;
import com.main.fish.Clownfish;
import com.main.fish.Dolphin;
import com.main.fish.Fish;
import com.main.fish.Shark;
import com.main.fly.Butterfly;

public class TestAnimals {
	public static void main(String[] args) {

		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
			};
		
		int fly=0, walk=0, sing=0, swim=0;
		
		for (Animal animal : animals) {

			/**
			 * assume birds can sing and fly
			 * but flies cannot sing
			 */
			if (animal instanceof VolantAnimal) {
				fly++;

				if (animal instanceof Bird)
					sing++;

				continue;
			}

			/**
			 * all aquatic animals can swim
			 */
			if (animal instanceof AquaticAnimal) {
				swim++;
				continue;
			}

			/**
			 * animal types other than birds and aquatic can walk
			 */
			walk++;
		}

		System.out.println("Fly : " + fly);
		System.out.println("Walk : " + walk);
		System.out.println("Sing : " + sing);
		System.out.println("Swim : " + swim);	
		
	}
}
