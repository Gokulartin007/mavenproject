package refjava;

public class baseClass  {

	public static void main(String[] args) {

		//creating object for simplecode abstract class 
		//simplecode obj1 = new simplecode(); we cannot create object for abstarct class so creating object for subclass of abstract class 
		subAbstract obj =  new subAbstract(); 
		obj.hello();
		//calling function with object 
		obj.hello();
		obj.SwapWithTemp();
		obj.SwapWithOutTemp();
		
		//calling interface by extended class obj 
		obj.add(5, 10);
		
		
		//creating reference variable for interface; 
		//sample_Interface inter = new simplecode(); we cannot create object for abstract class
		
		sample_Interface inter = new subAbstract();
		// in this above concept v can call only interface function 
		
		//calling interface by creating reference variable for interface 
		inter.sub(5, 11);//we can call by reference variable and class object as well
		
		obj.mul(12, 12);
		
		//static variable of interface are called by extended class name or interface name 
		System.out.println(sample_Interface.limit);
		System.out.println(simplecode.limit);
		//System.out.println(inter.limit);
		System.out.println("");
		
		
		
		//creating object for pattern class 
		pattern pattern = new pattern();
				pattern.star();
				
		

	}

}
