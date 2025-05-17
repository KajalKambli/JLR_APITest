package com.selenium;

import java.util.Arrays;

public class Swpar {
	
	public static void main(String[] args)
	
	 
	 {		 
		 
		
		int[] it= {1,2,3,4,5,6};
		int n=it.length;
		
		int[] swaparr=new int[n];
		
		for (int i=0;i<n-1;i+=2)
		{
			
			swaparr[i]=it[i+1];
			swaparr[i+1]=it[i];
			
			
		}
	 
      		if(n%2!=0)
      			
      		{
      			swaparr[n-1]=it[n-1];
      			
      		}
      		
      		System.out.println(Arrays.toString(swaparr));
      		
      		
      		int n1=4;
      		 for (int i = 1; i <= n1; i++) {
                 // Print leading spaces
                 for (int j = 1; j <= n1 - i; j++) {
                     System.out.print("  ");
                 }
                 // Print stars
                 for (int k = 1; k <= 2 * i - 1; k++) {
                     System.out.print("* ");
                 }
                 System.out.println();
	     
	}
	
	 }
}
