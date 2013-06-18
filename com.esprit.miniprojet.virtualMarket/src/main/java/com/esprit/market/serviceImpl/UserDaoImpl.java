package com.esprit.market.serviceImpl;

import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Parameter;
import javax.persistence.Query;

import com.esprit.market.domain.User;
import com.esprit.market.service.UserDao;
import com.esprit.market.utils.JPAUTIL;

public class UserDaoImpl implements UserDao {

	EntityManager entityManager = JPAUTIL
			.getEntityManager("com.esprit.miniprojet.virtualMarket");


	public void addUser(User user) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(user);
		tx.commit();

	}

	public void deleteUser(User user) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.remove(user);
		tx.commit();

	}

	public void updateUser(User user) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(user);
		tx.commit();
	}

	public User getRoomById(int id) {

		return entityManager.find(User.class, id);
	}

	
	@SuppressWarnings("unchecked")
	public HashSet<User> listUser() {
		// requete jpql
		String jpql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(jpql);
		return (HashSet<User>) query.getResultList();
	}
	
	
   @SuppressWarnings("unchecked")
public void checkUser(String login, String password) {
	// create a query
	   Query query = entityManager.createQuery("select p.username,p.password from User p where p.username=:"+
	login+" and p.password=:"+password);
	   
	   
		
		User personne = (User) query.getSingleResult();
		
		if (personne == null) {
		
		System.out.println("Personne non trouvée");
	
		} else {
		
		System.out.println("Personne.nom=" + personne.getUsername());
		
		}
		entityManager.close();
	  
	  
	  
	
}
	

	

}
