package DatabaseTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class DataConnectionSuite {
	Connection Connect;
	Statement Stmt;
	
	
	@Parameters({"Query"})
  @Test
  public void Execute_Query(String query) throws Exception {
	  ResultSet re= Stmt.executeQuery(query);
	  while (re.next()) {
		System.out.println(re.getStatement());
		
	}
  }
  
  @Parameters({"DbLink","Uname","Password"})
  @BeforeClass
  public void beforeClass(String DBlink,String Uname,String Password) throws Exception {
	  Connect=DriverManager.getConnection(DBlink,Uname,Password);
	  Stmt=Connect.createStatement();
	  System.out.println("********************Connection Established*******************");
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Script triggered");
  }

  @AfterSuite
  public void afterSuite() throws Exception {
	  Connect.close();
  }

}
