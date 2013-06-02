package com.esprit.market.service;

import java.util.HashSet;

import com.esprit.market.domain.Market;

public interface MarketDao {

	public void addMarket();

	public void deleteMarket();

	public void updateMarket();

	public Market listMarketById();

	public HashSet<Market> listMarket();

}
