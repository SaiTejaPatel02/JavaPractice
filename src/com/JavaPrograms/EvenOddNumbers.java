package com.JavaPrograms;

//import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Number ");
		int num = 6;  //sc.nextInt();
		if(num%2==0) {
			System.out.println("Given "+num+" is Even number");
		}else {
			System.out.println("Give "+num+" is Odd Number");
		}
		
//-----	when i value is divided by 2 and equal to 0 it is Even Number
		for (int i=1;i<=100;i++) {
			
			if(i%2==0) {
				System.out.println(i+"-Even");
			}
//			if(i%2!=0) {
//				System.out.println(i+"-Odd");
//			}

	}
		
//----- When j value is divided by 2 and not equal to 0 it is Odd Number  
		for(int j=1;j<=100;j++) {
			if(j%2!=0){
			System.out.println(j);
		}
	}

}
}