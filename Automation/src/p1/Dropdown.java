package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);*/

		// Find all links
	/*	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int alllinkscount = alllinks.size();
		System.out.println(alllinkscount);
		for (int i = 0; i < alllinkscount; i++) {
			String linksall = alllinks.get(i).getText();
			System.out.println(linksall);*/

			// Find all the values from the drop down
			/*
			 * WebElement ddelement=
			 * driver.findElement(By.xpath("//select[@name='country']")); Select dropdown =
			 * new Select(ddelement); List<WebElement> ddvalues= dropdown.getOptions(); int
			 * count = ddvalues.size(); System.out.println(count); for(int i=0; i<count;
			 * i++) { String allcountrynames= ddvalues.get(i).getText();
			 * System.out.println(allcountrynames); }
			 */
		String str= "The Journey Seems Tough";
		int str1= str.length();
		//String str2= str.toUpperCase();
		for (int i=str1-1; i>0; i--) {
			char str3= str.charAt(i);
			System.out.print(str3);
		}
		
		Xls_Reader reader = new Xls_Reader();
		}
	}

