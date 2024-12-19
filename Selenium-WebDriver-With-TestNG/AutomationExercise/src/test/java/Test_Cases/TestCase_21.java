package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_21 extends Functions {

//	Test Case # Add review on product
//	Test Steps:

//	1. Launch browser
//	2. Navigate to url 'http://automationexercise.com'
//	3. Click on 'Products' button
//	4. Verify user is navigated to ALL PRODUCTS page successfully
//	5. Click on 'View Product' button
//	6. Verify 'Write Your Review' is visible
//	7. Enter name, email and review
//	8. Click 'Submit' button
//	9. Verify success message 'Thank you for your review.'
//	
	// #########################################################################################################################
	// ####### Please take note that some of the validations are inside of the functions/methods. 
	// #########################################################################################################################

	// ###############
	// ### START #####
	// ###############
	
	@AfterTest
	public void endTest(){
		// Goes to Home page and close the browser
		driver.findElement(By.xpath("//a[text()=' Home']")).click();
		// Close browser
		driver.close();}
	
	@Test(priority=1)
	public static void Add_review_on_product() {
		// Launch Browser.
		Functions.openBrowser();

		// Click on Products button view an item.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies user is navigated to ALL PRODUCTS page successfully
		validator.expectedElement("//h2[text()='All Products']",true);
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.xpath("//a[@href='/product_details/4']")).click();

		// Add review.		
		exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,700)");
		
		// VALIDATION POINT:
		//			Verifies 'Write Your Review' is visible.
		validator.expectedElement("//a[text()='Write Your Review']",true);
		
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("Test@yopmail.com");
		driver.findElement(By.xpath("//textarea[@name='review']")).sendKeys("This is a Test review.");
		driver.findElement(By.xpath("//button[@id='button-review']")).click();
		
		// VALIDATION POINT:
				//			Verifies success message 'Thank you for your review.'
				validator.expectedElement("//span[text()='Thank you for your review.']",true);
	}
}
