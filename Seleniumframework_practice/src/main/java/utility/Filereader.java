package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Filereader {

	Properties pro;

	public Filereader() throws IOException {

		
			File filepath = new File("C:\\Users\\RONAK\\eclipse-workspace\\Seleniumframework_practice\\src\\main\\java\\config");
			FileInputStream fis = new FileInputStream(filepath);
			pro = new Properties();
			pro.load(fis);

		} 
	
	

	public String getAppUrl() {

		return pro.getProperty("ApplicationUrl");
	}

	public String getusername() {
		return pro.getProperty("weblementlocatorusername");
	}

	public String getpassword() {
		return pro.getProperty("weblementlocatorpassword");
	}

	public String dologin() {
		return pro.getProperty("loginbuttonlocator");
	}
}
