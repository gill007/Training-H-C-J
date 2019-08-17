package com.website.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

 

@Entity
@Table(name="product")
@NamedQueries({
@NamedQuery(name="getDataForProduct",
    query="SELECT m from MainBean m ")          
})
public class MainBean {

@Id
@Column(name="id")
private int id;
@Column(name="itemid")
private String itemId;
@Column(name="quantity")
private int quantity;
@Column(name="itemname")
private String itemName;
@Column(name="filepath")
private String imageUrl;
@Column(name="price")
private int price;
public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}



public String getId() {
	return itemId;
}

public void setId(String id) {
	this.itemId = id;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


	
	
}
