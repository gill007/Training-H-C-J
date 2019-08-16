package com.vehicle.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;

@Entity
@Table(name="CK_Vehicle")
@IdClass(VehiclePK.class)
public class Vehicle  {


@Id
@SequenceGenerator(name="seqProdNo",sequenceName="seqProdNo",initialValue=1000,allocationSize=10)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProdNo")
private int vehicleId;

@Id
private int ownerId;

public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

private double price;
private String name;

	
	
	
}


