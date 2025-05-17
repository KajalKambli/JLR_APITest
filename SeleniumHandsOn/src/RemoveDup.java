import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.util.SystemOutLogger;

public class RemoveDup {

	public static void main(String[] args) {
		
		String s="Programming";
		s=s.toLowerCase();
		
		HashSet<Character> hm=new HashSet<>();
		//ArrayList<Character> arr=new ArrayList<>();
		
		for(char ch:s.toCharArray())
			
		{
			hm.add(ch);
			
		}
		
		
		char ch5[]=new char[hm.size()];
		
		
			String[] str= {"1","2","3","4"};
		
			
			//int[] ints = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
		int[] ints = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
			 
			 int sum=Arrays.stream(ints).sum();
			 
//			 int sum=0;
//			 int i;
//			 
//			 for (i = 0; i < ints.length; i++) {
//		            sum += ints[i];
//			 
//			 
//			 }
					System.out.println(sum); 
					
					String s3="Welcom to LIT";
					
					StringBuffer sb=new StringBuffer(s3);
					sb=sb.reverse();
					
					System.out.println(sb);
		
	//hm.toString();
		// TODO Auto-generated method stub

	}

}
