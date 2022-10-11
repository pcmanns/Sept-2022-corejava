package com.cognixia.jump.codingproblems;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problems {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		Problem3();
	}
	public static void Problem1() {
		int number;
		ArrayList<String> Student = new ArrayList<>();
		Student.add("Vin");
		Student.add("Wanye");
		Student.add("Wax");
		Student.add("Kholin");
		Student.add("Tavi");
		
		boolean loop=false;
		do {
			
			try{
				int choose=1;
				
				System.out.println("1. Look up a Student by their Number");
				System.out.println("2. Look up a Student by their Name");
				System.out.println("3. Add a Student");
				System.out.println("4. Close the Program");
				System.out.println("What do you want to Do:");
				choose= scan.nextInt();
				
				
				
				if(choose==1) {
				System.out.println("Enter a Students Number:");
				number= scan.nextInt();
				System.out.println(Student.get(number));
				}else if(choose==2) {
					System.out.println("Enter a Students Name:");
					String name= scan.next();
					System.out.println(Student.indexOf(name));
				}else if(choose==3) {
					System.out.println("Enter a Students Name:");
					String name= scan.next();
					Student.add(name);
				}
				else if(choose ==4) {
					loop=true;
				}
				else {
					System.out.println("Invaild Choice");
				}
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Invaild Student Number");
			}
			catch(Exception e) {
				System.out.println(e);
				scan.next();
			}
		}while(!loop);
	}
	public static void Problem2() {
		
		int x=0;
		int y=0;
		boolean loop=false;
		do {
			try {
				System.out.print("Enter x:");
				x= scan.nextInt();
				System.out.print("Enter y:");
				y= scan.nextInt();
				System.out.println("x:"+x +" y:"+y);
				loop=true;
				x= x+y;
				y= x-y;
				x= x-y;
				System.out.println("x:"+x +" y:"+y);
			}
			catch(InputMismatchException e) {
				System.out.println("Enter a Number");
				scan.next();
			}
			catch(Exception e) {
				System.out.println(e);
				scan.next();
			}
		}while(!loop);
		
	}
	public static void Problem3(){
		try {
			System.out.println("Enter a Word:");
			String word=scan.next();
			if(Palindrome(word)) {
				System.out.println(word +" is a Palindrome");
			}
			else {
				System.out.println(word +" is a not Palindrome");
			}
		}
		catch(Exception e) {
			System.out.println(e);
			scan.next();
		}
	}
	public static boolean Palindrome(String input) {
		
		if(input.equalsIgnoreCase(revesedString(input))) {
			return true;
		}
		return false;
	}
	public static String revesedString(String input) {
		StringBuffer outBuffer= new StringBuffer();
		for(int x=input.length()-1;x>=0;x--) {
			outBuffer.append(input.charAt(x));
		}
		return outBuffer.toString();
	}
}
