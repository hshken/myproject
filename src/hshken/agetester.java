package hshken;

import java.util.Scanner;

public class agetester{

	public static void main(String[] args) {
	 System.out.println("請輸入你的年齡");
	 Scanner scanner = new Scanner(System.in);
	 String line = scanner.nextLine();
	 int age = Integer.parseInt(line);
	 if (age < 12){
		 System.out.println("小學?");}
	 else{ if(age < 15){System.out.println("國中?");}
	 else{ if(age < 18){System.out.println("高中?");}
	 else{System.out.println("...");
	 for(int i = 1 ; i <= 5 ; i = i + 1){ 
		 System.out.println("哈哈哈");
		 
	 }
	   }
	 }
  }
	}
}


