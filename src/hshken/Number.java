package hshken;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字 ");
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
