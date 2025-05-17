 
package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class Splitstringtest {

	public static void main(String[] args) {
		
		     // int i=0;
		      String s = "kajal pranil";
		      String b="Kajal";
		        // split string using regex
		        String[] arr = s.split(" ");
		    
		        
		        ArrayList<String> MissingWd=new ArrayList<>();
		       
		        for(int i=0;i<arr.length;i++) {
		        if(!b.contains(arr[i]))
		        
		        {
		        	MissingWd.add(arr[i]);
		      	    	
		        	
		        	    	
		        }
		        
		        else {
		        	
		        	//System.out.println("");
		        }
		        Iterator<String> ans =MissingWd.iterator();
			    while (ans.hasNext()) {
			        System.out.println(ans.next());
			       
			    }
		        
		        }
		        
		        
		        
		        	
		        //char[] arr1=s.toCharArray();
		        

		      //
		        String a=arr[0];
		      // System.out.println(a);
		        
		        
		    }
		
		// TODO Auto-generated method stub

	}


