package com.JavaPrograms;

import java.math.BigInteger;

//import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number to get the Factorial-");
		
//		int num = 5;//sc.nextInt();
//		int fact = 1;
//		for(int i=1;i<=num;i++) {
//			fact = fact*i;
//		}
//		System.out.println("Factorial of "+num+" is "+fact);
		
//-------------------BigInteger---------------------------------------------------------------------
		
		int num=40;
		BigInteger fact=BigInteger.ONE;
		
		for(int i=1;i<=num;i++) {
			fact = fact.multiply(BigInteger.valueOf(i) );
		}
		System.out.println(fact);
	
		
//		Data Type Limitations:
//
//		The int type in Java can handle values up to 2,147,483,647 (which is 2^31 - 1). 
//		Factorial grow very quickly, and 40! (factorial of 40) is 8159152832478977343456112695961158942720000000,
//      which is much larger than what an int can hold. This will result in an overflow and produce incorrect results.
//		Using BigInteger:
//
//		For handling large numbers like factorial of 40 and beyond, you should use BigInteger,
//		which can handle arbitrarily large integers.

		
		
		
		
		
	}

}
