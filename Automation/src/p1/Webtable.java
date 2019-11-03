package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		int tablesize= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println(tablesize);
		String beforepath= "//*[@id='leftcontainer']/table/tbody/tr[";
		String afterpath= "]/td[";
		String endpath= "]";
		
		for(int i=2; i<=tablesize; i++) 
		{
			for(int j=1; j<=4; j++) {
			String actualpath= beforepath+i+afterpath+j+endpath;
			WebElement element= driver.findElement(By.xpath(actualpath));
			String values= element.getText();
			System.out.println(values);
			}
			System.out.println();	
		}
		
		
		
	}

}
