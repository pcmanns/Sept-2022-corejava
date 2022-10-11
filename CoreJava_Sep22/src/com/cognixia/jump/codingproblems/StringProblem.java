package com.cognixia.jump.codingproblems;

public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("This is a Test");
		
		System.out.println(revesedString(str1));
		System.out.println(spaceStringRevesed(str1)); 
	}
	public static String revesedString(String input) {
		StringBuffer outBuffer= new StringBuffer();
		for(int x=input.length()-1;x>=0;x--) {
			outBuffer.append(input.charAt(x));
		}
		return outBuffer.toString();
	}

	
	
	public static String spaceStringRevesed(String input) {
		StringBuffer outBuffer= new StringBuffer();
		int y=0;
		for(int x=0;x<input.length();x++) {
			if(input.charAt(x)==' ') {
				outBuffer.append(revesedString(input.substring(y, x))+' ');
				y=x+1;
			}
		}
		outBuffer.append(revesedString(input.substring(y)));
		return outBuffer.toString();
	}
}
