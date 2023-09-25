package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nagivations {
		
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String URL="https://letcode.in/buttons";
	driver.get(URL);
	driver.manage().window().maximize();
	
	driver.findElement(By.id("home")).click();
	driver.navigate().back();
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	if(currentURL.equals(URL)) {
		
		System.out.println("both are same ");
	}
	else {
		System.out.println("not same ");
	}
	
	driver.quit();
	
	}
}
	
	
