package br.com.estudosapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudosapi.models.PersonModel;
import br.com.estudosapi.services.PersonServices;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServices service;
	
	// @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/{id}")
	public PersonModel findById(@PathParam(value = "id") String id) {
		return service.findById(id);
	}
	
	@GetMapping("/")
	public List<PersonModel> findAll() {
		return service.findAll();
	}
	
	@PostMapping("/")
	public PersonModel create(@RequestBody PersonModel person) {
		return service.create(person);
	}
	
	@PutMapping("/{id}")
	public PersonModel update(@RequestBody PersonModel person) {
		return service.update(person);
	}
	
	@DeleteMapping("/{id}")
	public void update(@PathVariable(value = "id") String id) {
		service.delete(id);
	}
}
