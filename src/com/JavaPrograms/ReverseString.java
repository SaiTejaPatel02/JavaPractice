package com.JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		//Using CharAt
		String str = "TEJA";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(" "+str.charAt(i));
		}
		
        System.out.println("");
		
		//Using StringBuffer and StringBuilder
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		StringBuilder sbu = new StringBuilder(str);
		System.out.println(sbu.reverse());
		
		
		
		
		
		
	}

}
