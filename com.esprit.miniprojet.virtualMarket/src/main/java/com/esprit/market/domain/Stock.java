package com.esprit.market.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stock
 *
 */
@Entity

public class Stock implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Stock() {
		super();
	}
	
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
   
}
