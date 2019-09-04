package com.nicksdesk.fizzbuzz;

import java.util.HashMap;
/*
 * An efficient way of doing fizzbuzz with unlimited scalability
 */
public class Main {

	//define used vars here as the forEach is not able to access them as they are not final
	private static int i;
	private static StringBuilder content;
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> items = new HashMap<Integer, String>();
		
		//add the numbers and string to replace with in the fizzbuzz algorithm
		items.put(2, "fizz");
		items.put(3, "buzz");
		items.put(6, "bizz");
		
		fizzBuzz(items, 100);
	}
	
	//set this as a separate function for organization
	public static void fizzBuzz(HashMap<Integer, String> hits, int length) {
		
		//loop through the specified amount of numbers
		for(i = 1; i <= length; i++) {
			
			//be sure to assign content to a new instance of StringBuilder so that the previous content is erased
			content = new StringBuilder();
			
			//loop through k,v map and run modulus operator on all values
			hits.forEach((key, value) -> {
				if(i % key == 0) content.append(value);
			});
			
			//if the current value of content is empty
			if(content.toString().isEmpty()) content = new StringBuilder(Integer.toString(i));
			
			//print content to the log
			System.out.println(content);
			
		}
		
	}
	
}
