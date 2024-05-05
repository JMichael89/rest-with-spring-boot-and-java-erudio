package br.com.estudosapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.estudosapi.models.PersonModel;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public PersonModel findById(String id) {
		logger.info("Finding a person");
		PersonModel person = new PersonModel();

		person.setId(counter.incrementAndGet());
		person.setFirstName("Michael");
		person.setLastName("Lima");
		person.setAddress("Natal, Rio Grande do Norte - Brasil");
		person.setGender("Male");

		return person;
	}

	public List<PersonModel> findAll() {
		logger.info("Finding all person");
		List<PersonModel> persons = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			PersonModel person = mockPerson(i);
			persons.add(person);
		}

		return persons;
	}

	private PersonModel mockPerson(int i) {
		PersonModel person = new PersonModel();

		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some address in Brazil " + i);
		person.setGender("Male");

		return person;
	}

	public PersonModel create(PersonModel person) {
		logger.info("Creating a person...");
		return person;
	}

	public PersonModel update(PersonModel person) {
		logger.info("Updating a person...");
		return person;
	}
	
	public void delete(String id) {
		logger.info("Deleting a person with ID " + id);
	}

}
