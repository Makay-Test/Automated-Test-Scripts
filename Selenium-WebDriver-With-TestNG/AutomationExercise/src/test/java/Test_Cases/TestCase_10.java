package Test_Cases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_10 extends Functions{

//	Test Case #10 - Verify Subscription in home page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Scroll down to footer
//		5. Verify text 'SUBSCRIPTION'
//		6. Enter email address in input and click arrow button
//		7. Verify success message 'You have been successfully subscribed!' is visible

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@AfterTest
	public void endTest(){
		// Goes to Home page and close the browser
		driver.findElement(By.xpath("//a[text()=' Home']")).click();
		// Close browser
		driver.close();}
	
	@Test(priority=1)
	public static void Verify_Subscription() {
		
		// Launch Browser.
		Functions.openBrowser();
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,7500)");
		
		// Subscribe.
		// VALIDATION POINT:
		//			Verifies text 'SUBSCRIPTION'
		validator.expectedElement("//h2[text()='Subscription']",true);
		
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		
		// VALIDATION POINT:
		//			Verifies success message 'You have been successfully subscribed!' is visible
		validator.expectedElement("//div[text()='You have been successfully subscribed!']",true);

		// Close browser.
		driver.close();
	}

}
