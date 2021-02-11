package org.nagarro.bservices.model;

public class Batsman {

	private String batsmanName;
	private String batsmanCountry;
	private String batsmanMatches;
	private String batsmanRun;
	private int batsmanRankingInOdi;

	public Batsman() {
		super();
	}

	public Batsman(String batsmanName, String batsmanCountry, String batsmanMatches, String batsmanRun,
			int batsmanRankingInOdi) {
		super();
		this.batsmanName = batsmanName;
		this.batsmanCountry = batsmanCountry;
		this.batsmanMatches = batsmanMatches;
		this.batsmanRun = batsmanRun;
		this.batsmanRankingInOdi = batsmanRankingInOdi;
	}

	public String getBatsmanName() {
		return batsmanName;
	}

	public void setBatsmanName(String batsmanName) {
		this.batsmanName = batsmanName;
	}

	public String getBatsmanCountry() {
		return batsmanCountry;
	}

	public void setBatsmanCountry(String batsmanCountry) {
		this.batsmanCountry = batsmanCountry;
	}

	public String getBatsmanMatches() {
		return batsmanMatches;
	}

	public void setBatsmanMatches(String batsmanMatches) {
		this.batsmanMatches = batsmanMatches;
	}

	public String getBatsmanRun() {
		return batsmanRun;
	}

	public void setBatsmanRun(String batsmanRun) {
		this.batsmanRun = batsmanRun;
	}

	public int getBatsmanRankingInOdi() {
		return batsmanRankingInOdi;
	}

	public void setBatsmanRankingInOdi(int batsmanRankingInOdi) {
		this.batsmanRankingInOdi = batsmanRankingInOdi;
	}

}
