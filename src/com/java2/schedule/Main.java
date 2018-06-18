package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java2.VendingMain.Drink;

public class Main {
	
	public Main() {
		
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] tokens1 = line.split(",");
			for(int a=0; a<=4;a++){
			String name = (tokens1[a*2+1]);
			List<String> schedule1 = new ArrayList<>();
			for (int i = 0; i < tokens1.length; i++) {
				schedule1.add(tokens1[i]);
			}
			line = br.readLine();
			String[] tokens2 = line.split(",");
			int day = Integer.parseInt(tokens2[a*2+2]);
			List<String> schedule2 = new ArrayList<>();
			for (int i = 0; i < tokens2.length; i++) {
				schedule2.add(tokens2[i]);
			}
			line = br.readLine();
			String[] tokens3 = line.split(",");
			int time = Integer.parseInt(tokens3[a*2+3]);
			List<String> schedule3 = new ArrayList<>();
			for (int i = 0; i < tokens3.length; i++) {
				schedule3.add(tokens3[i]);
			}
			line = br.readLine();
			String[] tokens4 = line.split(",");
			int  part= Integer.parseInt(tokens4[a*2+4]);
			List<String> schedule4 = new ArrayList<>();
			for (int i = 0; i < tokens4.length; i++) {
				schedule4.add(tokens4[i]);
			}
			Schedule schedule = new Schedule(schedule1, schedule2, schedule3, schedule4);
			schedule.Decide();
			}
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
	}
		
	public static void main (String[] args) {
		new Main();
}
}


