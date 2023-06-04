package testpro;

public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"Gokul", "varsha", "Gokul", "sam", "sam", "vara", "vara", "vara"};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				String dup = null;
					if(arr[i]==arr[j]) {
						dup=arr[i];
					}
					System.out.print(" "+dup);
			}
			
		}
		
		
	}

}
