package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_15 extends Functions {

//	Test Case # Register_before_Checkout
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'Signup / Login' button
//		5. Fill all details in Signup and create account
//		6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//		7. Verify ' Logged in as username' at top
//		8. Add products to cart
//		9. Click 'Cart' button
//		10. Verify that cart page is displayed
//		11. Click Proceed To Checkout
//		12. Verify Address Details and Review Your Order
//		13. Enter description in comment text area and click 'Place Order'
//		14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//		15. Click 'Pay and Confirm Order' button
//		16. Verify success message 'Your order has been placed successfully!'
	
	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@AfterTest
	public void deleteUser() {
	driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
	driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// Close browser
	driver.close();
	}
	@Test(priority=1)
	public static void Register_before_Checkout() {

		// Launch Browser.
		Functions.openBrowser();

		// Proceed to Sign up
		driver.findElement(By.xpath("//a[@href='/login']")).click();

		// Sign up new user
		Functions.userSignUp();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		// VALIDATION POINT: 
		//			Verifies that 'Logged in as username' is visible
		validator.expectedValue("//a[text()=' Logged in as ']//child::b", "Testname");
		
		// Adding products to cart
		Actions action = new Actions(driver);
		
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/2']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/3']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='3']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/4']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='4']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		// Click on cart
		driver.findElement(By.xpath("//ul//child::a[@href='/view_cart']")).click();
		
		// VALIDATION POINT:
		//			Verifies that cart page is displayed
		validator.expectedElement("//li[text()='Shopping Cart']",true);
		
		//Checkout
		Functions.checkOut();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}
}
