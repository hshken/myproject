package com.hshken.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student("王大明",43,86,97);
		Student stu2 = new Student("王曉明",55,76,99);
//		Student stu = new Student("??嚙踝蕭?嚙踝蕭??");
		//stu.english = 66;
		//stu.math = 86;
		//stu.chinese = 97;
		stu1.pass = 50;
		stu1.print();
		stu2.print();
		int avg = stu1.getaverage();
		System.out.println(stu1.name + ":" + avg);
		Student.method();
		Graduatestudent gstu = new Graduatestudent();
		gstu.print();

	}

}
