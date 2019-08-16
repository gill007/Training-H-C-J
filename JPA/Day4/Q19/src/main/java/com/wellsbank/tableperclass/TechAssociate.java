package com.wellsbank.tableperclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TC_TechAssociate")
public class TechAssociate extends Educator {
	
	private int noOflABS;

	public int getNoOflABS() {
		return noOflABS;
	}

	public void setNoOflABS(int noOflABS) {
		this.noOflABS = noOflABS;
	}
	
	
	

}
