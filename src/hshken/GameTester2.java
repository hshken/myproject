package hshken;

import java.util.Scanner;

public class GameTester2 {

	public static void main(String[] args) {
		int pos = 0;
		int row = 3;
		int col = 5;
		int hp = 100;
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		while( d != 0){
			System.out.println("位置" + pos + "HP:" + hp);
			System.out.print("請輸入方向");
		String dir = scanner.nextLine();
		 d = Integer.parseInt(dir);
		switch (d) {
		case 2:
			System.out.println("向下");
			if (pos/col< row-1){
				pos = pos + col;
				hp = hp - 5;
				}else{
					hp = hp -30;
				}
		case 8:
			System.out.println("向上");
			if (pos/col >0){
				pos = pos - col;
				hp = hp - 5;
			}
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
