package hshken;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		int age = 0;
		float weight = (float) 70.2;
		char c = 65;
		char c2 = 'Z';
		int i = c2;
		System.out.println(age);
		System.out.println(weight);
		System.out.println(c);
		System.out.println((int)c2);
		boolean pass = false;
		System.out.println(!pass);
		System.out.println(pass);
		System.out.println(i);
		
		String s = new String("Hello");
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		int n4 = r.nextInt(6)+1;
		System.out.println(3 >= 2);
		System.out.println(3 == 2);
		System.out.println(3 <= 2);
	}

}
