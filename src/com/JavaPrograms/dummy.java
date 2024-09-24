package com.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.events.Characters;

public class dummy {

	public static void main(String[] args) {
		int a = 0, b = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println();

		// --------Even-Odd-----------------

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "-Even");

			}
			if (i % 2 != 0) {
				System.out.println(i + "-Odd");
			}
		}

		// ------------Prime------------------

		for (int i = 1; i < 100; i++) {
			boolean prime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime)
				System.out.print(i + " ");
		}
		System.out.println();

		// ---------reverse string-----------------

		String str = "SUPER";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();

		// --------Palindrome or Reverse Number----

		int num = 123454321, rev = 0, temp = num;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (rev == temp)
			System.out.println("number is Palidrome");
		if (rev != temp)
			System.out.println("number is not palindrome");
		System.out.println();
		
		//------------Reverse Array------------------
		
		int ar[]= {1,2,3,4,5,6};
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]);
		}System.out.println();
		//--------------------------------------
        
		
		
         

	}

}
