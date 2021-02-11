package org.nagarro.bservices.dao;

import java.util.List;

import org.nagarro.bservices.model.Batsman;

public interface BatsmanDao {

	public List<Batsman> getAllBatsman();
	
	public Batsman getBatsmanByRank(int rank);
	
	public List<Batsman> getBatsmanByCountry(String country);
	
	public Batsman addBatsman(Batsman batsman);
	
}
