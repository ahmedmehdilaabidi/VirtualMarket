package com.esprit.market.utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUTIL {
	
	private static EntityManager entityManager;
	
	
   public static EntityManager getEntityManager(String pu)
   
   {
	   
	   if(entityManager==null)
	  
			   entityManager=Persistence.createEntityManagerFactory(pu).
	   createEntityManager();
	   
	 return entityManager;
	   
	   
   }
}
