package com.selenium;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;




public class RemoveArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"1","2","3","4","5"};
		
		System.out.println("string is" +Arrays.toString(str));
		str=ArrayUtils.remove(str,3);
		
		
		
		str=ArrayUtils.removeElement(str, "1");
		
		
		str=Arrays.stream(str).filter(s ->!s.equals("3")).toArray(String[] ::new);
		 String resul1=Arrays.stream(str).collect(Collectors.joining(" "));
		 System.out.println(resul1);
		
		for(String s:str) {
			
					
			System.out.println(Arrays.toString(str));
		} 
		
		

	}

}
