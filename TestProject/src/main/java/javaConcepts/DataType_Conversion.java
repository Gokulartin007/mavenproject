package javaConcepts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataType_Conversion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str="2365"; 
		System.out.println("Converting String into int "+(Integer.parseInt(str)));//converting String into int
		
		int in=253;
		System.out.println("Converting int into String "+(Integer.toString(in)));
		
		String floatstr="2365.3256"; 
		System.out.println("Converting String into double "+(Double.parseDouble(floatstr)));//converting String into double
		
		String longstr="23653256"; 
		System.out.println("Converting String into long "+(Long.parseLong(longstr)));//converting String into long
		
		//String floatstr="2365.3256"; 
		System.out.println("Converting String into float "+(Float.parseFloat(floatstr)));//converting String into floats
		
		String dt="31/03/2031";
		SimpleDateFormat dt1= new SimpleDateFormat("MM/dd/yy");
		System.out.println("Converting String into date "+dt1.parse(dt));//Converting String into date
		System.out.println("Converting String into date "+dt1.format(dt1.parse(dt)));//formatting date into correct format
		
		
		
	}

}
