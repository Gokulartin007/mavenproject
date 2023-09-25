package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99WindowHandles {


	public static void main(String[] args) throws InterruptedException {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		

		//Launching the site.				
		driver.get("http://demo.guru99.com/popup.php");			
		driver.manage().window().maximize();		

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			

		String MainWindow=driver.getWindowHandle();		

		// To handle all new opened window.				
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();	
		System.out.println(i1);

		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();		

			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			{    		

				// Switching to Child window
				driver.switchTo().window(ChildWindow);	                                                                                                           
				driver.findElement(By.name("emailid"))
				.sendKeys("gaurav.3n@gmail.com");                			

				driver.findElement(By.name("btnLogin")).click();			

				// Closing the Child Window.
				//driver.close();		
			}		
		}		

		List<String> list=new ArrayList<String>(s1);
		int count=0;
		for (String windows : list) {
			++count;
			System.out.println(count+" "+windows);
			
			

		}
		driver.switchTo().window(list.get(1));
		System.out.println("current window "+driver.getTitle());
		System.out.println("current Url "+driver.getCurrentUrl());
		
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
		System.out.println(MainWindow);
		//driver.quit();
	}
}


