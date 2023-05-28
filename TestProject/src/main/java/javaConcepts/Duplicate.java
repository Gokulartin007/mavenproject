package javaConcepts;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Quote="beautiful beach";
		//String Quote="Iam Gokul I have 3 years of Experience";
		char[] arr=Quote.toCharArray();
		System.out.println(arr);
		System.out.println(arr.length);
		int count=0;
		for(int i=0; i<Quote.length();i++) {
			for(int j=i+1; j<Quote.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]);
					count++;
					break;
				}
			}

		}
		System.out.println("");
		System.out.println("No of duplicate char "+count);

	}
}