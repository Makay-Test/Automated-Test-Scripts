package Test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_07 extends Functions {

//	Test Case #07 - Verify Test Cases Page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Test Cases' button
//		5. Verify user is navigated to test cases page successfully
	// #########################################################################################################################
	// ####### Please take note that some of the validations are inside of the functions/methods.
	// #########################################################################################################################

	// ###############
	// ### START #####
	// ###############

	@AfterTest
	public void endTest() {
		// Goes to Home page and close the browser
		driver.findElement(By.xpath("//a[text()=' Home']")).click();
		// Close browser
		driver.close();
	}

	@Test(priority=1)
	public static void Test_Cases_Page() {

		// Launch Browser.
		Functions.openBrowser();

		// Click on Test Cases button.
		driver.findElement(By.xpath("//a[@class='test_cases_list']")).click();

		// VALIDATION POINT:
		// Verifies user is navigated to test cases page successfully.
		validator.expectedElement("//b[text()='Test Cases']", true);

		// Close browser.
		driver.close();

	}

}
