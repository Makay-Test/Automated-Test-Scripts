package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class TestCase_22 extends Functions {

//	Test Case #  Add to cart from Recommended items
//	Test Steps:
//	1. Launch browser
//	2. Navigate to url 'http://automationexercise.com'
//	3. Scroll to bottom of page
//	4. Verify 'RECOMMENDED ITEMS' are visible
//	5. Click on 'Add To Cart' on Recommended product
//	6. Click on 'View Cart' button
//	7. Verify that product is displayed in cart page

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
	public static void Add_to_cart_from_Recommended_items() {
		
		// Launch Browser.
		Functions.openBrowser();

		// Scroll down
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,7500)");
		
		// VALIDATION POINT:
		//			Verifies 'RECOMMENDED ITEMS' are visible
		validator.expectedElement("//h2[text()='recommended items']",true);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='recommended_items']//descendant::a"))).click();
		
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		// Scroll up
		exec.executeScript("window.scrollBy(0,-7500)");
		driver.findElement(By.xpath("//li//a[@href='/view_cart']")).click();
		
		// VALIDATION POINT:
		//			Verifies that product is displayed in cart page
		validator.expectedElement("//tbody//tr",true);

	}
}
