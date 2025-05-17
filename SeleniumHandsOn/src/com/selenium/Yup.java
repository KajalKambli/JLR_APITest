package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Yup {
	
	public int m1(int y)
	{
		return y;
		
	}
	

	public static void main(String[] args) {
		
		String str="aabcccccaaa";
		
		
	
				
		ArrayList<String>  arr=new ArrayList<String>();
		
		
		int count=1;
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			
			
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
			{
				count++;
				
				
			}
			
			else
			{
				
				sb.append(str.charAt(i));
				sb.append(count);
				
				count=1;
				
				
			
			}
			
			
			}
		
		System.out.println(sb);
			
		
			String[] str1= {"1","2"};
			
			int[] it=Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
			
			int sm=Arrays.stream(it).sum();
			
			System.out.println("sum of string" +sm);

	
			
	}
		
	}

