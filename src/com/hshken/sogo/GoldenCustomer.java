package com.hshken.sogo;

public class GoldenCustomer extends Customer {
	public GoldenCustomer(int price){
		super(price);
		super.discount = 0.1f;
	}
}
