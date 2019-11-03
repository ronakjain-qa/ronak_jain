package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingactionevents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://americangolf.co.uk");
		Actions action = new Actions(driver);
		WebElement elementmove=driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[2]/a"));
		action.moveToElement(elementmove).build().perform();
		//WebDriverWait wait= new WebDriverWait(driver, 5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='name'and text()='Left Handed Golf Clubs']")).click();
		//action.moveToElement(movelement).build().perform();
		

	}

}
