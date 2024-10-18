package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/dropdowns");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement ele=driver.findElement(By.xpath("//h1[.=' Dropdown']"));
	System.out.println(ele.isDisplayed());
	
	WebElement lang=driver.findElement(By.id("lang"));
	System.out.println(lang.isEnabled());
	
	driver.navigate().to("https://letcode.in/radio");
	WebElement country=driver.findElement(By.id("foo"));
	System.out.println(country.isSelected());
	
	}

}
