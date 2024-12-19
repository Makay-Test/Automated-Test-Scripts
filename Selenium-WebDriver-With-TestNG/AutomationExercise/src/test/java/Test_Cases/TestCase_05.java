package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_05 extends Functions {

//	TestCase #05 - Register User with existing email
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'New User Signup!' is visible
//		6. Enter name and already registered email address
//		7. Click 'Signup' button
//		8. Verify error 'Email Address already exist!' is visible
	// #########################################################################################################################
	// ####### Please take note that some of the validations are inside of the
	// functions/methods. ###############
	// ####### ###############
	// #########################################################################################################################

	// ###############
	// ### START #####
	// ###############

	@AfterTest
	public void deleteUser() {
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Close browser.
		driver.close();
	}

	@Test(priority = 1)
	public static void TestCase05() {

		// Launch Browser
		Functions.openBrowser();

		// Register as new user
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

		// VALIDATION POINT: Verifies 'New User Signup!' is visible
		validator.expectedElement("//button[@data-qa='signup-button']", true);

		// NOTE: Validation item 8 is inside the Function.userSignup method.
		Functions.userSignUp();
	}

}
