package com.JavaPrograms;

public class LargestNumberFromGiven {

	public static void main(String[] args) {
		
//		int num1=111,num2=222,num3=333,num4=444;
//		if(num1>=num2&&num1>=num3&&num1>=num4) {
//			System.out.println(num1+" is the Largest number");
//		}else if (num2>=num1&&num2>=num3&&num2>=num4) {
//			System.out.println(num2+" is the Largest number");
//		}else if (num3>=num1&&num3>=num2&&num3>=num4) {
//			System.out.println(num3+" is the Largest number");
//		}else {
//			System.out.println(num4+" is the Largest Number");
//		}
		
		int num1 = 123,num2 = 321,num3=456,num4=654;
		if(num1<=num2&&num1<=num3&&num1<=num4) {
			System.out.println(num1);
		}else if(num2<=num1&&num2<=num3&&num2<=num4) {
			System.out.println(num2);
		}else if(num3<=num1&&num3<=num2&&num3<=num4) {
			System.out.println(num3);
		}else {
			System.out.println(num4);
		}
		
	}

}
