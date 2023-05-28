package AutomationCoding;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class automationSource {

	public static void screenshot() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File scr =scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\gokul.s05\\Desktop\\java\\"+timestamp+".png");
		//Copy file at destination
		FileHandler.copy(scr, DestFile);
		
		String TP=new SimpleDateFormat("yy_MM_DD:hh:mm:ss").format(new Date());
		System.out.println(TP);
	}
}
