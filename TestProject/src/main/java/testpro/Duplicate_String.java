package testpro;

public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"Gokul", "varsha", "Gokul", "sam", "sam", "vara", "vara", "vara"};
		String dup = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						dup=dup+arr[i];
						break;
					}
			}
			
		}
		System.out.println("dup "+dup);
		
		
		String a="Chennai";
		String b="Gokul";
		
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		System.out.println(a);
		a=a.substring(b.length());
		System.out.println("a"+a);
		System.out.println("b"+b);
		
	
		
		
	}

}
