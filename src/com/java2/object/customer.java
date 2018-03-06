package com.java2.object;

public class customer {
	public String name;
	int price;
	int IDnumber;
	public customer (int price){
	this.price= price;
	}
	public void print(){
		int total = (int)(price);
		System.out.println(price+"\t"+total);
		}
}
