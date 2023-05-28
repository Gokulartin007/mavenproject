package refjava;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AutomationCoding.automationSource;


public class automation {

		//public static void main(String[] args) throws InterruptedException {
		//for TestNG we should use Static and (String[] args)
	
		@Test
		public void main() throws IOException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Selenium Training') and @class='menu-text']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement check= driver.findElement(By.xpath("(//span[text()='ABOUT'])[1]"));
		
		if(check.isDisplayed()) {
			
			automationSource sc = new automationSource();
			sc.screenshot();
			
			System.out.println("displayed and element present");
		}
		else {
			System.err.println("not displayed");
		}
				
		driver.quit();
	}

	
}
