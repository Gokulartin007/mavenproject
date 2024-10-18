package javaConcepts;

public class TCS_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String input="i am working in TCS";

			for(int i=input.length()-1; i>=0;i--){
				System.out.print(input.charAt(i));
			}
			StringBuilder bd= new StringBuilder(input);
			StringBuilder rev=bd.reverse();
			System.out.println("");
			System.err.println(rev);
	
			StringBuffer bb=new StringBuffer(input);
			StringBuffer reb=bb.reverse();
			System.out.println(reb);
		}
	}

}
