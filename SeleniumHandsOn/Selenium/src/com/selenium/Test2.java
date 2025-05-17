package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.primitives.Ints;

import net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort;

public class Test2 {

	public static void main(String[] args) {
		
		
		
		int[] Arr={0,0,3,5,7,8,10};
		Arrays.sort(Arr);
		
		List<Integer> integersList = Ints.asList(Arr);
		Collections.sort(integersList, Collections.reverseOrder());
		
		for (int i = 0; i < integersList.size(); i++)
			Arr[i] = integersList.get(i);

		 //System.out.print(Arr[i]);
        // Printing elements of array on console
        for (int x : Arr)
            System.out.print(x + " ");
        
        Integer a[] = { 0,0,1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));

//		 for (Object n : integersList) {
//	            System.out.print(n + " ");
//	        }
	        
		
		
				
				
				
				
			}

	private static void reverse(int[] a) {
		// TODO Auto-generated method stub
		
	};
			
		}
		
		
	
		
		
		// TODO Auto-generated method stub

	