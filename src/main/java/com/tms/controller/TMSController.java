package com.tms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.dao.TournamentDAO;
import com.tms.pojo.Tournament;
import com.tms.service.TournamentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/productRest/api")
public class TMSController {
	
	@Autowired
	TournamentService service;
	
	@PostMapping("/products")
	public boolean performInsert(@RequestBody Tournament bean) {
		return service.addEmployee(bean);
	}

}

