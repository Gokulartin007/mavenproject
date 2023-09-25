package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	//bootStrap is another select
	//actually its not an select, normally  
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement fruits=driver.findElement(By.id("fruits"));
		Select myfruits=new Select(fruits);
		myfruits.selectByIndex(1);
		WebElement selected=myfruits.getFirstSelectedOption();
		System.out.println(selected.getText());

		Select heros=new Select(driver.findElement(By.id("superheros")));
		boolean myheros=heros.isMultiple();
		if(myheros==true) {
			System.out.println("multiple");
			heros.selectByValue("am");
			heros.selectByVisibleText("Aquaman");
			List<WebElement> selectedOptions= heros.getAllSelectedOptions();
			for (WebElement webElement : selectedOptions) {
				System.out.println(webElement.getText());
			}
			
			selectedOptions.forEach(i->System.out.println(i.getText()));
		}
		
		heros.deselectByIndex(0);

		WebElement country=driver.findElement(By.id("country"));
		Select MyCountry= new Select(country);
		MyCountry.selectByValue("India");
		System.out.println(MyCountry.getOptions());
		System.out.println(MyCountry.getFirstSelectedOption().getText());
		
		
		driver.quit();

	}

}
