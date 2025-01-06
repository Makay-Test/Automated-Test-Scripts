package ui_Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase_01 extends Functions{
	
//	Test#1 - User is able to Sign in
//	Test Steps and validations:
//		1. Open browser.
//		2. Launch https://practicesoftwaretesting.com/
//		- Validate: User is able to land on Home page.
//		3. Click on Sign in button.
//		- Validate: User is able to land on Login page. Username and password input fields, Login button, "Register your account" link and "Forgot your password" link should be all visible.
//		4. Enter a registered email address and password.
//		- Validate: User is able to land on My account page.
	

//	### START #####
	
	@Test
	@BeforeMethod // Launch browser.
	public void launchBrowser() throws IOException {
		Functions.browserLaunch();
		// Login page.
		Functions.Login();
	}

	@AfterMethod 	// Close Browser
	public void exitBrowser() {
		driver.quit();
	}

}
