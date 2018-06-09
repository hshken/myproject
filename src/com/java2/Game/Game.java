package com.java2.Game;

import java.io.BufferedReader;
import java.io.FileReader;

public class Game {
	public Game() {
		try {
			FileReader rd= new FileReader("maze.txt");
	BufferedReader bfr = new BufferedReader(rd);
	String line = bfr.readLine();
	String[] steps = line.split(",");
	int wid = Integer.parseInt(steps[0]);
	int lon = Integer.parseInt(steps[1]);
	
		}
	}
	
	
	
	}
