package com.realdolmen.candyshop.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.realdolmen.candyshop.service.CandyService;

@RequestScoped
public class CandyController {
	
	@Inject
	CandyService candyService;

}
