package com.wellsbank.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Calendar;

import javax.persistence.Column;

@Entity
@Table(name="CUST")
public class Customer {

	
	
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
	@Column(name="customername")
	String custName;
	
	
	@PrePersist
	public void beforePersist()
	{
		System.out.println("Call Back method is execute before persisting");
	}
	


	
	
	
}
