package testngPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {
	
	//active element is nthg but wen v enter into fb site in user name tab cursor will blink that is considered as active elemnt 
	//we can interact with active element without finding it just like switchTo().active element 
	@Test
	public  void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele=driver.switchTo().activeElement();
		ele.sendKeys("Gokulartin007@gmail.com",Keys.TAB,"4658500711",Keys.ENTER);
		//driver.quit();
	}

}
