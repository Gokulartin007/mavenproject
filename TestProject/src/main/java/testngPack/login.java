package testngPack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DataUtils;

public class login {
	
	@DataProvider(name="login")
	public String[][] LoginData() {
		String[][] data=new String[2][2];
		data[0][0]="Gokulartin007@gmail.com";
		data[0][1]="465850071";
		data[1][0]="Gokulartin007@gmail.com";
		data[1][1]="4658500711";
		return data;
	}
	
	

	//@Test(dataProvider = "login" )
	@Test(dataProvider = "excelLogin" ,dataProviderClass=DataUtils.class) // to call from different class or package we need to mention the class name
	public void main(String data[]) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele=driver.switchTo().activeElement();
		ele.sendKeys(data[0] ,Keys.TAB,data[1],Keys.ENTER);
	}

}
