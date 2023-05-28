package testpro;

import java.util.Iterator;

public class palindrome {

	public static void palindrome_Without_Method(String word) {
		String rev="";
		for (int i = word.length()-1; i >=0; i--) {
			rev=rev+word.charAt(i);
		}
		if(word.equals(rev)) {
			System.out.println(word+" is palindrome");
 		}else
 			System.out.println(word+" is not palindrome");
	}
	
	public static void InbuiltRev(String name) {
		StringBuffer bd=new StringBuffer();
		bd.append(name);
		System.out.println(bd.reverse());
		
	}
	
	
	public static void main(String[] args) {
		palindrome_Without_Method("gokul");
		InbuiltRev("Gokul");
	}

	
}
