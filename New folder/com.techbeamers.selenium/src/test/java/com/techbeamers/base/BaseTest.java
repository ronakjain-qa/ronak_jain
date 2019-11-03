package com.techbeamers.base;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BaseTest{
	public WebDriver driver;
	
	public void Openbrowser(String btype)
	{
		if(btype.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();

		else if(btype.equals("Mozilla")){
		System.setProperty("webdriver.firefox.marionette","C:\\eclipse\\Drivers\\geckodriver.exe");	
		driver= new FirefoxDriver();	
		}
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}
	public void OpenUrl(String url) { 
		driver.get(url);
    }
	
	public void verifyTitle(String title)
	{
		String urltitle=driver.getTitle();	
		Assert.assertEquals(urltitle, title);
	}
	public void verifyloginheading(String headingtext) {
		String headingtitle= driver.findElement(By.id("logInPanelHeading")).getText();
		Assert.assertEquals(headingtitle, headingtext);
	}
	public void logbuttonText(String loginbuttontext) {
		String buttontext= driver.findElement(By.xpath("//*[@type='submit' or @id='btnLogin']")).getAttribute("value");
	    Assert.assertEquals(buttontext, loginbuttontext );
	}
	
	public void loginheadingText(String expheadingtext) {
		String logheadingtext= driver.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
		Assert.assertEquals(logheadingtext, expheadingtext);
	}
	
	public void forgotpasswordtext(String forgotpasswordtext) {
		String Passwordtext= driver.findElement(By.linkText("Forgot your password?")).getText();
		Assert.assertEquals(Passwordtext, forgotpasswordtext);
	    driver.findElement(By.linkText("Forgot your password?")).click();
	}

	public void verifyforgotpasswordtext(String pwdtext) {
		boolean headingmsg= driver.getPageSource().contains("Please enter your username to identify your account to reset your password");
		Assert.assertTrue(headingmsg, pwdtext);
	}
	
	public void usernamelabelverify(String labelname) {
		String hrm_username= driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/fieldset/ol/li/label")).getText();
		Assert.assertEquals(hrm_username, labelname);
	}
	
	public void resetpasswordbutton(String resetpasswordbuttontext) {
		boolean resetpasswordpresence= driver.findElement(By.id("btnSearchValues")).isDisplayed();
		boolean resetpasswordbutton	= driver.findElement(By.id("btnSearchValues")).isEnabled();
		Assert.assertEquals(resetpasswordpresence, resetpasswordbutton);
	}
	
	public void resetpasswordbuttontextverify(String resetpwdbuttonlabeltext) {
		String resetpassowrdlabel= driver.findElement(By.id("btnSearchValues")).getAttribute("value");
		Assert.assertEquals(resetpassowrdlabel, resetpwdbuttonlabeltext);
		driver.findElement(By.id("securityAuthentication_userName")).sendKeys("6ronakkjain9@gmail.com");
		driver.findElement(By.id("btnSearchValues")).click();
		boolean cancelbuttonvisible= driver.findElement(By.id("btnCancel")).isDisplayed();
		Assert.assertTrue(cancelbuttonvisible);
		driver.findElement(By.id("btnCancel")).click();
	}
	
	public void verifyloginwithinvaliddetails(String expvalidationmsg){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Testhrm1234");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidationmsg= driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualvalidationmsg, expvalidationmsg);
	}
	
	public void verifylogintestcase2(String expvalidationmsg){
		driver.findElement(By.id("txtUsername")).sendKeys("Adminn");
		driver.findElement(By.id("txtPassword")).sendKeys("Testhrm123");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidationmsg= driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualvalidationmsg, expvalidationmsg);
	}
	
	public void verifylogintestcase3(String expvalidationmsg){
		driver.findElement(By.id("txtUsername")).sendKeys("Adminn");
		driver.findElement(By.id("txtPassword")).sendKeys("Testhrm1234");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidationmsg= driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualvalidationmsg, expvalidationmsg);
	}
	public void verifyloginwithblank(String expvalidationmsg){
		driver.findElement(By.id("txtUsername")).sendKeys("");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		String actualvalidationmsg= driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualvalidationmsg, expvalidationmsg);
	}
	public void verifyloginwithvalid(String expectedurl) {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Testhrm123");
		driver.findElement(By.id("btnLogin")).click();
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl, expectedurl);
	}
	public void adduser(String usernameerror, String confirmpswderror, String expectedsavebuttontext) throws InterruptedException {
		Actions actions= new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).perform();
		actions.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).perform();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		driver.findElement(By.id("btnAdd")).click();
		Select obj1= new Select(driver.findElement(By.id("systemUser_userType")));
		obj1.selectByVisibleText("Admin");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Ronak Jain");
		driver.findElement(By.id("systemUser_userName")).sendKeys("testing automation");
		Thread.sleep(4000);
		String username_error=driver.findElement(By.xpath("//*[@id=\"frmSystemUser\"]/fieldset/ol/li[3]/span")).getText();
		//boolean username_error=driver.getPageSource().contains("Already exists");
		Assert.assertEquals(username_error, usernameerror);
		Select obj2= new Select(driver.findElement(By.id("systemUser_status")));
		obj2.selectByValue("1");
	    driver.findElement(By.id("systemUser_password")).sendKeys("test123456");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("test123456");
	    boolean errormessage= driver.getPageSource().contains("Passwords do not match");
	    Assert.assertTrue(errormessage, confirmpswderror);
	    String savebuttontext= driver.findElement(By.xpath("//*[@id='btnSave']")).getAttribute("value");
	    Assert.assertEquals(savebuttontext, expectedsavebuttontext);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@class='addbutton']")).click();
	}
	
	
}
