package com.esprit.market.serviceImpl;

import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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

	@Override
	public void deleteRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Room getRoomById(int room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<Room> listRoom() {
		// TODO Auto-generated method stub
		return null;
	}

}
