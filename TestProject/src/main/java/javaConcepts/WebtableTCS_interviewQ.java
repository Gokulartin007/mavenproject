package javaConcepts;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableTCS_interviewQ {
	
	@Test
	public void banks() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> rows=table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		//List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("total no of rows "+rows.size());
		
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
			WebElement Bname=columns.get(0);
			String bank=Bname.getText();
			if(bank.contains("IDFC Bank")) {
			String price=columns.get(3).getText();
				System.out.println("market price of "+bank+" is "+price);
			}else
				throw new ElementNotInteractableException("Chennai Petro.");
		}
		//driver.quit();
	} 
	
	

	

}
