package com.hshken.sogo;

public class Customer {
	int price;
	float discount = 0.05f;
	public Customer(int price){
		this.price = price;
	}
	public void print(){
	int total = (int)(price*(1-discount));
	System.out.println(price+"\t"+total);
	}
}
