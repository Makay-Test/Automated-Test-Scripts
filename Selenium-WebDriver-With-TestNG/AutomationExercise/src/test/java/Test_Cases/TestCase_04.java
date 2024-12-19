package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase_04 extends Functions {

//	Test Case #04 - Logout User
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'Login to your account' is visible
//		6. Enter correct email address and password
//		7. Click 'login' button
//		8. Verify that 'Logged in as username' is visible
//		9. Click 'Logout' button
//		10. Verify that user is navigated to login page
	
	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	
	@Test(priority = 1)
	public void Logout_User() {

		// Launch Browser
		Functions.openBrowser();
		
		// Login
		Functions.Login(false);
		
		// VALIDATION POINT: Verifies that 'Logged in as username' is visible
		validator.expectedValue("//a[text()=' Logged in as ']//child::b", "Testname");

		// Logout
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT: Verifies that user is navigated to login page
		validator.expectedElement("//*[text()=' Signup / Login']",true);

		// Close browser.
		driver.close();
	}

}
