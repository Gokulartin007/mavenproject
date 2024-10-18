  package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://letcode.in/table";
		driver.get(url);		
		
		WebElement FTable=driver.findElement(By.id("simpletable"));
		List<WebElement> hearder= FTable.findElements(By.tagName("th"));
		
		for (WebElement header : hearder) {
			System.out.println(header.getText());
			
			
		}
		
		List<WebElement> allRows=FTable.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		int size=allRows.size();
		
		
		System.out.println(size);
		for (WebElement webElement : allRows) {
			List<WebElement> column=webElement.findElements(By.tagName("td"));
			WebElement Fdata=column.get(0);
			System.out.println("fdata "+Fdata.getText());
			
		}
		
		for (int i = 0; i < size; i++) {
			List<WebElement> column=allRows.get(i).findElements(By.tagName("td"));
			WebElement lName=column.get(1);
			/*
			 * int val=1; WebElement lName=column.get(val);
			 */
			String text=lName.getText();
			if(text.equals("Man")) {
				WebElement val=column.get(3).findElement(By.tagName("input"));
				boolean dummy1=val.isSelected();
				System.out.println(dummy1);
				val.click();
				boolean dummy=val.isSelected();
				System.out.println(dummy);
				break;
			}
			
			
			
		}
		
		
	}

}
