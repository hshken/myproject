package com.java2.object;

import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String secret = "9643";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40){
			System.out.println("Please enter your guess:");
			String num = scanner.nextLine();
			ABNumber n = new ABNumber(num);
			result = n.validate(secret);
			System.out.println((result/10)+"A"+(result%10)+"B");
		}
		

	}

}
