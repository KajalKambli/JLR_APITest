package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.lang3.ArrayUtils;

public class Msnwd {

	public static void main(String[] args) {
		
        String s1="I Love Java";
        
        String[] S1=s1.split(" ");
        
       
        
        String s2="I Java";
        
        String[] S2=s2.split(" ");
        
        ArrayList<String> ar1=new ArrayList<String>(); 
        ArrayList<String> ar2=new ArrayList<String>(); 
        
       for (int i=0;i<S1.length;i++)
       {
    	   ar1.add(S1[i]);
       }
		
       for (int j=0;j<S2.length;j++)
       {
    	   ar2.add(S1[j]);
       }		
		
              
       System.out.println(ar1);
       System.out.println(ar2);
       ar1.removeAll(ar2);
       System.out.println(ar1);
       System.out.println(String.join(" ", ar2));
       
       int a=20;
       int b=30;
       
       int t;
       
       t=a;
       a=b;
       b=t;
       
       System.out.println("value of a & b: " +a+ " & " +b) ;
       
       String K="kajal";
       
       StringBuffer sb=new StringBuffer(K);
       sb.reverse();
       System.out.println(sb);
       
       
       String p="  Hi   I am     new to world  ";
       String p5="  Hi     I       am     new to world  ";
      System.out.println("reace print -"+p5.replace("  ", "")); 
       
       //p=p.trim();
       String[] p1=p.split("\\s");
      
       p1=ArrayUtils.removeElement(p1, "");
       
       p1=Arrays.stream(p1).filter(s->!s.equals("")).toArray(String[]::new);
       System.out.println(Arrays.toString(p1));
       
       String p2=String.join(" ", p1);
       
       System.out.println(p2);
       
       
       
       
       
       
	}
	
	

	
}
