package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Misingwd {

	static String s="I love Pranil from amboli";
	
	static String t="I love Pranil";
	public static void findWord(String s, String t) {
		ArrayList<String> missingWords = new ArrayList<String>();
	    String[] words = s.split(" ");
	    for(int i=0; i < words.length; i++) {
	        if (!t.contains(words[i])) {
	            missingWords.add(words[i]);
	            
	        }
	    }
	    System.out.println(missingWords);
	 
	 
	    Iterator<String> ans =missingWords.iterator();
	    while (ans.hasNext()) {
	        System.out.println(ans.next());
	        
	    
	       
	    }
	    	    
	}
	
	
	public static void main(String[] args) 
	
	{
		Misingwd.findWord(s, t);
		
		}

}
