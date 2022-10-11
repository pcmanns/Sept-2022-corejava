package com.cognixia.jump.javabasics;

public class StaticDemoDriver {

	public static void main(String[] args) {
		
		
		StaticDemoClass.staticMethod();
		StaticDemoClass demo= new StaticDemoClass();
		demo.instanceMethod();
		StaticDemoClass demo2= new StaticDemoClass();
		
	}

}
