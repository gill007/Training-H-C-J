package com.wellsbank.tableperclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TC_Evangelist")
public class EvangeList extends Educator{
	private int noOfSessions;

	public int getNoOfSessions() {
		return noOfSessions;
	}

	public void setNoOfSessions(int noOfSessions) {
		this.noOfSessions = noOfSessions;
	}

}
