package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class letCodeSignUp{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL ="https://letcode.in/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Gokul");
		driver.findElement(By.xpath("//input[@placeholder='Enter valid email address']")).sendKeys("gokulartin007@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("465850071");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
		System.out.println("Sign up successful");
	}

}
