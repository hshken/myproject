package com.hshken;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		System.out.println("è«‹è¼¸?…¥ä¸??‹æ•¸å­? ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		for (int i = 1 ; i <= number ; i++){
		if(i % 3 ==0){
			continue;
			}
		System.out.print(i + " ");
	}

	}

}
