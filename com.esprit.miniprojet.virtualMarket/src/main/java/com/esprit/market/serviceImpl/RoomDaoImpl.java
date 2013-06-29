package com.esprit.market.serviceImpl;

import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.esprit.market.domain.Market;
import com.esprit.market.domain.Room;
import com.esprit.market.service.RoomDao;
import com.esprit.market.utils.JPAUTIL;

public class RoomDaoImpl implements RoomDao{
	EntityManager entityManager = JPAUTIL
			.getEntityManager("com.esprit.miniprojet.virtualMarket");
	public void addRoom(Room r) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(r);
		tx.commit();
		
	}
	public void deleteRoom(Room room) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Market m = entityManager.find(Market.class,room.getIdRoom());
		entityManager.remove(m);
		tx.commit();
		
	}
	public void updateRoom(Room room) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Market m = entityManager.find(Market.class,room.getIdRoom());
		entityManager.remove(m);
		tx.commit();
		
	}
	public Room getRoomById(int id) {
		return entityManager.find(Room.class,id);
	}
	public List<Room> listRoom() {
		String jpql = "select r from Room r ";
		Query query = entityManager.createQuery(jpql);
//		Query q = em.createNamedQuery("Files.findAll");
//	    List rl = q.getResultList();
		return query.getResultList();
	}

	
	
}
