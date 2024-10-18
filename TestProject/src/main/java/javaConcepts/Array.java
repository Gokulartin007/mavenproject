package javaConcepts;

import java.util.Arrays;
import java.util.Iterator;

public class Array {
	static String[] brand= {"hero","honda","ktm","bajaj","RE"};
	public static void main(String[] args) {
		
		/*
		 * String[] brand2= {"hero","honda","ktm","bajaj","RE"}; String
		 * ind2=brand2[2-1]; System.out.println(ind2);
		 */
		int[] arr= {2,3,5,3,5};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]+arr[2]);
		
		String ind=brand[2-1];
		System.out.println("Printing directly "+brand[1]);
		System.out.println(ind);
		
		int a=54;
		String b=Integer.toString(a);
		System.out.println("Length of String "+b.length());// O/P as 2
		int c=Integer.parseInt(b);
		//to print the all the element in array
		System.out.println(brand.length);
		System.out.println(Arrays.toString(brand));
		
		System.out.println("before for oop");
		
		for (String string : brand) {
			System.out.println(string);
		}
		String[] abb= new String[5];
		abb[1]="name1";
		abb[3]="name3";
		abb[4]="name4";
		abb[5]="name4";//will throw array index out of bound exception 
		
		for (String string : abb) {
			System.out.println(string);
		}
	}
	
}
