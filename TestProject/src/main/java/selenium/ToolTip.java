package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import AutomationCoding.automationSource;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='logo']/a"));
				Actions builder= new Actions(driver);
				builder.moveToElement(ele).perform();
				automationSource ss=new automationSource();
				automationSource.screenshot();
				Thread.sleep(3000);
				String tool=ele.getAttribute("title");
				System.out.println(tool);
	}

}
