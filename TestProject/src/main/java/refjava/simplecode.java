package refjava;

public abstract class simplecode implements sample_Interface{

	public void hello(){
		System.out.println("hello form method");
		System.out.println("");
	}
	
	//swapping with temp
	public void SwapWithTemp() {
		System.out.println("swapping with temp");
		int temp,a=5,b=10;
		System.out.println("Before Swapping A="+a);
		System.out.println("Before Swapping B="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping A="+a);
		System.out.println("After Swapping B="+b);
		System.out.println("");
	} 
	
	//swapping without temp
	public void SwapWithOutTemp() {
		System.out.println("swapping without temp");
		int a=5,b=10;
		System.out.println("Before Swapping A="+a);
		System.out.println("Before Swapping B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping A="+a);
		System.out.println("After Swapping B="+b);
		System.out.println("");
	}
	
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c;
		c=a+b;
		System.out.println("sum of A+B = "+c);
		System.out.println("");
	}

	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int c;
		c=a-b;
		System.out.println("sub of A-B = "+c);
		System.out.println("");
	}
}
	
	