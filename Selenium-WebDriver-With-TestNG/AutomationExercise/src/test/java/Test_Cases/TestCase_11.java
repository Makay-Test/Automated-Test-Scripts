package Test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase_11 extends Functions{
//	Test Case #11 - Verify Subscription in Cart page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'Cart' button
//		5. Scroll down to footer
//		6. Verify text 'SUBSCRIPTION'
//		7. Enter email address in input and click arrow button
//		8. Verify success message 'You have been successfully subscribed!' is visible

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@Test(priority=1)
	public static void Verify_Subscription_in_Cart() {

		// Launch Browser.
		Functions.openBrowser();
		
		// Scroll down.
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		
		// Subscribe.
		// VALIDATION POINT:
		//			Verifies text 'SUBSCRIPTION'
		validator.expectedElement("//h2[text()='Subscription']");
		
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		
		// VALIDATION POINT:
		//			Verifies success message 'You have been successfully subscribed!' is visible
		validator.expectedElement("//div[text()='You have been successfully subscribed!']");

		// Close browser.
		driver.close();
	}

}
