package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetArray { 
	
	//set will not allow the duplications.
	//order will be in random manner
	//no get function in set..if need we have to convert the set into list (for each hashset, treeset, linkedhashset order 
	// will change so output may not be crt so we dont have get in set ) 
	//there are three types in set hashSet, treeSet, linkedHashSet
	//described below 
	
	public static void main(String[] args) {
		//we can also use string and hashSet will return the output in random manner 
		Set<Integer> myset=new HashSet<Integer>();
		myset.add(2);
		myset.add(5);
		myset.add(8);
		myset.add(2);
		myset.add(9);
		
		boolean check = myset.isEmpty();
		System.out.println("is set empty = "+check);
		for (Integer data : myset) {
			System.out.println(data);
		}
		
		
		System.out.println("--------------------");
		myset.remove(2);
		//Enanched for loop
		for (Integer integer : myset) {
			System.out.println(integer);
		}
		
		//this will return the output by ASCII value
		Set<String> tree=new TreeSet<String>();
		tree.add("gokul");
		tree.add("Gokul");
		tree.add("varsha");
		tree.add("gokul");
		tree.add("vachu");
		for (String string : tree) {
			System.out.println(string);
			
			//chumma tried
			if(string=="gokul") {
				tree.remove("gokul");
				break;
			}
		}
		System.out.println("after removal of fields");
		for (String string : tree) {
			System.out.println(string);
		}
		
		
		//it will return the output in same manner what v gave
		Set<String> linked=new LinkedHashSet<String>();
		linked.add("FZ");
		linked.add("NS");
		linked.add("gixxer");
		linked.add("FZ");
		linked.add("duke");
		boolean con=linked.contains("gixxer");
		System.out.println("contains: "+con);
		
		System.out.println("============");
		for (String string : linked) {
			System.out.println(string);
		}
		
		linked.remove("duke");
		boolean con1=linked.contains("duke");
		System.out.println("+++++++++++");
		System.out.println(con1);
		//by converting set into array we can use get function 
		List<String> list=new ArrayList<String>(linked);
		System.out.println(list.get(1));
		System.out.println("------------------");
		list.remove(2);
		for (String string : list) {
			System.out.println(string);
		}
		
		
	}
}
