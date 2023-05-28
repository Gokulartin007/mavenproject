package javaConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions co= new ChromeOptions();
		 
		 
		
		/*        <-- 1st METHOD --> 
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Drivers\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 */
		
		
		/*  <-- 2nd METHOD with webdriver manager 4.0 version -->
		 * 
		 * WebDriverManager.chromedriver().setup();  // it will check for driver and browser compatibility available in ur machine and set the system property (System.setProperty)   
		 * WebDriver driver= new ChromeDriver(); // need to initialize the webdriver
		 * driver.get("https://www.google.com/");
		 */

		
		 // 3nd METHOD with webdriver manager 5.0 version 
		
		 WebDriverManager.chromedriver().browserVersion("112.0").setup(); //to set up exact version to be used  
		 WebDriver driver= new ChromeDriver();  
		 
		 
		//WebDriver driver= WebDriverManager.chromedriver().create(); //it will download the driver according to the machine's browser version and create the driver instance 
		driver.get("https://www.google.com/");
		 		

	}

}
