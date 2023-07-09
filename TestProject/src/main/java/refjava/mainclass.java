package refjava;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import testpro.usercred;

public class mainclass {

	
	public static void main(String[] args) {
		//while creating object for extended class we can access all interface implemented methods and extended class methods as well 
		Implement_sampleinterface drive= new Implement_sampleinterface();
		
		drive.div(0, 0);
		
		//while creating reference object for interface we can only access interface implemented methods 
		sample_Interface driv=new Implement_sampleinterface();
		drive.add(0, 0);
		//mainclass mc= new Implement_sampleinterface(); complime time error 

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement search=driver.findElement(By.name("q"));
		String ss=search.getTagName();
		System.out.println(ss);
		System.err.println(search.getCssValue("background-color"));
		Dimension dm=search.getSize();
		System.out.println(dm.getHeight());
		System.out.println(dm.getWidth());
		System.out.println(dm.height);
		System.out.println(dm.width);
		
		Point point= search.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		System.out.println(point.x);;
		System.out.println(point.y);
		
		usercred.username.getname();
		
		Select se=new Select(search);
		search.sendKeys("yenda mimicry", Keys.ENTER);
		
		
		
		
		driver.quit();
	}
	
}
