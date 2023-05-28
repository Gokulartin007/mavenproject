package javaConcepts;

public class StaticVariableAndFunc {

	int a;
	static int b;


	//static function 
	public static void display() {
		System.out.println("static display func");

	}

	public void nonStatic() {
		System.out.println("Non static display func");
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	
	
	//this keyword cannot be used 
	public static void main(String[] args) {
		//for calling static function object recreation not required 
		display();

		//When Ever we create constructor instance variable will be initialize    
		//When Ever we create constructor static variable will be initialize
		StaticVariableAndFunc st= new StaticVariableAndFunc();
		st.nonStatic();

		//When Ever we create constructor instance variable will be initialize    
		//When Ever we create constructor static variable will be remains  
		StaticVariableAndFunc st1= new StaticVariableAndFunc();
		st1.nonStatic();
	}






}
