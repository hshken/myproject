package com.java2.object;

public class member extends customer {
	private float discount = 0.1f;
	member (int price){
		super(price);
	}
	
	@Override
	public void print(){
		int total = (int)(price*0.9);
		System.out.println(price+"\t"+total);
		}
	
}
