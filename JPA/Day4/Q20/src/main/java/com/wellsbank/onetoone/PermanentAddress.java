package com.wellsbank.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PermanentAddress {
@Id
int doorNo;
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
String state;


}
