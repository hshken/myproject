package com.hshken.sogo;

public class Tester {

	public static void main(String[] args) {
	Customer c1 = new Customer(1000);
	c1.print();
	SilverCustomer c2 = new SilverCustomer(1000);
	c2.print();
	GoldenCustomer c3 = new GoldenCustomer(1000);
	c3.print();
	}

}
