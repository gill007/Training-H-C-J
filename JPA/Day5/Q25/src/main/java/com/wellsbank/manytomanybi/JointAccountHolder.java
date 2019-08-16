package com.wellsbank.manytomanybi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class JointAccountHolder {
	
	@Id
	int customerId;
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List getAccount() {
		return account;
	}

	public void setAccount(List account) {
		this.account = account;
	}

	double balance;
	
	@ManyToMany(cascade=CascadeType.ALL, targetEntity=Account.class)
	@JoinTable(name="Holder")
	
	List account;
	

}
