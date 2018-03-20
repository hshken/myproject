package com.java2.object;

public class ABNumber {
	String num;
	int result;

	public ABNumber(String num) {
		this.num = num;
	}

	public int validate(String secret) {
		int length = secret.length();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				char d = secret.charAt(i);
				char k = num.charAt(j);
				if (d == k && i != j) {
					result = result + 1;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				char d = secret.charAt(i);
				char k = num.charAt(j);
				if (d == k && i == j) {
					result = result + 10;

				}
			}
		}
		return result;

	}

}
