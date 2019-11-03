package p1;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String baseUrl="http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login";
		driver.get(baseUrl);
	//test Url
		String expectedUrl= "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login";
		String actualUrl= driver.getCurrentUrl();
		//Assert.assertEquals(actualUrl,"https://opensource-demo.orangehrmlive.com/");
		 if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			 System.out.println("Test case passed"+" "+ "URL verified");
		 }
		 else {
			 System.out.println("Test case Failed: "+" "+ "Please enter the correct Url");
		 }
	 //@test title
		String expectedtitle="OrangeHRM";
		String actualtitle;
		driver.get(baseUrl);
		actualtitle=driver.getTitle();
				
		if(actualtitle.equals(expectedtitle))
		{
		 System.out.println("Test case passed:"+" "+"Title: "+ actualtitle +" is verified");
		}
		else {
			 System.out.println("Test case Failed:"+" "+"Title is not matching");
			}
	//@test Login heading
		String actualheading= driver.findElement(By.id("logInPanelHeading")).getText();
		String expectedheading="LOGIN Panel";
		
		if(actualheading.equals(expectedheading)) {
			System.out.println("Test case passed: login heading text:"+ expectedheading +" is verified ");
		}
		else {
			System.out.println("Test case Failed: Please check the login heading ");
		}
		
	//@test link text on Forgot password
		String expectedlinktext ="Forgot your password?";
		String actuallinktext =driver.findElement(By.linkText("Forgot your password?")).getText();
		
		if(actuallinktext.equals(expectedlinktext))
		{
			driver.findElement(By.linkText("Forgot your password?")).click();
			System.out.println("Test case passed: link text is verified");
		}
		else
		{
			System.out.println("Test case failed: Please check the link text");
		}
	//@test forgot password heading  	
		String actualheadingFp= driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1")).getText();
		String expectedheadingFp="Forgot Your Password?";
		
		if(actualheadingFp.equals(expectedheadingFp)) {
			System.out.println("Test case passed: login heading text:"+ expectedheadingFp +" is verified ");
		}
		else {
			System.out.println("Test case Failed: Please check the Forgot password heading ");
		}
	//@test username label
		String actuallabel= driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/fieldset/ol/li/label")).getText();
		String expectedlabel="OrangeHRM Username";
		
		if(actuallabel.equals(expectedlabel))
		{
			System.out.println("Test case passed: Username label is verified");			
		}
		else{
			System.out.println("Test case failed: Please check the text of label");
		}
	//@test reset password button displayed
		boolean resetbuttonpresence= driver.findElement(By.id("btnSearchValues")).isDisplayed();
		boolean resetbuttonenabled=driver.findElement(By.id("btnSearchValues")).isEnabled();
		boolean actualtextcontent= driver.getPageSource().contains("Please enter your username to identify your account to reset your password.");
		
		if(resetbuttonpresence==true && resetbuttonenabled==true) {
			if(actualtextcontent==true) {
			
			driver.findElement(By.id("btnSearchValues")).click();
			System.out.println("Test case passed: Reset button is displayed and enabled and Text Info Message is verified");
			}
		}
		else {
			System.out.println("Test case failed: Please check the presence and button enablility");
		}
		
		//@test cancel button present and enable or not
		
		boolean cancelbuttonpresence= driver.findElement(By.id("btnCancel")).isDisplayed();
		boolean cancelbuttonenabled= driver.findElement(By.id("btnCancel")).isEnabled();
		if(cancelbuttonpresence==true && cancelbuttonenabled){
			
			driver.findElement(By.id("btnCancel")).click();
			System.out.println("Test case passed: Cancel button is present and enabled");
		}
		else {
			
		  System.out.println("Test case failed: Please check cancel button is present and enabled or not");	
		}
	//test login with invalid username and valid password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
		driver.findElement(By.id("txtPassword")).sendKeys("Testhrm123");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidatemsg= driver.findElement(By.id("spanMessage")).getText();
		String expectvalidatemsg= "Invalid credentials";
		if(actualvalidatemsg.equals(expectvalidatemsg)){
			System.out.println("Test case passed: Validation msg is correct");
		}
		else {
			System.out.println("Test case Failed: Please check the credentials");
		}
	//test login with valid username and invalid password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidatemsg1= driver.findElement(By.id("spanMessage")).getText();
		String expectvalidatemsg1= "Invalid credentials";
		if(actualvalidatemsg1.equals(expectvalidatemsg1)){
			System.out.println("Test case passed: Validation msg is correct");
		}
		else {
			System.out.println("Test case Failed: Please check the credentials");
		}
		
	//test login with blank username and blank password	
		
		driver.findElement(By.id("txtUsername")).sendKeys("");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidatemsg2= driver.findElement(By.id("spanMessage")).getText();
		String expectvalidatemsg2= "Username cannot be empty";
		if(actualvalidatemsg2.equals(expectvalidatemsg2)){
			System.out.println("Test case passed: Validation msg is correct");
		}
		
		else {
			System.out.println("Test case Failed: Please check the credentials");
		}
		
		//test login button enabled or present			
		boolean loginbuttonpresence= driver.findElement(By.id("btnLogin")).isDisplayed();
		boolean loginbuttonenabled= driver.findElement(By.id("btnLogin")).isEnabled();
		String loginbuttontext= driver.findElement(By.id("btnLogin")).getAttribute("value");
		String expectloginbuttontext="LOGIN";
		String expectnavUrl = "http://127.0.0.1/orangehrm/symfony/web/index.php/dashboard ";
		String actualnavUrl;
						
		if(loginbuttonpresence==true && loginbuttonenabled== true)
		{
			if(loginbuttontext.equals(expectloginbuttontext))
			{
					System.out.println("login text verified");			 
					driver.findElement(By.id("txtUsername")).sendKeys("Admin");
					driver.findElement(By.id("txtPassword")).sendKeys("Testhrm123");
					driver.findElement(By.id("btnLogin")).click(); 
					actualnavUrl=driver.getCurrentUrl();
					if(expectnavUrl.equals(actualnavUrl))
					{
						System.out.println("Test case passed: Login button is present and enabled");
					}
					
			}
		}
			       
	    else
	     {			
			System.out.println("Test case Failed: Login button is not present or enabled");
	     }
		 
		
		String navigateurl ="http://127.0.0.1/orangehrm/symfony/web/index.php/dashboard";
		String navurl= driver.getCurrentUrl();
				
		for(int i=0; i<=5; i++) {
			Thread.sleep(3500);
			if(navigateurl.equals(navurl)) {
			System.out.println("Test case Passed :Navigate url verified ");
			Actions actions= new Actions(driver);
		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")));
			actions.perform();
			Thread.sleep(2500);
			
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")));
			actions.perform();
				 
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")));
			actions.perform();
			
			driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
			driver.findElement(By.id("btnAdd")).click();
			Select obj= new Select(driver.findElement(By.id("systemUser_userType")));
			obj.selectByValue("1");
			
			//String uuid = UUID.randomUUID().toString();
			Random RandomStringUtils = new Random();
			String s = RandomStringUtils.toString();
			
			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Ronak Jain");
			driver.findElement(By.id("systemUser_userName")).sendKeys(s);
		    Select obj1 = new Select(driver.findElement(By.id("systemUser_status")));
			obj1.selectByValue("1");
			
			driver.findElement(By.id("systemUser_password")).sendKeys("ronak123");
			driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("ronak123");
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(2500);	
			
			}
			       	
	    }
		
		
		
		
	}
}
		
		
	/*	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("btnLogin")).*/
		
				
		

 
		
		
		
		
		
		
		
		
		
		
			
		
	



