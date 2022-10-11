package com.cognixia.jump.javabasics;

public class StaticDemoClass {

	public StaticDemoClass() {
		System.out.println("This is the constructor");
		
	}
	

	//Class Level
	static {
		System.out.println("This is the static code block");
	}
	
	public static void staticMethod() {
		System.out.println("This is the static code Method");
	} 
	
	//instance Level
	{
		System.out.println("This is the anonymous code block");
		
	}
	public void instanceMethod() {
		System.out.println("This is the instance code Method");
	} 
	
}
