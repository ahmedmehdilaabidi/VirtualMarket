package com.esprit.market.service;

import java.util.List;

import com.esprit.market.domain.Market;

public interface MarketDao {

	public void addMarket(Market market);

	public void deleteMarket(Market market);

	public void updateMarket(Market market);

	public Market listMarketById(int id);

	public List<Market> listMarket();

}
