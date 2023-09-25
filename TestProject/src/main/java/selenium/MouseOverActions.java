package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class MouseOverActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = WebDriverManager.chromedriver().create();
		String URL = "https://www.flipkart.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[.='✕']")).click();
		// WebElement ele=driver.findElement(By.xpath("//div[.='Fashion']"));
		WebElement ele = driver.findElement(By.linkText("iPhone 13 Pro Max"));
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].scrollIntoView();", ele);
		 */
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).build().perform();
		builder.doubleClick(ele).perform();

		/*
		 * to double click WebElement
		 * dc=driver.findElement(By.xpath("//span[.='Plus']"));
		 * 
		 * builder.moveToElement(dc).doubleClick().build().perform();
		 */

		Thread.sleep(3000);
		driver.findElement(By.linkText("Men's T-Shirts")).click();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		/*
		 * SoftAssert SAssert= new SoftAssert(); SAssert.assertEquals(54, 5);
		 */
		Assert.assertNotEquals(URL, currenturl);
		if (currenturl.contains("flipkart")) {
			System.out.println("it contains");
		} else
			System.out.println("not contains");

	}

}
