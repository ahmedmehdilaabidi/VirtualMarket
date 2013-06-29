package com.esprit.market.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.esprit.market.domain.Market;
import com.esprit.market.domain.User;
import com.esprit.market.service.MarketDao;
import com.esprit.market.utils.JPAUTIL;

public class MarketDaoImpl implements MarketDao {

	EntityManager entityManager = JPAUTIL
			.getEntityManager("com.esprit.miniprojet.virtualMarket");

	public void addMarket(Market market) {

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(market);
		tx.commit();

	}

	public void deleteMarket(Market market) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Market m = entityManager.find(Market.class, market.getIdMarket());
		entityManager.remove(m);
		tx.commit();

	}

	public void updateMarket(Market market) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		 Market m = entityManager.find(Market.class,market.getIdMarket());
		   
		    m.setNameMarket(market.getNameMarket()); 
		    m.setLocationMarket(market.getLocationMarket());
		    m.setDescriptionMarket(market.getDescriptionMarket());
		entityManager.merge(market);
		tx.commit();

	}

	public Market listMarketById(int id) {
		return entityManager.find(Market.class,id);
	}

	public List<Market> listMarket() {
		String jpql = "select m from Market m ";
		Query query = entityManager.createQuery(jpql);
//		Query q = em.createNamedQuery("Files.findAll");
//	    List rl = q.getResultList();
		return query.getResultList();
	}

}
