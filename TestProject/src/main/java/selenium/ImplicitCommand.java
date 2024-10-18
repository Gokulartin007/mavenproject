package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitCommand {
	
	/*
	 * //implicit wait is one time declaration //Once we declare it will wait for
	 * all the findElement and findElements actions alone //and if the element found
	 * within the declared period it will pass to next step it wont wait till the max period we mentioned 
	 */
	@Test
	public  void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL ="https://letcode.in/";
		driver.get(URL);
		
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter registered email']")).sendKeys("gokulartin007@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("465850071");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		System.out.println("login successful");
		
		
		//default time for wait command is zero but testing standard time 30
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  //WebDriverWait
		  
	    driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		System.out.println("logout");
		 
		
		driver.quit();
		
	}

}
