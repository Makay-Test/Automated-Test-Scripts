package Test_Cases;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_02 extends Functions{

	public static void main(String[] args) {

//	Test Case #02 - Login User with correct email and password
//		Test Steps:
//			1. Launch browser
//			2. Navigate to url 'http://automationexercise.com'
//			3. Verify that home page is visible successfully
//			4. Click on 'Signup / Login' button
//			5. Verify 'Login to your account' is visible
//			6. Enter correct email address and password
//			7. Click 'login' button
//			8. Verify that 'Logged in as username' is visible

		// Initialize WebDriver
		WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		Functions.openBrowser();

		// Login
		Functions.Login();
		
		//Close browser.
		driver.close();
	}

}
