package p1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("https://www.rediff.com/");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
		WebElement dropdown= driver.findElement(By.id("searchLanguage"));
		Select select= new Select(dropdown);
		select.selectByValue("cs");
		select.selectByIndex(2);
		Thread.sleep(5000);
		select.selectByVisibleText("English");
		List<WebElement> values= driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		System.out.println(values.get(7).getText());
		/*for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i).getText());
		}*/
		
		//driver.findElements(By.tagName("option"));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links on the page are"+links.size());
		
		   for(WebElement link : links) {
			
			System.out.println(link.getText()+"-----URL is"+link.getAttribute("href"));
		}
		
	    driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
	}	

	}



