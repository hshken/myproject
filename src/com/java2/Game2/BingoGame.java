package com.java2.Game2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java2.Game2.Bingo.Form;

public class BingoGame extends Bingo{
	public BingoGame() {
	try {
		FileReader rd	 = new FileReader("Bingo.txt");
	BufferedReader in = new BufferedReader(rd);
	String line = in.readLine();
	int number = Integer.parseInt(line);
	int table = (int)Math.sqrt(number);
	line = in.readLine();
	String[] tokens = line.split(",");
	List<Integer> bingos = new ArrayList<>();
	for (int i=0; i<=tokens.length-1; i++) {
		int bingo= Integer.parseInt(tokens[i]);
		bingos.add(bingo);
		
	}
	Form form= new Form(table, number, bingos);
	form.print();
	form.Bingo();
	
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
}

public static void main(String[] args) {
	new BingoGame();
}
}