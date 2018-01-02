package com.hshken.oo;

public class Graduatestudent extends Student{
  int thesis;
  public Graduatestudent() {
	  super();
}
  @Override
  public void print(){
	  super.print();
		System.out.println(english +"\t"+
	math +"\t" + chinese+"\t"+thesis);
		}
  @Override
  public int getaverage(){
		return (english+math+chinese+thesis)/4;
		
		}
  }