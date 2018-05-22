package com.java.Snowing;

import java.util.ArrayList;
import java.util.List;
public class SnowTester {

	
	public static void main(String[] args) {
		List<Snow> snows = new ArrayList<>();
		for (int i=0; i<100; i++ ){
			Snow snow = new Snow();
			snow.start();
			snows.add(snow);
		}
	}

}
