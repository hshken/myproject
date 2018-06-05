package com.java2.VendingMain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.java2.io.Sales;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader rd;
		try {
	rd	 = new FileReader("Vending.txt");
	BufferedReader in = new BufferedReader(rd);
	String line = in.readLine();
		String[] tokens = line.split(",");
		for(int i=0 ; i<= 3;i++){
			String name = (tokens[i*2+1]);
			int price = Integer.parseInt(tokens[i*2+2]);
		}		
} 
		catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
		catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		}}


