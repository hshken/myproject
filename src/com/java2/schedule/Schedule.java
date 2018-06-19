package com.java2.schedule;

import java.util.List;
import java.util.Scanner;

public class Schedule {
	List<String> schedule1;
	List<String> schedule2;
	List<String> schedule3;
	List<String> schedule4;

	public Schedule(List<String> schedule1, List<String> schedule2, List<String> schedule3, List<String> schedule4) {
		this.schedule1 = schedule1;
		this.schedule2 = schedule2;
		this.schedule3 = schedule3;
		this.schedule4 = schedule4;
	}
	public void Decide() {
		int decide = 1;
		System.out.print("請輸入星期(1-7)");
		Scanner scanner = new Scanner(System.in);
		String sc = scanner.nextLine();
		int day = Integer.parseInt(sc);
		System.out.print("請輸入時間(0-24)");
		sc = scanner.nextLine();
		int time = Integer.parseInt(sc);
		switch (day) {
		case 2:
			if (time >= Integer.parseInt(schedule1.get(3))
					&& (time <= Integer.parseInt(schedule1.get(3)) + Integer.parseInt((schedule1.get(4))))) {
				System.out.println( schedule1.get(0) + " " + schedule1.get(1) + " " + "到" + " "
						+ (Integer.parseInt(schedule1.get(3)) + Integer.parseInt(schedule1.get(4))) + "有課 ");
			} else {
				System.out.println("空檔");
			}
			break;
		case 4:
			if (time >= Integer.parseInt(schedule2.get(3))
					&& (time <= Integer.parseInt(schedule2.get(3)) + Integer.parseInt((schedule2.get(4))))) {
				System.out.println( schedule2.get(0) + " " + schedule2.get(1) + " " + "到" + " "
						+ (Integer.parseInt(schedule2.get(3)) + Integer.parseInt(schedule2.get(4))) + "有課  ");
			} else {
				if (time >= Integer.parseInt(schedule4.get(3))
						&& (time <= Integer.parseInt(schedule4.get(3)) + Integer.parseInt((schedule4.get(4))))) {
					System.out.println(schedule4.get(0) + " " + schedule4.get(1) + " " + "到" + " "
							+ (Integer.parseInt(schedule4.get(3)) + Integer.parseInt(schedule4.get(4))) + "有課  ");
				} else {
					System.out.println("空檔");
				}
			}
			break;
		case 1:
			if (time > Integer.parseInt(schedule3.get(3))
					&& (time < Integer.parseInt(schedule3.get(3)) + Integer.parseInt((schedule3.get(4))))) {
				System.out.println( schedule3.get(0) + " " + schedule3.get(1) + " " + "到" + " "
						+ (Integer.parseInt(schedule3.get(3)) + Integer.parseInt(schedule3.get(4))) +"有課  " );
			} else {
				System.out.println("空檔");
			}
			break;
		case 0 :
			System.out.println("結束");
			break;
		
	}
		
}
}
