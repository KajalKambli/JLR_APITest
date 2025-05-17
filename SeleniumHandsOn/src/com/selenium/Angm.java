package com.selenium;

import java.util.Map;

public class Angm {
	
	
	public static boolean angram(String s1,String s2) {
		
		if(s1==null || s1.isEmpty() || s2==null || s2.isEmpty())
			
		{
			return ((s1==null || s1.isEmpty()) && (s2==null || s2.isEmpty()));
			
		}
		
		if (s1.length() != s2.length())
		{
			return false;
			
		}
		
		
		s1=s1.toLowerCase();
		
		s2=s2.toLowerCase();
		
		if(!s2.contains(s1))
			
		{
			
			return false;
			
		}
		
		return false;
		
		
	}

	public static void main(String[] args) {
		System.out.println("Test Case 1: listen, silent - " + angram("listen", "silent")); // true
        System.out.println("Test Case 2: hello, world - " + angram("hello", "world")); // false
        System.out.println("Test Case 3: Racecar, racecar - " + angram("Racecar", "racecar")); // true
        System.out.println("Test Case 4: ab, ba - " + angram("ab", "ba")); // true
        System.out.println("Test Case 5: aab, aba - " + angram("aab", "aba")); // true
		
		
		// TODO Auto-generated method stub

	}

}
