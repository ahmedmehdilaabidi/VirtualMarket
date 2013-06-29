package com.esprit.market.Test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Ignore;
import org.junit.Test;

import com.esprit.market.domain.Market;
import com.esprit.market.domain.User;

import com.esprit.market.service.MarketDao;
import com.esprit.market.serviceImpl.MarketDaoImpl;
import com.esprit.market.utils.*;



public class JpqlTest {

	
	EntityManager entityManager = JPAUTIL
			.getEntityManager("com.esprit.miniprojet.virtualMarket");
	@Ignore @Test
	public void test() {
		Query query = entityManager.createQuery("select p.username,p.password from User p ");
				
	
		
		Query q = entityManager.createQuery("select t from User t");
	    List<User> todoList = q.getResultList();
	    for (User todo : todoList) {
	      //System.out.println(todo.getUsername());
	      if(todo.getUsername().equals("admin"))
	      {
	    	  System.out.println("existee");
	      }
	      else
	      {
	    	  System.out.println("n existe pas");
	      }
	    }
		entityManager.close();
		
	}
	
	
	@Test
	public  void testMarket()
	{
		MarketDao market=new MarketDaoImpl();
		
		
		System.out.println(market.listMarket());
		
		for(Object m:market.listMarket())
		{
			
			System.out.println("id:"+((Market) m).getIdMarket());
			
		}
		
		
	}

}
