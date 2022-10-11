package com.cognixia.jump.execeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeceptionDriver {

	public static void main(String[] args) {
			
		Scanner Input =new Scanner(System.in);
		
		int numb=0;
		boolean bo=false;
		do {
			try {
				System.out.print("Enter a Number:");
				numb = Input.nextInt();
				bo=true;
				int ans = 10 / numb;
				System.out.println(ans);

			} catch (InputMismatchException e) {
				System.out.println("Only Enter a Number");
				Input.next();
				bo=false;
			} catch (ArithmeticException e) {
				System.out.println("you try to " + e.getMessage());
			} catch (Exception e) {
				//Never have a Empty Exception
				e.printStackTrace();
			} 
		} while (!bo);
		System.out.print(numb);
	}

}
