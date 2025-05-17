package com.selenium;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class IndexCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a function char_freq() that takes a string 
		
//		and builds a frequency listing of the characters contained in it.
//		
//		Represent the frequency listing as a Python dictionary. 
//		
//		Try it with something like char_freq("abbabcbdbabdbdbabababcbcbab")
		
		String In="abbabcbdbabdbdbabababcbcbab";
		String In2=In.toLowerCase();
		
	
		System.out.println(In.length());
		
		Map<Character, Integer>  hm=new HashedMap<Character,Integer>();
		
		for(char ch:In2.toCharArray())
		{
			
			if(hm.get(ch)==null)
				
			{
				hm.put(ch, 1);
				
				
			}
			
			else {
				
				hm.put(ch, hm.get(ch)+1);
			}
				//System.out.println(hm);
				
				
			
		}
	System.out.println(hm.entrySet());
		
		hm.forEach((key , value) ->	System.out.println(key+ " occured in " + value));
		
					
				}
		
		
		
	
	
	
		

		
		
	}


