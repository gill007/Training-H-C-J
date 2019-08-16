package com.wellsbank.manytomanybi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Account {
@Id
int accountId;
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public List getJoint() {
	return joint;
}
public void setJoint(List joint) {
	this.joint = joint;
}
@ManyToMany(targetEntity=JointAccountHolder.class,mappedBy="account")
List joint;



}
