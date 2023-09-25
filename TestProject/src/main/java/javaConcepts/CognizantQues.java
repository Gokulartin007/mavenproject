package javaConcepts;

public class CognizantQues {
	
	public static void palindrome() {
		int r,sum=0,temp;
		int n=130;
		temp=n;
		while(n>0) {
			
			r=n%10;
			System.out.println("r "+r);
			sum=(sum*10)+r;
			System.out.println("sum "+sum);
			n=n/10;
			System.out.println("n "+n);
		
		}
		if(temp==sum) {
			System.out.println("Palindrome");
			
		}else
			System.out.println("not an palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="Code";
		char[] arr=str.toCharArray();
		for (int i=0; i<arr.length-3;i++){
			System.out.print(arr[i]);
		}
		for(int k=0; k<arr.length-2;k++) {
			System.out.print(arr[k]);
		}
		for(int j=0; j<arr.length-1;j++) {
			System.out.print(arr[j]);
		}
		System.out.println(str);

		//#second method
		System.out.println("second method");
		for (int i=0; i<arr.length;i++){
			for(int j=0; j<=i;j++){
				System.err.print(arr[j]);
			}

			//System.out.print(arr[i]);
		}
		System.out.println("");
		System.out.println("Expected result: CCoCodCode");

		palindrome();
		
	}

}
