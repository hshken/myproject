package com.java2.object;

public class ABGame {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		String secret = "7536";
		String nums = "1126";
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
