package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "7536";
		int a = 0;
		int b = 0;
		while (a != 4) {
			a = 0;
			b = 0;
			System.out.println("Please enter your guess:");
			Scanner scanner = new Scanner(System.in);
			String nums = scanner.nextLine();
			int length = secret.length();
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					char d = secret.charAt(i);
					char k = nums.charAt(j);
					if (d == k && i != j) {
						b = b + 1;
					}
				}
			}
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					char d = secret.charAt(i);
					char k = nums.charAt(j);
					if (d == k && i == j) {
						a = a + 1;
						System.out.println(a + "A" + b + "B");
					}
				}
			}
		}
	}
}
