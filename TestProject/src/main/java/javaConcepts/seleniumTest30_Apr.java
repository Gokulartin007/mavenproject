package javaConcepts;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest30_Apr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		//Thread.sleep(3000);
		
		driver.switchTo().frame("callout");
		
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		System.out.println("program executed ");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("yenda mimicry", Keys.ENTER);
		
		driver.findElement(By.xpath("//*[contains(text(), 'gokul__sekar')]")).click();
		driver.findElement(By.xpath("(//a[@role='link' and text()='Log in'])[2]")).click();
		
		
		
		//driver.quit();
		
	}

}
