package com.esprit.market.Test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class TestEntityManager {

	@Test
	public void test() {
		EntityManager entityManager;
		
		EntityManagerFactory entityManagerFactory=Persistence.
				createEntityManagerFactory("com.esprit.miniprojet.virtualMarket");
		
		
		entityManager=entityManagerFactory.createEntityManager();
		
		
		
		
	}

}
