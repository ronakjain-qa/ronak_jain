package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testresizeable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//JavascriptExecutor js ;
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement dragable= driver.findElement(By.id("draggable"));
		WebElement droppable= driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragable, droppable).perform();
		
		/*WebElement resizeable= driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(resizeable, 300, 300).perform();*/
		

	}

}