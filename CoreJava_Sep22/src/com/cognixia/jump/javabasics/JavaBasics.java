package com.cognixia.jump.javabasics;

public class JavaBasics {

	public static void main(String[] args) {
		
		//Java Variables
		int dice;
		double d;
		
		for(int x=0;x<10;x++) {
			d=Math.random()*6;
			dice=(int)d+1;
		
			System.out.println(dice);
		}

	}

}
