package com.Model;

public class InvoiceLine {
	//InvoiceLine.csv contains: invoiceNum, itemName, itemPrice, Count.
	private String itemName;
	private  float itemPrice;
	private int count;
	private float itemTotal;

	//Constructors
	public InvoiceLine(String name, float price, int itemCount) {
		itemName = name;
		itemPrice = price;
		count = itemCount;
		itemTotal = calculateItemTotal();
	}

	//Setters & Getters
	public void setItemName(String name) {itemName = name;}
	public String getItemName() {return itemName;}

	public void setItemPrice(float price) {itemPrice = price;}
	public float getItemPrice() {return itemPrice;}

	public void setCount(int itemCount) {count = itemCount;}
	public int getCount() {return count;}

	public float getItemTotal(){return itemTotal;}

	//method used to automatically calculate the ItemTotal = count x itemPrice
	private float calculateItemTotal () {return itemPrice *count;}



}
