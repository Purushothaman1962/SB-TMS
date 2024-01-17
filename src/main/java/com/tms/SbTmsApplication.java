package com.tms;

import java.util.Scanner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tms.controller.TMSController;
import com.tms.dao.TournamentDAO;
import com.tms.pojo.Tournament;

@SpringBootApplication
public class SbTmsApplication {

	public static void main(String[] args) {
	 SpringApplication.run(SbTmsApplication.class, args);
			
	
    }
}



