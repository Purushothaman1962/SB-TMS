package com.tms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.dao.TournamentDAO;
import com.tms.pojo.Tournament;

@Service
public class TournamentService {
	
	@Autowired
	private TournamentDAO dao;
	
	public boolean addEmployee(Tournament bean) {
		dao.addTournament(bean);
		return true;
	}

}
