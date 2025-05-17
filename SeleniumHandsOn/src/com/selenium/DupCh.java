package com.selenium;

public class DupCh {

	public static void main(String[] args) {
		
		String s="Programming";
		
		String s1="";
		
		for(int i=0;i<s.length();i++)
			
		{
			String ch=""+s.charAt(i);
			if(s1.contains(ch))
			{
			continue;
			}
			
			s1+=ch;
			
			
		}
		System.out.println(s1); 
		
		// TODO Auto-generated method stub

	}

}
