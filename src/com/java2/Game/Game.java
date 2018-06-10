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
	int col = Integer.parseInt(steps[0]);
	int row = Integer.parseInt(steps[1]);
	
	line = bfr.readLine();
	int snareCount = Integer.parseInt(line);
	Maze a = new Maze(col,row,snareCount);
	
		}
	}
	
	
	
	}
