package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//creates blank html page
			ExtentSparkReporter reporter=new ExtentSparkReporter("./TestResults.html");
			//create report for the test file
			ExtentReports extend=new ExtentReports();
			
			extend.attachReporter(reporter);
			
			ExtentTest test=extend.createTest("Test run TC001");
			test.pass("login step");
			extend.flush();
			
	}

}
