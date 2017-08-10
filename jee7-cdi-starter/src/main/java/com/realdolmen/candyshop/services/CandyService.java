package com.realdolmen.candyshop.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.realdolmen.candyshop.repositories.CandyRepository;

@ApplicationScoped
//@ApplicationScoped: This means that an instance will be 
//created only once for the duration of the whole application. 
//Try changing the @ApplicationScoped annotation to @RequestScoped and see what happens.
public class CandyService {
	
	@Inject
	CandyRepository candyRepository;
	
	@Inject
	PersonService personService;
	
	

}
