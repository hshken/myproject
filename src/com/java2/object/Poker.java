package com.java2.object;

import java.util.Random;

public class Poker {
	Random random = new Random();
	int[] cards = new int[52];
	String flowers = "SHDC";
	public Poker() {
		for (int i=0 ; i < cards.length; i++) {
			cards[i] = i;
			System.out.println((i%13)+1+""+(flowers.charAt(i/13)));
		}
	}
	public void shuffle() {
		for (int i=0; i<cards.length; i++) {
			int a = random.nextInt(52);
			int temp = cards[i];
			cards[i] = cards[a];
			cards[a] = temp;
		}
	}
	public void show(){
		for(int i=0; i<cards.length; i++) {
			int c = cards[i];
			System.out.print((c%13)+1+""+(flowers.charAt(c/13))+ " ");
			if(i%13==0)
				System.out.println();
		}
	}
}
