package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.bird.Bird;
import com.main.fly.Butterfly;
import com.main.bird.Chicken;
import com.main.bird.Duck;
import com.main.bird.Parrot;
import com.main.bird.Rooster;
import com.main.fish.Clownfish;
import com.main.fish.Dolphin;
import com.main.fish.Fish;
import com.main.fish.Shark;

@RestController
public class AnimalInfoController {


	/**
	 * 
	 * @return List of Animals
	 */
	@RequestMapping("/api/AnimalList")
	public List<String> getAnimalList() {
		List<String> resultList = new ArrayList<String>();
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
		
		for(Animal animal: animals) {
			resultList.add(animal.toString());
		}
		
		return resultList;
		
	}
	
	/**
	 * 
	 * @param type of animal
	 * @return list of animals by type
	 */
	@RequestMapping("/api")
	public List<String> getAnimal(@RequestParam String type) {

		List<String> resultList = new ArrayList<String>();

		switch (type) {
			case "bird":
				resultList.add(new Rooster().toString());
				resultList.add(new Bird().toString());
				resultList.add(new Duck().toString());
				resultList.add(new Chicken().toString());
				resultList.add(new Parrot().toString());
				break;
			case "aquatic":
				resultList.add(new Fish().toString());
				resultList.add(new Shark().toString());
				resultList.add(new Dolphin().toString());
				resultList.add(new Clownfish().toString());
				break;
			case "fly":
				resultList.add(new Butterfly().toString());
				break;
			default:
				resultList.add(new Cat().toString());
				resultList.add(new Frog().toString());
				resultList.add(new Dog().toString());
				break;
		}

		return resultList;
	}

}
