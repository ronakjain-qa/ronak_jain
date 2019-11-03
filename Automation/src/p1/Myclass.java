package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("VM technocrats");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		//System.setProperty("webdriver.firefox.marionette","C:\\eclipse\\Drivers\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");  
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click(); 
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		Select userrole= new Select(driver.findElement(By.id("systemUser_userType")));
		userrole.selectByVisibleText("Admin");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("John Smith");
		driver.findElement(By.id("systemUser_userName")).sendKeys("Test132");
		Select status= new Select(driver.findElement(By.id("systemUser_status")));
		status.selectByVisibleText("Enabled");
		driver.findElement(By.id("systemUser_password")).sendKeys("admin123");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.name("chkSelectRow[]")).isSelected()){
		   System.out.println("Option 1st default checked ");
		}
		else{
			driver.findElement(By.name("chkSelectRow[]")).click();
			System.out.println("Default checked not found");
			}
		driver.findElement(By.id("btnDelete")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("dialogDeleteBtn")).click();
				
		//driver.quit();
		//driver.close();
	}

}
