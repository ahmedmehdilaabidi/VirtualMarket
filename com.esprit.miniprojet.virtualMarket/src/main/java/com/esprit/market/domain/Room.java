package com.esprit.market.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ROOM")
public class Room {
	
	
	private int idRoom;
	private String nameRoom;
	private String desctiptionRoom;
	private List<Market> market;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
	
	public String getNameRoom() {
		return nameRoom;
	}
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}
	public String getDesctiptionRoom() {
		return desctiptionRoom;
	}
	public void setDesctiptionRoom(String desctiptionRoom) {
		this.desctiptionRoom = desctiptionRoom;
	}
	
	@OneToMany
	public List<Market> getMarket() {
		return market;
	}
	public void setMarket(List<Market> market) {
		this.market = market;
	}
	
	

}
