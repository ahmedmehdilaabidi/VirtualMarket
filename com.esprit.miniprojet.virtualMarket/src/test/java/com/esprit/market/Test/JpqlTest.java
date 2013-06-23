package com.esprit.market.Test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;

import com.esprit.market.domain.User;

import com.esprit.market.utils.*;



public class JpqlTest {

	
	EntityManager entityManager = JPAUTIL
			.getEntityManager("com.esprit.miniprojet.virtualMarket");
	@Test
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

}
