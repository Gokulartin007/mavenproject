package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertFunc {

	// if something pop up like alert try to inspect that if we couldn't inspect
	// that then its an alert..else not an alert
	// sometime in UI sweet alert present that is not an actual alert we can inspect
	// that continue performing actions

	public static void main(String[] args) throws IOException, InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "https://letcode.in/alert";
		driver.get(URL);
		driver.manage().window().maximize();

		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		// we can't take screen shots as wen alerts opens, the Dom get freezed so no
		// operation can be done until alert is handled
				
		TakesScreenshot alertsc = ((TakesScreenshot) driver);
		File scr = alertsc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./DataFolder/sam.png");
		FileHandler.copy(scr, dest);


		Thread.sleep(1000);
		File scr1 = alertsc.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./DataFolder/sam1.png");
		FileHandler.copy(scr1, dest1);
		WebElement clic = driver.findElement(By.id("confirm"));
		clic.click();

		alert.dismiss();

		driver.findElement(By.id("prompt")).click();
		alert.sendKeys("gokul");
		alert.accept();

		String name = driver.findElement(By.id("myName")).getText();
		System.out.println(name);

		// driver.quit();

	}

}
