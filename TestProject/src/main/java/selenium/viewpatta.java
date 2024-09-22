package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class viewpatta {
	
	//active element is nthg but wen v enter into fb site in user name tab cursor will blink that is considered as active elemnt 
	//we can interact with active element without finding it just like switchTo().active element 

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://eservices.tn.gov.in/eservicesnew/index.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='close']")).click();
		//driver.findElement(By.xpath("//a[@href='home.html' and text()='English']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'View Patta / Chitta')]")).click();
		Select se=new Select(driver.findElement(By.id("districtCode")));
		se.selectByValue("01");
		Select talk=new Select(driver.findElement(By.id("talukCode")));
		talk.selectByValue("07");
		Select village=new Select(driver.findElement(By.id("villageCode")));
		village.selectByValue("090");
		driver.findElement(By.xpath("//input[@value='sur']")).click();
		driver.findElement(By.xpath("surveyNo")).sendKeys("9");
		
		Select sub=new Select(driver.findElement(By.id("subdivNo")));
		sub.selectByValue("1A1A1");
		
	}

}
