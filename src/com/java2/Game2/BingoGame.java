package com.java2.Game2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.java.Snowing.Snow;

public class BingoGame {
	try {
		FileReader rd	 = new FileReader("Bingo.txt");
	BufferedReader in = new BufferedReader(rd);
	String line = in.readLine();
	int number = Integer.parseInt(line);
	int table = (int)Math.sqrt(number);
	line = in.readLine();
	String[] tokens = line.split(",");
	List<Integer> bingo = new ArrayList<>();
	for (int i=0; i<=tokens.length; i++) {
		int bingo = Integer.parseInt(tokens[i]);
		Bingo bingo = new bingo(this);
		bingo.start();
		bingos.add(bingo);
		
	}
	
	}
}
