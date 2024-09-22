package testngPack;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	public static void hardAssert() {
		//assertion or hard assertion which will stop the execution if condition fails
		Assert.assertEquals("Gokul", "Gokul", "Assertion message");
		System.out.println("after success assert");
		Assert.assertEquals("Gokul", "sam", "Assertion message");
		System.err.println("after failed assert");
		
			
	}
	public static void SoftAssert() {
		//verify or soft assertion which will not stop the execution even though the condition fails
		SoftAssert sass=new SoftAssert();
		sass.assertEquals("Gokul", "Gokul", "Assertion message");
		System.out.println("after success assert");
		sass.assertEquals("Gokul", "sam", "Assertion message");
		System.err.println("after failed assert");
		
		
	}
	
	public AssertVsVerify() {
		// TODO Auto-generated constructor stub
		System.out.println("assertion methods");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssertVsVerify ass=new AssertVsVerify();
		
		AssertVsVerify.SoftAssert();
		ass.hardAssert();
	}

}
