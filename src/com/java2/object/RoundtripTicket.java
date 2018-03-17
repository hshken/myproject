package com.java2.object;

public class RoundtripTicket extends Ticket{
		  RoundtripTicket (String arrive){
		  super(arrive);
	}
	 @Override
	  public void print(){
		  super.print();
		  System.out.println(arrive +"\t"+
				  start +"\t" + trainnumber+"\t"+price);			}
}
