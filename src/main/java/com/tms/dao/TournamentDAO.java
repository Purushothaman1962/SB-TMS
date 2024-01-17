package com.tms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tms.pojo.Tournament;

@Repository
public class TournamentDAO {
	
	List<Tournament> tournamentList=new ArrayList<Tournament>();

	public boolean addTournament(Tournament bean) {
		
		tournamentList.add(bean);
		return true;
	}

}
