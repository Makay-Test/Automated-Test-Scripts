package testScenarios;

import org.testng.annotations.Test;

public class TestCase extends Functions {

	@Test(priority = 1)
	public static void signIn() {

//		TestCase #01 - User is able to Sign in.
//		1. Open browser.
//		2. Go to "https://practicesoftwaretesting.com/".
//		3. On landing page, click on Sign in.
//		4. Enter a valid existing email address.
//		5. Enter correct password.
//		6. Click on Login button.

		// Start
		// Launching browser.
		Functions.launchBrowser();

		// Login with valid credentials.
		Functions.login();
	}

}
