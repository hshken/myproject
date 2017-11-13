package hshken;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		System.out.println("½Ð¿é¤J¼Æ¦r");
		Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 int star = Integer.parseInt(line);
		 for (int n= 1; n <= star ; n++){
				for (int i= 1; i <= star ; i++){
					if(n>=i) 
					System.out.print("*");
	}
				System.out.println("");
}
}
	}