package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitAndFluentWait {
	@Test
	public  void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL ="https://letcode.in/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter registered email']")).sendKeys("gokulartin007@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("465850071");
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='LOGIN']"));
		loginBtn.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//h1[contains(text(),'LetCode with Koushik')]")).isDisplayed();
		System.out.println("login successful");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait

		WebElement singout=driver.findElement(By.linkText("Sign out"));
		WebElement toast=driver.findElement(By.xpath("//div[@role='alertdialog']"));
		System.out.println(toast.getText());
		
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(toast));
		singout.click();
		System.out.println("logout");



		//for fluent wait we should always import selenium package
		Wait<WebDriver> Fwait=new FluentWait<WebDriver>(driver)
				//.withTimeout(30, TimeUnit.SECONDS) it is deprecated
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(4)).
				ignoring(NoSuchElementException.class);// always import selenium package else it wont work

		WebElement login=Fwait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.linkText("Log in"));
			}
		});
		System.out.println("login displayed? "+login.isDisplayed());


		driver.quit();

	}

}
