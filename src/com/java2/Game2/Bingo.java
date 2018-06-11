package com.java2.Game2;

import java.util.ArrayList;
import java.util.List;

public class Bingo {
	int rowBingo;
	int row = 0;
	int colbingo ;
	int col = 0;
	int xbingo ;
	int x = 0;
	int table;
	int number;
	int[][] lasttable = new int[table][table];
	List<Integer> bingo;
	List<Integer> numbers = new ArrayList<>();

	public Bingo(int table, int number, List<Integer> bingo) {
		this.table = table;
		this.number = number;
		this.bingo = bingo;
}
	
	}

