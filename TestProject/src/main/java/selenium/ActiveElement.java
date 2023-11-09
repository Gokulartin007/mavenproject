package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {
	
	//active element is nthg but wen v enter into fb site in user name tab cursor will blink that is considered as active elemnt 
	//we can interact with active element without finding it just like switchTo().active element 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.switchTo().activeElement();
		ele.sendKeys("Gokulartin007@gmail.com",Keys.TAB,"465850071",Keys.ENTER);
		
		//will launch new chrome window(not tab) 
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		
		// Opens a new tab in existing window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");

	}

}
