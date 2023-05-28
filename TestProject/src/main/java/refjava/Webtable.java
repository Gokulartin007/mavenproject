package refjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		String url="https://www.techlistic.com/p/demo-selenium-practice.html";
		driver.get(url);
		WebElement table =driver.findElement(By.className("tsc_table_s13"));
		//System.out.println(table.isDisplayed());
		List<WebElement> rows=table.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		for(int i=0;i<rows.size();i++) {
			//System.out.println(rows.get(i).getText());
			List<WebElement> column=rows.get(i).findElements(By.tagName("td"));
			String fColumn=column.get(1).getText();
			System.out.println(fColumn);
		}


	}

}
