package week3.day2assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SecondLargeNum {
	public static void main(String[] args) {
		int[] array = {3,2,11,4,6,7};
		List<Integer> li = new ArrayList<Integer>();
		for (int num : array) {
			li.add(num);
			
			
		} 
		Collections.sort(li);
		System.out.println("sec ele from the last:"+li.get(li.size()-2));
		System.out.println("second largest number:"+li.get(li.size()-2));
		
		
		
	
		
		
		
		
		
	}

}
