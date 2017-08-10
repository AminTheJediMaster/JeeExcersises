package com.realdolmen.candyshop.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.realdolmen.candyshop.services.PersonService;

@RequestScoped 
public class PersonController {

	@Inject
	PersonService personService;
}
