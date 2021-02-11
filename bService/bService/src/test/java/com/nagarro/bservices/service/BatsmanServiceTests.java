package com.nagarro.bservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.verify;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.nagarro.bservices.dao.BatsmanDao;
import org.nagarro.bservices.model.Batsman;
import org.nagarro.bservices.service.BatsmanService;

public class BatsmanServiceTests {

	@Mock
	BatsmanDao batsmanDao;

	@InjectMocks
	BatsmanService batsmanService;
	
	@BeforeEach 
	public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void getAllBatsmanTest() {
		Batsman batsman1 = new Batsman("KL Rahul", "India", "60", "7012", 7);
		Batsman batsman2 = new Batsman("Joy Root", "England", "73", "9092", 4);
		Batsman batsman3 = new Batsman("Kane Williamson", "NewZealand", "89", "10012", 1);
		List<Batsman> listOfBatsman = Stream.of(batsman1, batsman2, batsman3).collect(Collectors.toList());
		Mockito.when(batsmanDao.getAllBatsman()).thenReturn(listOfBatsman);
		assertEquals(3, batsmanService.getAllBatsman().size());
	}

	@Test
	public void getBatsmanByRankTest() {
		Batsman batsman = new Batsman("Virat Kholi", "India", "90", "11012", 3);
		int rank = 3;
		Mockito.when(batsmanDao.getBatsmanByRank(rank)).thenReturn(batsman);
		assertEquals(batsman, batsmanService.getBatsmanByRank(rank));
	}
	
	@Test
	public void getBatsmanByCountryTest() {
		Batsman batsman1 = new Batsman("Rohit Sharma", "India", "70", "9012", 9);
		Batsman batsman2 = new Batsman("Shikhar Dhawan", "India", "80", "1012", 11);
		String country = "India";
		Mockito.when(batsmanDao.getBatsmanByCountry(country))
				.thenReturn(Stream.of(batsman1, batsman2).collect(Collectors.toList()));
		assertEquals(2, batsmanService.getBatsmanByCountry(country).size());
	}
	
	@Test
	public void addBatsmanTest() {
		Batsman batsman_1 = new Batsman("Ross Taylor", "NewZealand", "120", "13023", 6);
		Mockito.when(batsmanDao.addBatsman(batsman_1)).thenReturn(batsman_1);
		assertEquals(batsman_1, batsmanService.addBatsman(batsman_1));
		verify(batsmanDao).addBatsman(batsman_1);
	}
}
