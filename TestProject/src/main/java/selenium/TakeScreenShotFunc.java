package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotFunc {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1= new ChromeDriver();
		String URL="https://letcode.in/buttons";
		driver1.get(URL);
		driver1.manage().window().maximize();

		//for chromedriver  v can use this method 
		File scr=driver.getScreenshotAs(OutputType.FILE); 
		File Dest=new File("./DataFolder/gokul.png"); 
		FileHandler.copy(scr,Dest);


		//for Webdriver  v can use this method because for webdriver direct getscreenshot function not available
		//so declaring takescreenshot and getting 
		TakesScreenshot screen= (TakesScreenshot)driver1;
		File dscr =screen.getScreenshotAs(OutputType.FILE);
		File DriverDest=new File("./DataFolder/gokul2.png");
		FileHandler.copy(dscr, DriverDest);
		
		File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dc=new File("path");
		FileHandler.copy(sc, dc);


		//for specific object 
		WebElement ele= driver1.findElement(By.id("color"));
		File elescr=ele.getScreenshotAs(OutputType.FILE);
		File eleDest=new File("./DataFolder/gokul3.png");
		FileHandler.copy(elescr, eleDest);

		//to take some portion 
		WebElement portion =driver1.findElement(By.xpath("//div[@class='column is-7-desktop is-8-tablet']"));
		File Psrc=portion.getScreenshotAs(OutputType.FILE);
		File Pdest=new File("./DataFolder/gokul4.png");
		FileHandler.copy(Psrc, Pdest);



		driver1.quit();

	}

}
