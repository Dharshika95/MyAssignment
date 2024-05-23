package week3.day2assignment;

import java.util.ArrayList;
import java.util.List;

public class IntersectionCode {
	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int num:array1) {
			list1.add(num);
			
		}
		for (int num2:array2) {
			list2.add(num2);
			
		}
		for (int i=0;i <list1.size();i++) {
			if(list1.get(i).equals(list2.get(i))) {
				System.out.println("equal value found:"+list1.get(i));
			}
			
		}
		
	}

}
