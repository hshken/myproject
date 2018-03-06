package com.java2.object;
public class Member extends Customer {
	private float discount = 0.1f;
	Member (int price){
		super(price);
	}
	
	@Override
	public void print(){
		int total = (int)(price*0.9);
		System.out.println(price+"\t"+total);
		}
	
}

