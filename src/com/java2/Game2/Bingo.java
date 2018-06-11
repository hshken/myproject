package com.java2.Game2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {
	public class Form {
		int table;
		int number;
		List<Integer> bingos;
		List<Integer> numbers = new ArrayList<>();
		public Form(int table, int number, List<Integer> bingo) {
			this.table = table;
			this.number = number;
			this.bingos = bingo;
	}	
		
	public void print() {
		for (int i = 1; i <= number; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		int[][] lasttable = new int[table][table];
		for (int i = 0; i < table; i++) {
			for (int j = 0; j < table; j++) {
				lasttable[i][j] = numbers.get(i * table + j);
				if (lasttable[i][j] > 9) {
					System.out.print(lasttable[i][j] + " ");
				} else {
					System.out.print(" " + lasttable[i][j] + " ");
				}
			}
			System.out.println();
		}
		}
		public void Bingo() {
			int rowBingo;
			int row = 0;
			int colbingo ;
			int col = 0;
			int xbingo ;
			int x = 0;
			int[][] lasttable = new int[table][table];
		for (int i = 0; i < table; i++) {
			for (int j = 0; j < table; j++) {
				lasttable[i][j] = numbers.get(i * table + j);
			}
		}
		for (int ai = 0; ai < table; ai++) {
			rowBingo = 0;
			for (int aj = 0; aj < table; aj++) {
				for (int ap = 0; ap < bingos.size(); ap++) {
					if (lasttable[ai][aj] == bingos.get(ap)) {
						rowBingo+=1;
					}
				}
			}
			if(rowBingo==5) {
				row+=1;
			}
		}
		System.out.println("橫："+row+"條");

		for (int ci = 0; ci < table; ci++) {
			colbingo = 0;
			for (int cj = 0; cj < table; cj++) {
				for (int cp = 0; cp < bingos.size(); cp++) {
					if (lasttable[cj][ci] == bingos.get(cp)) {
						colbingo+=1;
					}
				}
			}
			if(colbingo==5) {
				col+=1;
			}
		}
		System.out.println("直："+col+"條");

		xbingo = 0;
		for (int si1 = 0; si1 < table; si1++) {
				for (int sp1 = 0; sp1 < bingos.size(); sp1++) {
					if (lasttable[si1][si1] == bingos.get(sp1)) {
						xbingo+=1;
					}
				}
			if(xbingo==5) {
				x+=1;
			}
		}

		xbingo = 0;
		for (int si2 = 0; si2 < table; si2++) {
				for (int sp2 = 0; sp2 < bingos.size(); sp2++) {
					if (lasttable[si2][table-(si2+1)] == bingos.get(sp2)) {
						xbingo+=1;
					}
				}
			if(xbingo==5) {
				x+=1;
			}
		}
		System.out.println("斜線："+x+"條");
		System.out.println("共："+(row+col+x)+"條");
	}
	}
	}


