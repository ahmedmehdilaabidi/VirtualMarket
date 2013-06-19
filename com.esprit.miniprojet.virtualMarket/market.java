package org.persistence;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MARKET")
public class market {

	@Id
	private long id;
	@Basic
	private String attribute1;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAttribute1(String param) {
		this.attribute1 = param;
	}

	public String getAttribute1() {
		return attribute1;
	}

}