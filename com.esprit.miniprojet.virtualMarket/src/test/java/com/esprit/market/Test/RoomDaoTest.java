package com.esprit.market.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.esprit.market.domain.Room;
import com.esprit.market.domain.User;
import com.esprit.market.service.RoomDao;
import com.esprit.market.service.UserDao;
import com.esprit.market.serviceImpl.RoomDaoImpl;
import com.esprit.market.serviceImpl.UserDaoImpl;

public class RoomDaoTest {


	RoomDao room;

	@Before
	public void setUp() {
		room = new RoomDaoImpl();
	}

	@Test
	public void addUserTest() {
		Room r=new Room();

		r.setNameRoom("fruit");
		r.setDesctiptionRoom("vent fruit");

	room.addRoom(r);
	}

}
