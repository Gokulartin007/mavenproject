package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://play.letcode.in/checkbox");
		driver.manage().window().maximize();


		//implicit wait must be there for all the cases especially for find elements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//(not working)    List<WebElement> checked =driver.findElements(By.className("form-label-group"));
		List<WebElement> checked =driver.findElements(By.tagName("input"));
		//List<WebElement> checked =driver.findElements(By.xpath("//div[@class='checkbox']"));


		for (WebElement webElement : checked) {
			System.out.println(webElement.getText());
			if(webElement.isSelected()) {
				System.out.println("checked already");
				System.out.println(webElement.getText());
			}
			else {
				webElement.click();
			}
		}

		
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("gokul",Keys.ENTER);
		  List<WebElement> cricket =driver.findElements(By.xpath("//*[contains(text(),'gokul') or contains(text(),'Gokul')]"));
		  System.out.println(cricket.size());
		  
		  driver.quit();
		 
	}

}
