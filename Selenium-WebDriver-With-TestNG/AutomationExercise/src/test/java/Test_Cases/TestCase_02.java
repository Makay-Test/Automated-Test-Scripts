package Test_Cases;

import org.testng.annotations.Test;

public class TestCase_02 extends Functions {
	
//	Test Case #02 - Login User with correct email and password
//	Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'Login to your account' is visible
//		6. Enter correct email address and password
//		7. Click 'login' button
//		8. Verify that 'Logged in as username' is visible
	
	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	@Test(priority=1)
	public static void Login_User_with_correct_email_and_password() {
		// Launch Browser
		Functions.openBrowser();

		// Login
		Functions.Login(false);
// 		VALIDATION POINT: Verifies that 'Logged in as username' is visible
		validator.expectedValue("//a[text()=' Logged in as ']//child::b", "Testname");

		// Close browser.
		driver.close();
	}

}
