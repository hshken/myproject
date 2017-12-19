package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for(int n = 2 ; n <= 9 ; n++){
			if(n < 4 |n >8){
		for(int i = 1; i <= 9; i++){
			if((n * i < 10)){
			System.out.print( n + "x" + i + "=" + n * i + "\t");
			}else{
				System.out.print( n + "x" + i + "=" + n * i + "\t");
			}
			}
		System.out.println();
		}else{
			System.out.print("..."+"\t"+"..."+"\t"+ "..."+"\t"+ "..."
					+"\t"+ "..."+"\t"+ "..."+"\t"+ "..."+"\t"+ "..."+"\t"+ "...");
			
	}
			System.out.println();
}
}}