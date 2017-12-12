package hshken;

import java.util.Scanner;

public class GameTester2 {

	public static void main(String[] args) {
		int pos = 0;
		int row = 3;
		int col = 5;
		System.out.println("請輸入8 or 2 or 4 or 6 ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		switch (number) {
		case 2:
			System.out.println("向下");
			break;
		case 8:
			System.out.println("向上");
			break;
		case 4:
			System.out.println("向左");
			break;
		case 6:
			System.out.println("向右");
			break;
		case 0:
			break;
		}
		if( number ==0){
			
		}
		if (pos/col< row-1){
			pos = pos + col;
			}
	if (pos/col< row-1){
			pos = pos - col;
			}
		if(pos/col< row-1){
			pos = pos + row;
		}
		if (pos/col< row-1){
			pos = pos - row;
			}

	}

}
