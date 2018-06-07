package com.java2.VendingMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int total;
	List<Drink> drinks = new ArrayList<>();
	
	public void start(){
		System.out.println("Please insert coins 5元,10元,50元");
		for(int i=0;i<drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t"+ drink.getName()+"\t"+drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
	}
}
