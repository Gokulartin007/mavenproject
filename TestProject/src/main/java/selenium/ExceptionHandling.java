package selenium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try { 
			System.out.println("Enter 1st the number");
			int a =sc.nextInt();
			System.out.println("Enter 2nd the number");
			int b =sc.nextInt();
			int c=a/b;
			System.out.println("division of two numbers = "+c);
		}catch(InputMismatchException e){

			e.printStackTrace();  //for printing error msg, should not give in sys out 

			System.err.println(e.getMessage());   // to get the error message 
		}catch(Exception e) { 

			//we can have any number of try catch in script 
			// if not particular Exception msg given and going with generic one then that should be in last 

			System.out.println(e.getMessage());

			e.printStackTrace();

		}finally { 
			//either try execute nor catch execute the finally part will also execute  

			sc.close();     //closing the SC else it will throw warning message
		}
		System.out.println("");

		System.out.println("Execution not interrupted anywhere");
	}

}
