package com.hshken;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("誰的年紀最大?");
		System.out.println("1)周杰倫");
		System.out.println("2)華宸宇");
		System.out.println("3)梁朝偉");
		Scanner scanner =new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		if(number < 3){
			System.out.println("答案是3");
		}else{
			if(number == 3)
			System.out.println("恭喜你答對了");

	}

}
}
