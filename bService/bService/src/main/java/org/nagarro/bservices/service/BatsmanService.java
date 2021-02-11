package org.nagarro.bservices.service;

import java.util.List;

import org.nagarro.bservices.dao.BatsmanDao;
import org.nagarro.bservices.model.Batsman;
import org.springframework.beans.factory.annotation.Autowired;

public class BatsmanService {

	@Autowired
	private BatsmanDao batsmanDao;

	public List<Batsman> getAllBatsman() {
		List<Batsman> batsmanList = batsmanDao.getAllBatsman();
		return batsmanList;
	}

	public Batsman getBatsmanByRank(int rank) {
		Batsman batsman = batsmanDao.getBatsmanByRank(rank);
		return batsman;
	}

	public List<Batsman> getBatsmanByCountry(String country) {
		List<Batsman> batsmanList = batsmanDao.getBatsmanByCountry(country);
		return batsmanList;
	}

	public Batsman addBatsman(Batsman batsman) {
		return batsmanDao.addBatsman(batsman);
	}

}
