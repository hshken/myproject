package hshken;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		System.out.println("please enter a number:");
		 Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 int number = Integer.parseInt(line);
		int i = 1;
		while(i<= number){
			System.out.print(i + " ");
			i = i + 1 ;
			if(i == 11){
				break;
			}
		}
		
	}

}
