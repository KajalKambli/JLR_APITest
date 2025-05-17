package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class FrqWd {
	
	
	public static void main(String[] args ) {
		
		String s="I love love java,java bit more more";
		
		String[] s1=s.split("[,\\s]");
		
		System.out.println(Arrays.toString(s1));
		
//		ArrayList<String> s2=new ArrayList<>();
//		
//		for(int i = 0;i<s1.length;i++) {
//			
//			s2.add(s1[i]);
//			
//			
//			
//			
//		}
		
		
		
		//String[] s1=s;		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(String sh:s1)
		{
			
			//System.out.println(sh);
			if(hm.get(sh)==null)
			{
				hm.put(sh,1);
				
			}
			
			else {
				
				hm.put(sh, hm.get(sh)+1);
			}
			
		}
		
		hm.forEach((k,v)-> System.out.println(k+ " occured in " +v ));
		
	}

}
