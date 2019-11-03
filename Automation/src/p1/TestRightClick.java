package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//JavascriptExecutor js ;
		driver.get("https://jqueryui.com/droppable/");

	}

}
