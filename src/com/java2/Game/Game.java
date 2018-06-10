package com.java2.Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Game {
	public Game() {
		try {
			FileReader rd= new FileReader("maze.txt");
	BufferedReader bfr = new BufferedReader(rd);
	String line = bfr.readLine();
	String[] steps = line.split(",");
	int col = Integer.parseInt(steps[0]);
	int row = Integer.parseInt(steps[1]);
	
	line = bfr.readLine();
	int snareCount = Integer.parseInt(line);
	Maze a = new Maze(col,row,snareCount);
	Random r = new Random();
	Set<String> set = new TreeSet<>();
	while(set.size()< 5) {
		String snare = String.valueOf(r.nextInt(24));
		set.add(snare);
	}
		}
	}
	
	
	
	}
