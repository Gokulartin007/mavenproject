package selenium;


import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigLoader;

public class Login_throws {
	//public  void main() throws InterruptedException this is just to avoid the error 
	//but not recommended always use try catch to avoid   
	
	
	@Test
	public  void main() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = WebDriverManager.chromedriver().create();
		String URL ="https://letcode.in/"; //fields
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//load from config file
		String uname=ConfigLoader.getProp("Username");
		String pass=ConfigLoader.getProp("Password");
		System.out.println("from loader class "+uname);
		System.out.println("from loader class "+pass);
		
		
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter registered email']")).sendKeys(uname);
		
		//now the xpath is given wrong and obviously it'll throw and error
		try {
			driver.findElement(By.xpath("//input[@placeholder='Enter password1']")).sendKeys("465850071");
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
			//where this will stop the execution 
			//throw new RuntimeException();
		}
		 
		
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='LOGIN']"));
		loginBtn.click();
		WebElement bt=driver.findElement(with(By.tagName("input")).above(loginBtn));
		
		//if we give thread.sleep it will show error and java ask to add the "Unhandled exception type InterruptedException"
		//so that exception will be declared with the keyword throws in the method signature
		//public  void main() throws InterruptedException 
		Thread.sleep(3000);
		System.out.println("login successful");

		driver.quit();

	}

}
