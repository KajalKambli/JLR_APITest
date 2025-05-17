package com.selenium;

public class SumOfChar {

	public static int add(String s) {
		
		
			  
			 
			  
			 int add=0;
			  char c;
			  
			  String[] s1=s.split("");
			  
			  for(int i=0;i<s1.length;i++)
				 
			  
			  {
				  c=s.charAt(i);
			    
			  if(Character.isDigit(c)==true)
			  
			  {
			    int digit=Character.getNumericValue(c);
			    
			    add +=digit;
			    
			   
			    
			  }
			  
			 
			  }
			 return add; 
			 
		
	
			  

	}
	public static void main(String[] args) {
		
		 String s="aa1bc2d3";
		
		System.out.println("sum of charactors:"+add(s));
	}

	
}
