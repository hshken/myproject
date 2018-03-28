package com.java2.object;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
	public static void main(String[]args) {
	Random random = new Random();
	String flowers = "SHDC";
	List<Integer> cards = new ArrayList();
	 for(int i=0 ; i < 52; i++) {
		cards.add(i);
}

	for (int i=0; i<52; i++) {
		int a = random.nextInt(52);
		int temp = cards.get(i);
		cards.set(i,cards.get(a));
		cards.set(a,temp);
	}
	for(int i=0; i<52; i++) {
		System.out.print((flowers.charAt(cards.get(i)/13))+""+((cards.get(i)%13)+1)+ " ");
		if(i%13==12)
			System.out.println();
	}
}
}
