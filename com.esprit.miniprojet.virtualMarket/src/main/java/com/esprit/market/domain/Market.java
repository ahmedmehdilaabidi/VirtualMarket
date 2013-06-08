package com.esprit.market.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MARKET")
public class Market {

	private int idMarket;
	private String nameMarket;
	private String LocationMarket;
	private String descriptionMarket;
	private String Raghda;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdMarket() {
		return idMarket;
	}

	public void setIdMarket(int idMarket) {
		this.idMarket = idMarket;
	}

	public String getNameMarket() {
		return nameMarket;
	}

	public void setNameMarket(String nameMarket) {
		this.nameMarket = nameMarket;
	}

	public String getLocationMarket() {
		return LocationMarket;
	}

	public void setLocationMarket(String locationMarket) {
		LocationMarket = locationMarket;
	}

	public String getDescriptionMarket() {
		return descriptionMarket;
	}

	public void setDescriptionMarket(String descriptionMarket) {
		this.descriptionMarket = descriptionMarket;
	}

	public String getRaghda() {
		return Raghda;
	}

	public void setRaghda(String raghda) {
		Raghda = raghda;
	}
	
	

}
