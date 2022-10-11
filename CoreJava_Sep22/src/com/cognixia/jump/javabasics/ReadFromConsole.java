package com.cognixia.jump.javabasics;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		// This program takes in user input and will print it
		
		//Step 1: set up, the user input with a Scanner
		Scanner scan= new Scanner(System.in);
		//Step 2: prompt user
		System.out.print("How many times do you want to roll the dice:");
		//Step 3: Read input
		String name =scan.nextLine();
		//Step 4: print Input
		int dice;
		double d;
		
		for(int x=0;x<10;x++) {
			d=Math.random()*6;
			dice=(int)d+1;
		
			System.out.println(dice);
		}
		scan.close();
	}

}
