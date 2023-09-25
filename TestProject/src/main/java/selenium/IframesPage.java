package selenium;





import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesPage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", 
				//"C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		/*
		 * boolean validation=driver.findElement(By.
		 * xpath("//h1[contains(text(),'Enter Details')]")).isDisplayed();
		 * System.out.println(validation);
		 */

		List<WebElement> framesCount =driver.findElements(By.tagName("iframe"));
		System.out.println(framesCount.size());

		for(int i=0; i<framesCount.size(); i++) {

			System.out.println(framesCount.get(i).getAttribute("name"));

		}
		//passing name as argument we need name mention attribute name r id..automatically it will search for name or id  
		driver.switchTo().frame("firstFr"); 
		driver.findElement(By.name("fname")).sendKeys("Gokul");
		driver.findElement(By.name("lname")).sendKeys("s");

		WebElement innerframe=driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		//passing index as argument..here we give 0 as index bcause its a inner frame of above frame
		driver.switchTo().frame(innerframe);
		driver.findElement(By.name("email")).sendKeys("gokulartin007@gmail.com");;

		//get one frame backward
		driver.switchTo().parentFrame();
		
		//get back to main page
		driver.switchTo().defaultContent();
		
		
		//from main page navigating to 3rd frame whose index is 2
		driver.switchTo().frame("firstFr"); 
		driver.findElement(By.name("fname")).sendKeys("sam");
		
	//	System.out.println(frameattribute);
		
		
		//from mainpage to another frame via webelement 
		driver.switchTo().defaultContent();
		WebElement ndframe=driver.findElement(By.xpath("//iframe[@id='aswift_0']"));
		driver.switchTo().frame(ndframe);
		System.out.println("WebElement switch success");//140
		
		
		
		

	}

}
