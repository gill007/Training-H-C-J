package com.website.model;

public class MainBean {
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

private int quantity;
private String itemName;
private String imageUrl;
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


	
	
}
