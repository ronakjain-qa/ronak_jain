package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertManagement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("ronakjain");
		driver.findElement(By.name("proceed")).click();
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	//	al.dismiss();
		
		

	}

}