package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite function");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite function");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
		}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("before test exceution");
	
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("Afer test exceution");
	}
	@Test(priority=0)
	public void login(){
	//throw new SkipException("Any reason");
	System.out.println("Login test exceution");
	}

	@Test(priority=1, dependsOnMethods= {"login"})
	public void dopasswordchange() {
		System.out.println("changing password");
	}
	
	@Test(priority=2, dependsOnMethods= {"login","dopasswordchange"})
	public void logout() {
		System.out.println("logging out");
		
		
		
		
	}
	
	
	
	
	
	
}
