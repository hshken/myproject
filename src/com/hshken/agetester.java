package com.hshken;

import java.util.Scanner;

public class agetester{

	public static void main(String[] args) {
	 System.out.println("�п�J�A���~��");
	 Scanner scanner = new Scanner(System.in);
	 String line = scanner.nextLine();
	 int age = Integer.parseInt(line);
	 if (age < 12){
		 System.out.println("�p��?");}
	 else{ if(age < 15){System.out.println("�ꤤ?");}
	 else{ if(age < 18){System.out.println("����?");}
	 else{System.out.println("...");
	 for(int i = 1 ; i <= 5 ; i = i + 1){ 
		 System.out.println("������");
		 
	 }
	   }
	 }
  }
	}
}


