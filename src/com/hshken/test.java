package com.hshken;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("�֪��~���̤j?");
		System.out.println("1)�P�N��");
		System.out.println("2)�خf�t");
		System.out.println("3)��°�");
		Scanner scanner =new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		if(number < 3){
			System.out.println("���׬O3");
		}else{
			if(number == 3)
			System.out.println("���ߧA����F");

	}

}
}
