package com.wellsbank.manytoonebi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
int custId;
String custName;

@OneToMany(targetEntity=Account.class, mappedBy="customer")
List<Account> account;


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

public List<Account> getAccount() {
	return account;
}

public void setAccount(List<Account> account) {
	this.account = account;
}
}
