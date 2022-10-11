package com.cognixia.jump.codingproblems;

import java.util.Arrays;

public class ArraysProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1= {1,3,5,0};
		int[] numbers2= {3,0,1,5};
		int[] numbers3= {3,5,1,1};
		int[] numbers4= {1,1,1,1};
		int[] missingArray=makeMissingArray(10);
		if(equals(numbers1,numbers2))
			System.out.println("The Arrays are Equal");
		else {
			System.out.println("The Arrays are Not Equal");
		}
		
		System.out.println("The missing Number is:"+findMissingNumber(missingArray)+Arrays.toString(missingArray));
		
	}
	
	public static int findMissingNumber(int[] missingArray) {
		
		for(int i=0; i<missingArray.length;i++) {
			if(i!=missingArray[i]-1) {
				return i+1;
			}
		}
		return 0;
	}
	
	public static int[] makeMissingArray(int size) {
		int[] missingArray=new int[size];
		double missingNumber=Math.random()*size;
		System.out.println((int)missingNumber+1);
		int number=1;
		for(int i=0;i<missingArray.length;i++) {
			if(i==(int)missingNumber) {
				number++;
			}
			missingArray[i]=number;
			number++;
		}		
		return missingArray;
	}
	
	public static boolean equals(int[] numbers1,int[] numbers2) {
		//check if they are the same length
		boolean test=true;
		int[]temp1=numbers1.clone();
		int[]temp2=numbers2.clone();
		if(temp1.length==temp2.length) {
			for(int i=0;i<temp1.length;i++) {
				for(int j=0; j<temp2.length;j++) {
					if(temp1[i]==temp2[j]) {
						temp1[i]=-1;
						temp2[j]=-1;
					}
				}
			}
			for(int i=0;i<temp1.length;i++) {			
					if(temp1[i]!=-1 )
						test=false;
			}
		}
		else {
			test= false;
		}
		return test;
	}
}
