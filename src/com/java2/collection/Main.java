package com.java2.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
	//	List<Integer> list = new ArrayList();
	//	list.add(2);
	//	list.add(0);
	//	list.add(1);
	//	list.add(7);
	//	System.out.println(list);
		
		
	//	List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
	//	for (String name : nameList) {
	//	    System.out.println(name);
	//	}
		
		
	//	List<Integer> numList = new ArrayList<>(Arrays.asList(10,20,30,40,50));

	//	System.out.println(numList.subList(1,3)); //[20, 30]

	//	numList.subList(1,3).clear();

	//	System.out.println(numList); //[10, 40, 50]
		//List<Integer> list1 = new ArrayList<>();
		//list1.add(1);
		//list1.add(2);
		//list1.add(3);

		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		//List<Integer> list3 = new ArrayList<>();
		//list3.add(3);
		//list3.add(1);
		//list3.add(2);
		System.out.println(list2);
	}

}
