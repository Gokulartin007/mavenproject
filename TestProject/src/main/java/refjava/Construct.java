package refjava;

public class Construct {

	int value;
	public void display() {
		System.out.println("Normal method display");
	}
	
	
	Construct(){
		//by default construct does not do anything but we can also define the constructor, 
		//so whenever obj created constructor will be called
		System.out.println("constructor display message");
	}
	
	Construct(int value){
		//constructor overloading 
		System.out.println("constructor overloading value "+value);
	}
	
	public static void main(String[] args) {

		Construct ck=new Construct();  //Construct() -> is a constructor which has same name as class name and does not return anything 
		//it is used to initialize the object and invoked automatically whenever we initialize the obj.
		System.out.println(ck.value);
		ck.display();
		
		Construct cs=new Construct(25);		
		System.out.println(cs.value);
	}

}
