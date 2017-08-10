package com.realdolmen.candyshop.repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Person;

@ApplicationScoped
public class PersonRepository {
	
	@Inject
	Logger logger;
	
	public void savePerson(Person person){
		logger.info("Saving person");
	}
	
	public Person findPersonById(long id){
		logger.info("retrieving person by id");
		return new Person();
	}

}
