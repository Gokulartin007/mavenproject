package selenium;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("gokul",Keys.ENTER);
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,250)");
		
		
		//till the bottom it wil scroll
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		System.out.println("scrolled");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		String TP=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date());
		System.out.println(TP);

		//List<WebElement> li=driver.findElements(By.tagName("td"));
		
		
		
	}

}
