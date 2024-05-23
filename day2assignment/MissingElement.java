package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,10,6,8};
		List<Integer> li = new ArrayList<>();
		for (Integer ele :array) {
			li.add(ele);
			
		}
		Collections.sort(li);
		System.out.println("sorted list:"+li);
		System.out.println("missing numbers:");
		for (int i=0;i<li.size()-1;i++) {
			int current = li.get(i);
			int next = li.get(i+1);
			if (current+1!=next) {
				for (int j =current+1;j<next;j++) {
					System.out.println(j);
					
				}
				
			}
			
		}
			
			
		
		
	}

}
