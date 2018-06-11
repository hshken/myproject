package com.java2.Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
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
	Iterator it = set.iterator();
	a.Location = new int[set.size()];
	for(int b=0; b<set.size();b++) {
		int i = Integer.parseInt(String.valueOf(it.next()));
		a.Location[b] = i;
		System.out.println(a.Location[b]);
	}
	int walk;
	line = bfr.readLine();
	String step[] = line.split(",");
	Scanner scanner = new Scanner(System.in);
	for (int i = 0; i < steps.length; i++) {
		if (a.player.HP > 0) {
			walk = 0;
			System.out.println("請輸入8(上)2(下)4(左)6(右)：");
			System.out.println(steps[i]);
			switch (steps[i]) {
			case "8":
		}
			}
		
	}
	}
	
		
	}
