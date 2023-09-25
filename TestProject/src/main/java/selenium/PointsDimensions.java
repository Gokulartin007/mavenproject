package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PointsDimensions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL="https://letcode.in/buttons";
		driver.get(URL);
		driver.manage().window().maximize();
		//to get x and y coordinates
		WebElement ele =driver.findElement(By.id("position"));
		Point point =ele.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		
		String color=driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("color = "+color);
		//to get height and width of the element
		Dimension dim= driver.findElement(By.id("property")).getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		//to get height and width of the element 
		Rectangle dimz= driver.findElement(By.id("property")).getRect();
		
		System.out.println(dimz.getHeight());
		System.out.println(dimz.getWidth());
		
		boolean btn=driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(btn);
		String tagnname=driver.findElement(By.id("isDisabled")).getTagName();
		System.out.println(tagnname);
		driver.quit();
		
		
	}

}
