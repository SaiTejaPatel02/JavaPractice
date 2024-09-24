package com.JavaPrograms;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ANgram {

//	public static void main(String args[]) {
//		int a[]= {1,1,2,3,3,4,5,6,6};
//		int j=0;
//      Arrays.sort(a);
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]!=a[i+1]) {
//				a[j++]=a[i];
//			}
//		}
//		a[j++]=a[a.length-1];
//		for(int k=0;k<j;k++) {
//			System.out.print(a[k]+" ");
//		}
//	}

//	public static boolean ang(String str1,String str2) {
//		String s1 = str1.replaceAll("\\s", "").toLowerCase();
//		String s2 = str2.replaceAll("\\s", "").toLowerCase();
//		if(s1.length()!=s2.length()) {
//			return false;
//		}
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		
//		return Arrays.equals(c1, c2);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(ang("listen","silent"));
//	}

//	public static boolean angram(String str1,String str2) {
//		String s1 = str1.replaceAll("\\s", "").toLowerCase();
//		String s2 = str2.replaceAll("\\s", "").toLowerCase();
//		
//		if(s1.length()!=s2.length()) {
//			return false;
//		}
//		
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		
//		return Arrays.equals(c1, c2);	
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(angram("listen","silent"));
//	}

//	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 2, 4, 5, 6, 5 };
//		int j = 0;
//		Arrays.sort(a);
//		for (int i = 0; i < a.length - 1; i++) {
//			if (a[i] != a[i + 1]) {
//				a[j++] = a[i];
//			}
//		}
//		a[j++] = a[a.length - 1];
//		for (int k = 0; k < j; k++) {
//			System.out.print(a[k] + " ");
//		}
//	}
	
public static void main(String[] args) {
	

int temp,size;

int []list = {28,14,45,23,12,56,34,85};

  size = list.length;

for(int i=0;i<size-1;i++) {
	for(int j=i+1;j<size;j++) {
		if(list[i]>list[j]) {
			temp = list[i];
			list[i]=list[j];
			list[j]=temp;
		}
	}
}
for(int k=0;k<size;k++) {
	System.out.print(" "+list[k]);
}
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
