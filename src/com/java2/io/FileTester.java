package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			//System.out.println("File output problem");
		}

	}

}
