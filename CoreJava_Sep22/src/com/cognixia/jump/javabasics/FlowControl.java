package com.cognixia.jump.javabasics;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=0;
		do {
			System.out.println("Enter a Between Number 1-3:");
			try {
			number= scan.nextInt();
			}
			catch(Exception e) {
				System.out.println(e);
				scan.next();
			}
		}while(number>3||number<1);
		
		switch(number) {
			case 1: System.out.println("You are withdrawing money.");
					break;
			case 2: System.out.println("You are deposting money.");
					break;
			case 3: System.out.println("Your balance is: " + 1_000_000);
					break;
		 	default:System.out.println("You should not be here");
		}
		if(number==1) {
			System.out.println("You are withdrawing money.");
		}else if(number==2){
			System.out.println("You are deposting money.");
		}else if(number ==3) {
			System.out.println("Your balance is: " + 1_000_000);
		}
		else {
			System.out.println("You Should not be here");
		}
		number+=2;
		
		
		
		scan.close();
	}

}
