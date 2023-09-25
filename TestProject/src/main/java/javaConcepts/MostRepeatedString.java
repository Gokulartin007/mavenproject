package javaConcepts;

public class MostRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"aaa", "bbb","aaa", "bbb", "aaa", "ccc"};
		int count=1;
		String maxvar = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					maxvar=arr[i];
					
				}
			}
		}
		System.out.println(count);
		System.out.println(maxvar);
		
	}

}
