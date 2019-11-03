package common_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.StartBrowser;

public class Common_functions {
     WebDriver driver;
 
      public Common_functions() 
      {
	 	 driver= StartBrowser.driver;
      }
     
      public void NavigateToApp(String url) {
    	  driver.get(url);
    	  
      }
      
      public void click(By locator)
      {
    	 driver.findElement(locator).click();
      }
      
      public void type(By locator, String Txt) {
    	  driver.findElement(locator).sendKeys(Txt);
      }
      
     
  
}
