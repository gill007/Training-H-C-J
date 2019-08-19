package com.website.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordertable")
public class CheckoutModel {
	@Id
	@Column(name="orderid")
	private int orderid;
	@Column(name="buyername")
	private String name;
	@Column(name="orderday")
	private String date;
	@Column(name="totalamount")
	private String amount;
	@Column(name="productname")
	private String itemname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	

}
