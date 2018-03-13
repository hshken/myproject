package com.java2.object;

public class Customer2 {
	public String name;
	int price;
	int IDnumber;
	public Customer2 (int price){
	this.price= price;
	}
	public void print(){
		int total = (int)(price);
		System.out.println(price+"\t"+total);
		}

}


