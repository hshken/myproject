package hshken.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
	
	public Student(String n , int e , int m , int c ){
		name = n;
		english = e;
		chinese = c;
		}
	public void print(){
		System.out.println(english +"\t"+
	math +"\t" + chinese);
		
}
	public int getaverage(){
		return (english+math+chinese)/3;
	}
}