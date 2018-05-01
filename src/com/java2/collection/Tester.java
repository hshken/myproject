package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println(list);
		Set<Integer> set =new HashSet<>();
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(1);
		System.out.println(set);
		Map<String, String> stocks =new HashMap<>();
		stocks.put("2330", "TSMC");
		stocks.put("2454", "Mediatek");
		stocks.put("2317", "HonHai");
		System.out.println(stocks);
	}

}
