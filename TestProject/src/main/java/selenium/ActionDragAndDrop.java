package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Gokul drag and drop will work within the frames, we cannot drag a
 *         object from one frame and drop into another frame
 */
public class ActionDragAndDrop {
	
	static int a;
	public static void main(String[] args) {
		
		int b = 0;
		System.out.println(a);
		System.out.println(b);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		// object creating actions class
		Actions builder = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		// after getting source and target using drag and drop option
		builder.dragAndDrop(drag, drop).perform();
		System.out.println("drag and drop succesful");

		// navigating to another site
		driver.navigate().to("https://jqueryui.com/draggable/");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// draggable item in frame so using frame
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));             

		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();

		// just another way start
		Point z = ele.getLocation();
		System.out.println(z.getX());
		// just another way end

		System.out.println(x);
		System.out.println(y);

		builder.dragAndDropBy(ele, x + 45, y + 65).perform();

		System.out.println("drag and drop by succesful");

		// right click option in mouse(contextClick)
		driver.navigate().to("https://play.letcode.in/contextmenu");

		WebElement elem = driver.findElement(By.className("mat-list-item-content"));
		// for right click
		builder.contextClick(elem).perform();
		driver.findElement(By.xpath("//button[.='Click me']")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		driver.quit();

	}

}
