package p1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js ;
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		/*WebElement element =driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span"));

				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", element);*/
		/*driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();*/
		driver.findElement(By.name("proceed")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
