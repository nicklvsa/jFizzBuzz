package com.nicksdesk.fizzbuzz;

import java.util.HashMap;

public class Main {

	private static int i;
	private static StringBuilder content;
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> items = new HashMap<Integer, String>();
		items.put(2, "fizz");
		items.put(3, "buzz");
		items.put(6, "bizz");
		
		fizzBuzz(items, 100);
	}
	
	public static void fizzBuzz(HashMap<Integer, String> hits, int length) {
		
		for(i = 1; i <= length; i++) {
			
			content = new StringBuilder();
			
			hits.forEach((key, value) -> {
				if(i % key == 0) content.append(value);
			});
			
			if(content.toString().isEmpty()) content = new StringBuilder(Integer.toString(i));
			
			System.out.println(content);
			
		}
		
	}
	
}
