package com.java2.object;

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
Random random = new Random();
String flowers = "SHDC";
ArrayList<Integer> cards = new ArrayList();
public Poker2(){
	for (int i=0 ; i < 52; i++) {
		cards.size(i);
		System.out.println((i%13)+1+""+(flowers.charAt(i/13)));
}

}
public void shuffle() {
	for (int i=0; i<cards.get; i++) {
		int a = random.nextInt(52);
		int temp = cards.add(i);
		cards.get = cards.get;
		cards.get(52) = temp;
	}
}
public void show(){
	for(int i=0; i<cards.; i++) {
		int c = cards[i];
		System.out.print((c%13)+1+""+(flowers.charAt(c/13))+ " ");
		if(i%13==0)
			System.out.println();
	}
}
}
