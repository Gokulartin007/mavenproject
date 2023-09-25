package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		 
		//calling  browser launching method 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fullName")).sendKeys("Gokul S");
		driver.findElement(By.id("join")).sendKeys(" in mimicry.");
		String value=driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(value);
		
		driver.findElement(By.id("clearMe")).clear();
		boolean edit=driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(edit);
		
		String readonly=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(readonly);
		
		//driver.quit();
	}

}
