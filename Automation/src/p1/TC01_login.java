package p1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_login {

	public void verifyurl(){
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		String expectedUrl= "https://opensource-demo.orangehrmlive.com/";
		String actualUrl= driver.getCurrentUrl();
		
		 if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			 System.out.println("Test case passed"+" "+ "URL verified");
		 }
		 else {
			 System.out.println("Test case Failed: "+" "+ "Please enter the correct Url");
		 }
	}
		public void verifytitle() {
			
			String expectedtitle="OrangeHRM";
			String actualtitle;
			
			
			
		}
	}


