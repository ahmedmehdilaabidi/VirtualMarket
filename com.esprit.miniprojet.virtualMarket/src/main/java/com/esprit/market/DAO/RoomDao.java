package com.esprit.market.DAO;

import java.util.HashSet;

public interface RoomDao {
	
	public void addRoom();

	public void deleteRoom();

	public void updateRoom();

	public RoomDao getRoomById(int room);

	public HashSet<RoomDao> listRoom();

}
