package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.java2.VendingMain.Drink;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] tokens = line.split(",");
			for(int a=0; a<=4;a++){
			String name = (tokens[a*2+1]);
			int price = Integer.parseInt(tokens[a*2+2]);
			vm .drinks.add(new Drink(a, name, price));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


