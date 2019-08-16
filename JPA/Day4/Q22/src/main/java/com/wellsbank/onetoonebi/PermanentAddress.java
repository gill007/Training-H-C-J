package com.wellsbank.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PermanentAddress {
	
	@Id
	int doorNo;
	String state;
	@OneToOne(mappedBy="address")
	Customer customer;
public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String toString()
	{
		return "DoorNo:"+getDoorNo()+
				", State:"+getState()+"Customer:"+getCustomer();
	}

}
