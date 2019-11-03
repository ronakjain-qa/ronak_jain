package com.techbeamers.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Openbrowsertest {
	WebDriver driver;
	@Test
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		System.out.println("Opening browser and get the url");
	}
	
	

}
