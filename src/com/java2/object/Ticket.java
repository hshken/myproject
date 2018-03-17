package com.java2.object;

public class Ticket {
 int trainnumber;
 int price;
 String arrive;
 String start;
 public Ticket(String arrive , String start , int trainnumber , int price ){
	 this.arrive = arrive;
	 this.start = start;
	 this.trainnumber = trainnumber;
	 this.price = price;
 }
 public Ticket (int trainnumber){
	 this.trainnumber =trainnumber;
 }
 public void print(){
	System.out.println(trainnumber +"\t"+
start +"\t" + arrive+"\t"+price);
	}
}

