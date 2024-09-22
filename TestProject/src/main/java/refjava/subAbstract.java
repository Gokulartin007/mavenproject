package refjava;

public class subAbstract extends simplecode {

	public void multiply(int a, int b) {
		int c;
		c=a*b;
		System.out.println("mul of A*B = "+c);
		System.out.println("");
	}
  
	public static void main(String[] args) {
		subAbstract se=new subAbstract();
		System.out.println(sample_Interface.limit);
		subAbstract s2=new subAbstract();
		System.out.println(s2.limit);
		se.mul(limit, limit);
		se.add(limit, limit);
		se.sub(limit, limit);
		se.mul(10, limit);
	}

	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		int c;
		c=a*b;
		System.out.println("mul of A*B = "+c);
		System.out.println("");
	}
}
