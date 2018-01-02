package com.hshken;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		System.out.println("叫块计");
		Scanner scanner = new Scanner (System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n % 2 == 1){
			System.out.println("琌计");
		}else
		{System.out.println("琌案计");}
		

	}

}
