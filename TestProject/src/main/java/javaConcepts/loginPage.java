package javaConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AutomationCoding.automationSource;
import io.github.bonigarcia.wdm.WebDriverManager;



public class loginPage {
	
	
	@DataProvider(name="Logindata")
	public String[][] loginData(){
		String data[][]=new String[2][2];
		data[0][0]="gokulartin007@gmail.com";
		data[0][1]="465850071";
		
		data[1][0]="gokulartin007@gmail.com";
		data[1][1]="465850071";
		return data;
		
	}

	@Test(dataProvider = "Logindata")
	public void login(String Email,String Pass) throws IOException, AWTException, InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().create();
		WebDriver driver=new ChromeDriver();
		String URL ="https://en-gb.facebook.com/";
		driver.get(URL);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement email=driver.findElement(By.id("email"));
		email.click();
		driver.findElement(By.id("email")).sendKeys(Email);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
	
		/*to press and hold control key and click action on mouse 
		 * Actions act=new Actions(driver);
		 * act.keyDown(Keys.CONTROL).click(email).perform ();
		 */
		boolean sts=driver.findElement(By.xpath("//input[@type='password']")).isDisplayed();
		System.out.println("displayed "+sts);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pass);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();


		//robot.keyPress(KeyEvent.VK_ESCAPE);

		/*
		 * Alert alert =driver.switchTo().alert();
		 * String pop=alert.getText();
		 * System.out.println(pop);
		 */


		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.)
		 */

		System.out.println("dropdown");

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */
		Thread.sleep(30);

		try { 
			driver.switchTo().alert().accept(); 
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}


		WebElement logout=driver.findElement(By.xpath("//span[text()='Log Out']"));
		logout.click();

		automationSource obj= new automationSource();
		obj.screenshot();
		System.out.println("screenShot");
		driver.quit();




	}

}
