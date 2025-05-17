package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MisWdnew {

	public static void main(String[] args) {
		
		
		String s1="I Love Java";
		
		String s2="I Java";
		
		
		String[] s3=s1.split(" ");
		
		//System.out.println(Arrays.toString(s3));
		
		
		ArrayList<String> ar=new ArrayList<String>();
		
		
		for(int i=0;i<s3.length;i++){
			
		if(!s2.contains(s3[i])) {
			
			ar.add(s3[i]);
			
				
		}

			
		}
		
		Iterator<String> it=ar.iterator();
		
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
			
		//System.out.println(ar);
		

	}

}
