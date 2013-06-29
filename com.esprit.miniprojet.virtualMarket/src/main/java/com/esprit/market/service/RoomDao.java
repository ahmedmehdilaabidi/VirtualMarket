package com.esprit.market.service;

import java.util.HashSet;
import java.util.List;

import com.esprit.market.domain.Room;

public interface RoomDao {
	
	public void addRoom(Room r);

	public void deleteRoom(Room r);

	public void updateRoom(Room r);

	public Room getRoomById(int room);

	public List<Room> listRoom();

}
