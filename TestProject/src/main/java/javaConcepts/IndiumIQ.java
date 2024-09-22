package javaConcepts;

public class IndiumIQ {

	public static void main(String[] args) {
		String str="Iam Gokul I have 3 years of Experience";

		int length=str.length();
		System.out.println("length "+length);
		String removed=str.replaceAll(" ", "");
		char[] arr=removed.toCharArray();
		int count=0;
		for(int i=0;i<removed.length();i++){
			for(int j=i+1;j<removed.length();j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[j]);
				
					count++;
					break;
				}

			}
			}
		System.out.println("");
		System.out.println(count);

	}

}
