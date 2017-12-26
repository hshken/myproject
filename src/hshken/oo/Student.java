package hshken.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;
	public Student(){
		
	}
	public Student(String name , int english , int math , int chinese ){
		this.name = name;
		this.english = english;
		this.chinese = chinese;
		this.math = math;
		}
	public Student(String n){
		this.name = n ;
	}
	public static void method(){
		System.out.println("hello");
	}
	public void print(){
		System.out.println(english +"\t"+
	math +"\t" + chinese);
		
}
	public int getaverage(){
		return (english+math+chinese)/3;
	}
}