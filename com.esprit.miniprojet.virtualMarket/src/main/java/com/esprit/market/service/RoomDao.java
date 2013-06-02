package com.esprit.market.service;

import java.util.HashSet;

import com.esprit.market.domain.Room;

public interface RoomDao {
	
	public void addRoom();

	public void deleteRoom();

	public void updateRoom();

	public Room getRoomById(int room);

	public HashSet<Room> listRoom();

}
