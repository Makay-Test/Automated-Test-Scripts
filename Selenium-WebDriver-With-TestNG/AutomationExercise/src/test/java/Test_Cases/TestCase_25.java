package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_25 extends Functions{

//	Test Case # Verify Scroll Up using 'Arrow' button and Scroll Down functionality
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Scroll down page to bottom
//		5. Verify 'SUBSCRIPTION' is visible
//		6. Click on arrow at bottom right side to move upward
//		7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
	
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
	public static void Scroll_Up_with_Buttton() {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Button Scroll up
		driver.findElement(By.xpath("//a[@id='scrollUp']")).click();
		
		// VALIDATION POINT:
		//			Verifies that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
		validator.expectedElement("//div//div[2]//div[1]//h2[text()='Full-Fledged practice website for Automation Engineers']",true);
		
	}
}
