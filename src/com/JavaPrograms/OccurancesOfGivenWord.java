package com.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

//public class OccurancesOfGivenWord {
//
//	public static void main(String[] args) {
//		
//		String s = "JAVA is progamming language.JAVA is widely used";
////		
////		String[] words = s.toLowerCase().split(" ");
////		
////		String input  = "java";
////		
////		int occurances = 0;
////		
////		for(int i =0;i<input.length();i++) 
////			if(words[i].equals(input)) 
////				occurances++;
////				
////			System.out.println(occurances);
//		
//		
//String[] words = s.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
//        
//        String input = "java".toLowerCase();
//        
//        int occurrences = 0;
//        
//        // Loop through the words array
//        for (String word : words) {
//            if (word.equals(input)) {
//                occurrences++;
//            }
//        }
//        
//        // Print the number of occurrences
//        System.out.println(occurrences);
//
//	}
//
//}
public class OccurancesOfGivenWord {

    public static void main(String[] args) {

//        String s = "JAVA is programming language. JAVA is widely used";
//        
//        // Convert the string to lowercase and split by space
//        String[] words = s.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
//        
//        String input = "java".toLowerCase();
//        
//        int occurrences = 0;
//        
//        // Loop through the words array
//        for (String word : words) {
//            if (word.equals(input)) {
//                occurrences++;
//            }
//        }
//        
//        // Print the number of occurrences
//        System.out.println(occurrences);
    	String str = "Java Programming";
//    	
//    	Map<Character, Integer> count = new HashMap<>(); 
//        for (char c : str.toCharArray()) {
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        System.out.println(count);

//    	Map<Character, Integer> count = new HashMap<Character, Integer>();
//    	for (char c : str.toCharArray()) {
//			count.put(c, count.getOrDefault(c, 0)+1);
//		}System.out.println(count);
    	
//    	Map<Character, Integer> count = new HashMap<Character, Integer>();
//    	
//    	for (char string : str.toCharArray()) {
//			count.put(string, count.getOrDefault(string, 0)+1);
//		}System.out.println(count);
		
		

		
		
		
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		for (char string : str.toCharArray()) {
			count.put(string, count.getOrDefault(string, 0)+1);
		}System.out.println(count);		
		
    }
}

///recheck not working