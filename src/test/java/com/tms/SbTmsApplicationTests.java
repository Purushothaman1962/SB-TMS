package com.tms;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.dao.TournamentDAO;
import com.tms.pojo.Tournament;

@SpringBootTest
class SbTmsApplicationTests {
	
	@Autowired
	static TournamentDAO dao;
	Tournament bean=new Tournament(201,"Cricket","CricketGully",11,5,30000,25000,5000);

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testPerformInsert() {
		dao=new TournamentDAO();
		boolean value =dao.addTournament(bean);
		assertEquals(value,true);
		
	}
		

}
