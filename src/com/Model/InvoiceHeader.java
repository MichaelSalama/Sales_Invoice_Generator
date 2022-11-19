package com.Model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {




	private int invoiceNum; //should that be static? so it will be counted automatically?
	private Date invoiceDate;
	private String customerName;
	private ArrayList<InvoiceLine> invoiceLines = new ArrayList<InvoiceLine>();

	//Constructors
	//To make invoice date captured automatically
	private InvoiceHeader (){invoiceDate= new Date();}
	public InvoiceHeader(int num, String name) {
		this();
		invoiceNum = num;
		customerName = name;
		//invoiceLines = invoiceLines;
	}

	//Setters & Getters
	public void setInvoiceNum(int num) {this.invoiceNum = num;}
	public int getInvoiceNum() {return invoiceNum;}

	//make no interaction in date
	public Date getInvoiceDate() {return invoiceDate;}

	public void setCustomerName(String name) {this.customerName = name;}
	public String getCustomerName() {return customerName;}

	public void setInvoiceLines(ArrayList<InvoiceLine> lines) {invoiceLines = lines;	}
	public ArrayList<InvoiceLine> getInvoiceLines() {
		if(invoiceLines == null) invoiceLines = new ArrayList<>();
		return invoiceLines;
	}

	//add Invoice line to the arraylist
	public void addInvoiceLine(InvoiceLine line){
		getInvoiceLines().add(line);
	}

	@Override
	public String toString(){
		String str="InvoiceFram1{" + "invNum=" + invoiceNum + ", customerName=" + customerName + ", invDate=" + invoiceDate + '}' ;
		for(InvoiceLine invoiceLine: getInvoiceLines()){
			str += "\n\t" + invoiceLine;
		}
		return str;
	}
}
