package com.wellsbank.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer
{
	@Id
	int custId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	String custName;
	
}

