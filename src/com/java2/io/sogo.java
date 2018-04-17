package com.java2.io;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.channels.ShutdownChannelGroupException;

import com.hshken.sogo.Customer;
import com.hshken.sogo.GoldenCustomer;
import com.hshken.sogo.SilverCustomer;

public class sogo {
	Scanner scanner = new Scanner(System.in);

	public sogo() {
	}
	public void start(){
		int function = 0;
		while (function != 3){
			showFunctions();
	function = scanner.nextInt();
		switch(function){
		case 1:
			inputsales();
			break;
		case 2 :
			List<Sales> list = new ArrayList<>();
			try {
				FileInputStream fis = new FileInputStream("sales.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader in = new BufferedReader(isr);
				String line = in.readLine();
				while (line != null) {
					String[] token = line.split("\t");
					try {
						int type = Integer.parseInt(token[0]);
						int amount = Integer.parseInt(token[1]);
						Sales sales = new Sales(type, amount);
						list.add(sales);
					} catch (NumberFormatException e) {
						System.out.println("��Ʈ榡���~");
						return;
					}
					line = in.readLine();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// report
			for (Sales sales: list){
				Customer customer = null;
				switch(sales.type){
				case 1: 
					customer = new Customer(sales.getAmount());
					break;
				case 2:
					customer = new SilverCustomer(sales.getAmount());
					break;
				case 3:
					customer = new GoldenCustomer(sales.getAmount());
					break;
				}
				customer.print();
			}
			
			
			break;
		case 3:
			return;
		}
		

			}}


	public void inputsales(){
		try{
			FileOutputStream fos = new FileOutputStream("sale.txt",true);
			PrintStream out = new PrintStream(fos);
			System.out.print("�п�J�|������");
			int type = scanner.nextInt();
			System.out.print("�п�J�ʶR���B");
			int amount = scanner.nextInt();
			out.println(type+ "\t" +amount);
			out.flush();
			out.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
			
			
public void  showFunctions(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("�п�J�\��(1-3):");
	System.out.println("1)��J�P�����");
	System.out.println("2)�L�X�P�����");
	System.out.println("3)�����{��");
	
}
		public static void main(String[] args){
			sogo sogo = new sogo();
			sogo.start();
			
		}
		}