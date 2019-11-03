package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameshandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(3000);
		int frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Allframes --" + frames);

		/*for (int i = 0; i < frames; i++) {
			driver.switchTo().frame(i);
			int totalelem = driver.findElements(By.xpath("//input[@type='text']")).size();
			System.out.println(totalelem);

			if (totalelem == 0) {

				driver.switchTo().defaultContent();
			} else

				break;

		}*/
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test123");
	//	driver.switchTo().defaultContent();
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//*[@id=\"a\"]")).click();
		driver.switchTo().defaultContent();

	}

}
