package com.esprit.market.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.esprit.market.domain.Market;
import com.esprit.market.service.MarketDao;
import com.esprit.market.serviceImpl.MarketDaoImpl;

public class MarketDaoTest {

	MarketDao market = new MarketDaoImpl();
	Market m1=new Market();

	@Before
	public void setUp() {

	}

	@Test
	public void testDeleteMarket() {
		
		m1.setIdMarket(10);
//		m1.setNameMarket("test");
//		m1.setLocationMarket("test5");
//		m1.setDescriptionMarket("test5");
		market.deleteMarket(m1);
		

	}

}
