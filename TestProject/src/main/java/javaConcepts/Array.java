package javaConcepts;

import java.util.Arrays;

public class Array {
	static String[] brand= {"hero","honda","ktm","bajaj","RE"};
	public static void main(String[] args) {
		
		/*
		 * String[] brand2= {"hero","honda","ktm","bajaj","RE"}; String
		 * ind2=brand2[2-1]; System.out.println(ind2);
		 */
		
		
		String ind=brand[2-1];
		System.out.println("Printing directly "+brand[1]);
		System.out.println(ind);
		
		
		//to print the all the element in array
		System.out.println(brand.length);
		System.out.println(Arrays.toString(brand));
		
		System.out.println("before for oop");
		
		for (String string : brand) {
			System.out.println(string);
		}
	}
	
}
