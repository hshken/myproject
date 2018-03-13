package com.hshken.sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		Customer a1 = new Customer(10000);
		SilverCustomer a2 = new SilverCustomer(10000);
		GoldenCustomer a3 = new GoldenCustomer(10000);
		customers.add(a1);
		customers.add(a2);
		customers.add(a3);
		for (int i=0 ; i<customers.size(); i++){
		Customer a = customers.get(i);
		a.print();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(94);
		list.add(85);
		list.add(80);
		list.add(77);
		int n = list.get(2);
		int n2 = list.get(3);
		System.out.println(list.get(1));
		System.out.println(list.size());
		for (int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	
		Customer c1 = new Customer(1000);
		c1.print();
		SilverCustomer c2 = new SilverCustomer(1000);
		c2.print();
		GoldenCustomer c3 = new GoldenCustomer(1000);
		c3.print();
	}

}
