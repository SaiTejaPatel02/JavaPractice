package com.JavaPrograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
//		int temp,size;
//		int[]array= {10,5,20,63,12,57,88,60};
//		
////Sorting using Inbuilt Method
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		
////////////////////////////////////////////////////////////
//		size=array.length;
//		for(int i=0;i<=size;i++) {
//			for(int j=i+1;j<size;j++) {
////For Descending order use < Symbol
//				if(array[i]>array[j]) {
//					temp = array[i];
//					array[i]=array[j];
//					array[j]=temp;
//				}
//			}
//		}
//		for(int k=0;k<array.length;k++)
//		System.out.print(" "+array[k]);
//
		
		int temp;
		
		int arr[] = {12,21,2,34,23,54,45,43,8,6,7,3};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		for(int k = 0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
		
		
		
		
		
	}

}
