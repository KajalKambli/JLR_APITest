package com.selenium;

public class Dupwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p="I love love java java";
		
		String[] PS=p.split(" ");
		
		String p1="";
		
		for(int i=0;i<PS.length;i++)
			
		{
		  
			String sp=PS[i];
			
			if(p1.contains(sp))
					
					{
				
				continue;
					}
			
			p1+=" "+sp;
			
			
		}
		
		System.out.println(p1.trim());
			
			

	}

}
