package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListArray {
	public static void main(String[] args) {


		//list will allow duplicate values 
		//and retain the same order as v give
		List<String> fruits= new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("fig");
		
		fruits.size();

		System.out.println(fruits.get(1));
		//to get the position of particular string 
		System.out.println(fruits.indexOf("apple"));
		//to get the position of particular string from last
		System.out.println(fruits.lastIndexOf("apple"));
		
		//will sort the list and keep it 
		Collections.sort(fruits);
		
		
		//list are case sensitive
		boolean contains=fruits.contains("apple");
		System.out.println(contains);
		fruits.remove(4);
		
		for(String bal : fruits) {
			System.out.println(bal);
		}
		
		
		List<String> dup= new ArrayList<String>(fruits);
		
		for(String bal : fruits) {
			System.out.println(bal);
		}
		dup.addAll(fruits);
		for(String bal : fruits) {
			System.out.println(bal);
		}
 		System.out.println(fruits.get(1));
		System.out.println(fruits.size());
		
		fruits.clear();
		System.out.println("after clear");
		System.out.println("is empty: "+fruits.isEmpty());
		
		
	
	
	}
	
}
