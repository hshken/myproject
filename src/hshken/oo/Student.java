package hshken.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
	
	public Student(String name , int english , int math , int chinese ){
		this.name = name;
		this.english = english;
		this.chinese = chinese;
		this.math = math;
		}
	public Student(String n){
		this.name = n ;
	}
	public void print(){
		System.out.println(english +"\t"+
	math +"\t" + chinese);
		
}
	public int getaverage(){
		return (english+math+chinese)/3;
	}
}