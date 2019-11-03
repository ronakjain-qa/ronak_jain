package com.techbeamers.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonLibrary {
	WebDriver driver;
	
	public void FindElementByid(String uniqueid) {
		
		driver.findElement(By.id(uniqueid));
		
		
	}

}
