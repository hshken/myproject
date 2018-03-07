package com.java2.object;

	public class Customer {
		public String name;
		int price;
		int IDnumber;
		public Customer (int price){
		this.price= price;
		}
		public void print(){
			int total = (int)(price);
			System.out.println(price+"\t"+total);
			}

	}


