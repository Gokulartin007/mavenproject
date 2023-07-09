package testngPack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para {
	@Parameters({"email","password"})
	@Test
	public void main(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println("email "+email+" "+"password "+password);

	}

}
