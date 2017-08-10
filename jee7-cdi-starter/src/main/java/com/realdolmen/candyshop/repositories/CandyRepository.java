package com.realdolmen.candyshop.repositories;

import java.util.Collections;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.services.PersonService;

@ApplicationScoped
public class CandyRepository {
	
	@Inject
	Logger logger;
	
	public List<Candy>findAllCandy(){
		logger.info("retrieving all candy");
		return Collections.emptyList();
	}
	
	public List<Candy>findCandyByColor(Candy candy){
		logger.info("retrieving candy by coller");
		return Collections.emptyList();
	}

}
