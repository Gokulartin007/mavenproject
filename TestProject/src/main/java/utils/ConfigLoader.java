package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigLoader {

	
	public static String getProp(String key) throws Exception {
		// TODO Auto-generated method stub
				FileInputStream file= new FileInputStream("./src/main/java/utils/Config.properties");
				Properties prop= new Properties();
				
				prop.load(file);
				
				Boolean check=prop.contains("Gokulartin007@gmail.com");
				System.out.println(check);
				return prop.getProperty(key);
	}
}
