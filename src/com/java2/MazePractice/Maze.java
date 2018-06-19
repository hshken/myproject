package com.java2.MazePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze {
	List<Course> courses = new ArrayList<>();
	public Maze(){
		readCourses();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入星期(1-7):");
		int weekDay = scanner.nextInt();
		System.out.println("輸入時間(0-24):");
		int hour = scanner.nextInt();
		boolean avail = true;
		for(Course c : courses){
			if (!c.isAvailable())
		}
	}
	
}
