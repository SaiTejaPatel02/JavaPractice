package com.JavaPrograms;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class Anagram {

	// Function to check if two strings are anagrams
//    public static boolean areAnagrams(String str1, String str2) {
//        // Remove spaces and convert strings to lowercase
//        String s1 = str1.replaceAll("\\s", "").toLowerCase();
//        String s2 = str2.replaceAll("\\s", "").toLowerCase();
//
//        // Check if the lengths are different
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//
//        // Convert strings to character arrays and sort them
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//
//        // Compare sorted char arrays
//        return Arrays.equals(c1, c2);
//    }
//
//    public static void main(String[] args) {
////        String str1 = "listen";
////        String str2 = "silent";
////
////        if (areAnagrams(str1, str2)) {
////            System.out.println(str1 + " and " + str2 + " are anagrams.");
////        } else {
////            System.out.println(str1 + " and " + str2 + " are not anagrams.");
////        }
//    	
//    	System.out.println(areAnagrams("Listen","Silent"));
//    }

	public static void main(String[] args) {

		String str = "AJET";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}
}
