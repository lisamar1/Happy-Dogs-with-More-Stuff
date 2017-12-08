package com.lmig.gfc.happydogs.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.happydogs.models.Person;
import com.lmig.gfc.happydogs.services.PersonRepository;

@RestController
@RequestMapping("/api/people")
public class PeopleAPIController {

	private PersonRepository personRepository;

	public PeopleAPIController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@GetMapping("")
	public List<PersonView> getAll() {
		List<Person> persons = personRepository.findAll();
		ArrayList<PersonView> personViews = new ArrayList<PersonView>();
		for (Person person : persons) {
			personViews.add(new PersonView(person));
		}
		return personViews;

	}
}