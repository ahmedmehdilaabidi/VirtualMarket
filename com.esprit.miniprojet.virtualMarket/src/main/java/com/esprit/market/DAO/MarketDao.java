package com.esprit.market.DAO;

import java.util.HashSet;

import com.esprit.market.domain.Market;

public interface MarketDao {

	public void addMarket();

	public void deleteMarket();

	public void updateMarket();

	public Market listMarketById();

	public HashSet<Market> listMarket();

}
