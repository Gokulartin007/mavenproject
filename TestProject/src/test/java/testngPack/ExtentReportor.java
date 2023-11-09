package testngPack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;

public class ExtentReportor {
	
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	ExtentSparkReporter reporter;
	ExtentReports extend;
	ExtentTest test;
	
	@Parameters({"Tc_name"})
	@BeforeSuite
	public void beforeSuite(String Tc_name) {
		reporter= new ExtentSparkReporter("./TestResults/" +timestamp+ ".html");
		extend=new ExtentReports();
		extend.attachReporter(reporter);
		test=extend.createTest(Tc_name);
	}
	
	
	
  @Test
  public void func() {
	  System.out.println("Function execution");
	  test.log(Status.PASS, "step login");
  }
  
  
  

  @AfterSuite
  public void afterSuite() {
	  
	  extend.flush();
  }

}
