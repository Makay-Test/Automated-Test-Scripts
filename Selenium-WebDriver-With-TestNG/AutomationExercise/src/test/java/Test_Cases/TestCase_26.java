package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestCase_26 extends Functions {

//	Test Case #
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Scroll down page to bottom
//		5. Verify 'SUBSCRIPTION' is visible
//		6. Scroll up page to top
//		7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	@Test(priority=1)
	public static void Scroll_Up_without_Buttton() {

		// Launch Browser.
		Functions.openBrowser();

		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,7500)");
		
		// VALIDATION POINT:
		//			Verifies text 'SUBSCRIPTION'
		validator.expectedElement("//h2[text()='Subscription']",true);
		
		// Subscribe.
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();

		// Scroll up.
		exec.executeScript("window.scrollBy(0,-7500)");

		// VALIDATION POINT:
		//			Verifies that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
		validator.expectedElement("//div//div[2]//div[1]//h2[text()='Full-Fledged practice website for Automation Engineers']",true);
	}
}
