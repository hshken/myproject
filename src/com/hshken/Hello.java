package com.hshken;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	 System.out.println("Hello World");
	 
	 System.out.println("�п�J�A���W�r:");
	 Scanner scanner = new Scanner(System.in);
	 String line = scanner.nextLine();
	 System.out.println("Hello " + line);
	 
	 System.out.println("�A�X��?");
	 line = scanner.nextLine();
	 int age = Integer.parseInt(line);
	 System.out.println(age);
	 System.out.println(age < 20);
	
	person p = new person();
	p.sayHello();
	 
	 }
}
