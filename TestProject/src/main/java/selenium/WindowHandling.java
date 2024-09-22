package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://letcode.in/windows";
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("home")).click();
		String window =driver.getWindowHandle();
		System.out.println("Current window = "+window);

		Set<String> windows=driver.getWindowHandles();
		
		
		//will throw error change type from list to set
		//List<String> Listwind=driver.getWindowHandles();

		//for (String string : windows) { System.out.println(string); }
		
		Iterator<String> i1= windows.iterator ();
		int count=0;
		while(i1.hasNext()) {
			
			String child=i1.next();
			count++;
			System.out.println(child+" yes "+count);
		}
		
		
		
		
		System.out.println(windows);
		System.out.println("size of window ="+windows.size());
		
		
		//here we dont have get function in set so we are converting set to list 
		List<String> list= new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		System.err.println(list.get(1));
		boolean check =driver.findElement(By.xpath("//h1[.=' Practice and become pro in test automation']")).isDisplayed();
		System.out.println(check);
		driver.switchTo().window(list.get(0));
		driver.close();
		list.clear();
		Set<String> windows2= driver.getWindowHandles();
		list.addAll(windows2);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to(url);
		driver.findElement(By.id("multi")).click();
		list.clear();
		Set<String> multiWindow=driver.getWindowHandles();
		list.addAll(multiWindow);
		System.out.println(list.size());
		for (String string : multiWindow) {
			System.out.println(string); 
		}
		driver.close();
		
		
		

	}

}
