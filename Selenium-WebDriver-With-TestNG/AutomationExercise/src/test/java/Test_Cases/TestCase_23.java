package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_23 extends Functions{

//	Test Case #23 Verify address details in checkout page
//	Test Steps:
//	1. Launch browser
//	2. Navigate to url 'http://automationexercise.com'
//	3. Verify that home page is visible successfully
//	4. Click 'Signup / Login' button
//	5. Fill all details in Signup and create account
//	6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//	7. Verify ' Logged in as username' at top
//	8. Add products to cart
//	9. Click 'Cart' button
//	10. Verify that cart page is displayed
//	11. Click Proceed To Checkout
//	12. Verify that the delivery address is same address filled at the time registration of account
//	13. Verify that the billing address is same address filled at the time registration of account

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
	public static void Verify_address_details_in_checkout_page() {

		// Launch Browser.
		Functions.openBrowser();
		
		// Sign up new user
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		Functions.userSignUp();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		// VALIDATION POINT: 
		//			Verifies that 'Logged in as username' is visible
		validator.expectedValue("//a[text()=' Logged in as ']//child::b", "Testname");

		// Adding products.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='8']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='16']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on cart
		driver.findElement(By.xpath("//ul//child::a[@href='/view_cart']")).click();
		
		// VALIDATION POINT:
		//			Verifies that cart page is displayed
		validator.expectedElement("//li[text()='Shopping Cart']",true);
		
		// Checkout
		Functions.checkOut();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}
}
