package Test_Cases;

import org.testng.annotations.Test;

public class TestCase_03 extends Functions {
	
	
//	Test Case #03 - Login User with incorrect email and password
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'Login to your account' is visible
//		6. Enter incorrect email address and password
//		7. Click 'login' button
//		8. Verify error 'Your email or password is incorrect!' is visible
	
	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@Test(priority=1)
	public static void Login_User_with_incorrect_email_and_password() {
		
		// Launch Browser
		Functions.openBrowser();

		// Login
		Functions.Login(true);
//		VALIDATION POINT: Verifies error 'Your email or password is incorrect!' is visible
		validator.expectedElement("//p[text()='Your email or password is incorrect!']");

		// Close browser.
		driver.close();
	}

}
