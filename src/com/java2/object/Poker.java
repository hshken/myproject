package com.java2.object;

import java.util.Random;

public class Poker {
	Random random = new Random();
	int[] poker = new int[52];
	String flowers = "SHDC";
	public Poker() {
		for (int i=0 ; i < poker.length; i++) {
			poker[i] = i;
			System.out.println(((i%13)+1)+""+(flowers.charAt(i/13)));
		}
	}
	public void shuffle() {
		for (int i=0; i<poker.length; i++) {
			int a = random.nextInt(52);
			int temp = poker[i];
			poker[i] = poker[a];
			poker[a] = temp;
		}
	}
	public void show(){
		for(int i=0; i<poker.length; i++) {
			int c = poker[i];
			System.out.print((flowers.charAt(c/13))+""+((c%13)+1)+ " ");
			if(i%13==12)
				System.out.println();
		}
	}
}
