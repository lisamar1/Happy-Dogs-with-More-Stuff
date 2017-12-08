package com.lmig.gfc.happydogs.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.happydogs.models.Dog;
import com.lmig.gfc.happydogs.models.Meal;
import com.lmig.gfc.happydogs.models.Person;
import com.lmig.gfc.happydogs.services.DogRepository;
import com.lmig.gfc.happydogs.services.MealRepository;
import com.lmig.gfc.happydogs.services.PersonRepository;

@Configuration
public class SeedData {

	public SeedData(PersonRepository personRepository, DogRepository dogRepository, MealRepository mealRepository) {
		Person owner = new Person();
		owner.setFirstName("Barry");
		personRepository.save(owner);

		dogRepository.save(new Dog(3, "Yorkie", "Fancy", 5.1, "Female", "Tan", 4, true, null));
		dogRepository.save(new Dog(14, "Poodle", "Casey", 6.2, "Male", "Black", 4, true, null));
		dogRepository.save(new Dog(5, "Shepard", "Jerry", 60.7, "Male", "Brown", 4, true, null));
		dogRepository.save(new Dog(6, "Labradoodle", "Allie", 52.0, "Female", "Mocha", 4, true, null));
		dogRepository.save(new Dog(9, "Mastiff", "Shelly", 92.2, "Female", "Tan", 4, true, null));

		Dog dog = dogRepository.save(new Dog(9, "Mastiff", "Shelly", 92.2, "Female", "Tan", 4, true, null));

		Meal meal = new Meal();
		meal.setFood("Steak");
		meal.setDog(dog);
		mealRepository.save(meal);

		ArrayList<Person> owners = new ArrayList<Person>();
		owners.add(owner);
		dog.setOwners(owners);
		dogRepository.save(dog);
	}

}
