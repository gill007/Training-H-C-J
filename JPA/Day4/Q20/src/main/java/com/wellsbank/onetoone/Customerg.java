package com.wellsbank.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Customerg {
	@Id
	int custId;
	String custName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="doorNo")
	PermanentAddress address;
	
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
	public PermanentAddress getAddress() {
		return address;
	}
	public void setAddress(PermanentAddress address) {
		this.address = address;
	}
	

}
