package javaConcepts;

public class InstanceVariable {

	int c;//instance variable (or) global variable

	public void add() {
		int a=5,b=10;
		int c=a+b;
		System.out.println(c);
		
		// to call instance variable this keyword is used
		System.out.println("to call instance variable " +this.c); 
	}
	
	
	// if access modifier not mentioned then it is default 
	void sub(int a,int b) {
		c=a-b; 
		System.out.println(c);
	}
	
	//accessible within the class 
	private int mul(int n, int m) {
		c=n*m;
		return c;
	}
	
	public void  div(int a, int b) {
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		InstanceVariable jav=new InstanceVariable();
		
		System.out.println("Add");
		jav.add();
		
		int j=jav.mul(10, 20);
		System.out.println("Mul J  "+j);
		
		
		System.out.println("Mul");
		System.out.println(jav.mul(10, 20));
		
		System.out.println("Sub");
		jav.sub(20, 20);
		
		
		System.out.println("Div");
		try {
			jav.div(20, 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
