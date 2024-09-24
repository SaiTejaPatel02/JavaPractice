package com.JavaPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		
//		int n = 1234;
//		int sum = 0;
//		while(n!=0) {
//			sum = sum+n%10;
//			n=n/10;
//		}
//        System.out.println("Sum of Digits: "+sum);
		
		
//----------------String Palindrome or not------------------------
		
		String str = "madame",rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
			if(str.equals(rev))
			System.out.println(rev);
			
		}
		
		
		
	}

}
