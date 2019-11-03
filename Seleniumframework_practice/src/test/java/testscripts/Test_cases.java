package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Filereader;

public class Test_cases {

	WebDriver driver;
	
	@BeforeTest
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Filereader orreader= new Filereader();
		//String mainurl= orreader.getAppUrl();
		//System.out.println(mainurl);

	}

	@Test(priority=0)
	public void navigatetomainurl() throws Exception{
		Filereader orreader= new Filereader();
		driver.get(orreader.getAppUrl());

	}

	@Test(priority=1)
	public void LoginintoApp() throws IOException {
		Filereader orreader= new Filereader();
		driver.findElement(By.xpath(orreader.getusername())).sendKeys("admin");
		driver.findElement(By.xpath(orreader.getpassword())).sendKeys("123456");
		driver.findElement(By.xpath(orreader.dologin())).click();

	}

}
