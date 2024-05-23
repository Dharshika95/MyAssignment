package week3.day2assignment;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Sorted {
	public static void main(String[] args) {
		String[] array = {"HCL","Aspire System","Wipro","CTS"};
		List<String> list = new ArrayList<>();
		for (String st :array) {
			list.add(st);
		
			
		}
		Collections.sort(list);
		System.out.println("required output:");
		for (int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
			
		}
	
		
		
	}

}
