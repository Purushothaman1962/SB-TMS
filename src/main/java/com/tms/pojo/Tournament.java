package com.tms.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tournament {
	
	@Id
	private int tournamentId;
	private String tournamentType;
	private String tournamentName;
	private int maxPlayers;
	private int totalPrizesCount;
	private int firstPrizeAmount;
	private int secondPrizeAmount;
	private int consolationPrizeAmount;
	
	public Tournament() {
		super();
	}

	public Tournament(int tournamentId, String tournamentType, String tournamentName, int maxPlayers,
			int totalPrizesCount, int firstPrizeAmount, int secondPrizeAmount, int consolationPrizeAmount) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentType = tournamentType;
		this.tournamentName = tournamentName;
		this.maxPlayers = maxPlayers;
		this.totalPrizesCount = totalPrizesCount;
		this.firstPrizeAmount = firstPrizeAmount;
		this.secondPrizeAmount = secondPrizeAmount;
		this.consolationPrizeAmount = consolationPrizeAmount;
	}
	
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public String getTournamentType() {
		return tournamentType;
	}
	public void setTournamentType(String tournamentType) {
		this.tournamentType = tournamentType;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public int getMaxPlayers() {
		return maxPlayers;
	}
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	public int getTotalPrizesCount() {
		return totalPrizesCount;
	}
	public void setTotalPrizesCount(int totalPrizesCount) {
		this.totalPrizesCount = totalPrizesCount;
	}
	public int getFirstPrizeAmount() {
		return firstPrizeAmount;
	}
	public void setFirstPrizeAmount(int firstPrizeAmount) {
		this.firstPrizeAmount = firstPrizeAmount;
	}
	public int getSecondPrizeAmount() {
		return secondPrizeAmount;
	}
	public void setSecondPrizeAmount(int secondPrizeAmount) {
		this.secondPrizeAmount = secondPrizeAmount;
	}
	public int getConsolationPrizeAmount() {
		return consolationPrizeAmount;
	}
	public void setConsolationPrizeAmount(int consolationPrizeAmount) {
		this.consolationPrizeAmount = consolationPrizeAmount;
	}
	
}
