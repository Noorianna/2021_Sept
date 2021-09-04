package files;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("Global1.properties");
		
		Properties prop = new Properties();
		prop.load(in);
		
		System.out.println("URL->" + prop.getProperty("URL"));
		System.out.println("username->" + prop.getProperty("username"));
		System.out.println("password->" + prop.getProperty("password"));
		System.out.println("name->" + prop.getProperty("name"));
		
		in.close();
	}

}
