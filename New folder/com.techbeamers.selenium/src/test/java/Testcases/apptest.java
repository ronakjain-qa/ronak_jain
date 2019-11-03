package Testcases;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techbeamers.base.BaseTest;

public class apptest extends BaseTest{
	
	@BeforeTest
	public void Browsertest() {
		Openbrowser("Chrome");
		implicitwait();
	}
	/*@BeforeMethod
	public void waitforeachelement() {
		implicitwait();
		System.out.println("after method ");
	}*/

	@Test(priority=0)
	public void verifyURl() {
		OpenUrl("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login\\");
		implicitwait();
	}
   @Test(priority=1)
   public void verifytitle() {
	   verifyTitle("OrangeHRM");
	   implicitwait();
   }
   
   @Test(priority=2)
   
   public void verifyloginbuttonText() {
	   logbuttonText("LOGIN");
	   implicitwait();
   }
   @Test(priority=3)
   public void verifyloginheadingText() {
	   loginheadingText("LOGIN Panel");
	   implicitwait();
	   
   }
   @Test(priority=4)
   public void verifyforgotpasswordtext() {
	   forgotpasswordtext("Forgot your password?");
	   implicitwait();
   }
   
   @Test(priority=5)
   public void verifyforgotpassheadingtext(){
	   verifyforgotpasswordtext("Please enter your username to identify your account to reset your password");
	   implicitwait();
   }
   
   @Test(priority=6)
   public void verifyforgotpassusernamelabel() {
	   usernamelabelverify("OrangeHRM Username");
	   implicitwait();
   }
   
   @Test(priority=7)
   public void verifyresetpasswordbuttontext() {
	   resetpasswordbuttontextverify("Reset Password");
	   implicitwait();
   }
   @Test(priority=8)
   public void verifyloginwithvalidusername() {
	   verifyloginwithinvaliddetails("Invalid credentials");
	   implicitwait();
	 }
   
   @Test(priority=9)
   public void verifylogiwithvalidpassword() {
	   verifylogintestcase2("Invalid credentials");
	   implicitwait();
   }
   
   @Test(priority=10)
   public void verifyloginwithwrongusernameandpassword() {
	   verifylogintestcase3("Invalid credentials");
	   implicitwait();
   }
   
   @Test(priority=11)
   public void verifyloginwithblank() {
	   verifyloginwithblank("Username cannot be empty");
	   implicitwait();
   }
   @Test(priority=12)
   public void verifylogin() {
	   verifyloginwithvalid("http://127.0.0.1/orangehrm/symfony/web/index.php/dashboard");
   }
   @Test(priority=13)
   public void addadmin() throws InterruptedException {
	   adduser("Already exist","Passwords do not match","Save");
   }
   
   
  /* @AfterTest
   public void browserclose() {
	   driver.close();
   }*/
   
   
}
