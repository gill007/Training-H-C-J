package com.wellsbank.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
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
