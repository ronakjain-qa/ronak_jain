package scripts;

import org.testng.annotations.Test;

import common_library.Common_functions;
import config.StartBrowser;
import object_respository.LoginPage;

public class Test01 extends StartBrowser {
	
  @Test
  public void testlogin() {
	  
	  Common_functions driver= new Common_functions();
		
	  driver.NavigateToApp("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
	  driver.type(LoginPage.usernametxt, "Admin");
	  driver.type(LoginPage.passwordtxt, "Testhrm123");
	  driver.click(LoginPage.buttonlogin);
	  
	  
	  
  }
}
