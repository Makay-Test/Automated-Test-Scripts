package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_16 extends Functions {

//	Test Case #
//		Test Steps: Login before Checkout
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'Signup / Login' button
//		5. Fill email, password and click 'Login' button
//		6. Verify 'Logged in as username' at top
//		7. Add products to cart
//		8. Click 'Cart' button
//		9. Verify that cart page is displayed
//		10. Click Proceed To Checkout
//		11. Verify Address Details and Review Your Order
//		12. Enter description in comment text area and click 'Place Order'
//		13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//		14. Click 'Pay and Confirm Order' button
//		15. Verify success message 'Your order has been placed successfully!'

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
	public static void Login_before_Checkout() {

		// Launch Browser.
		Functions.openBrowser();

		// Login
		Functions.Login(false);
		
		// VALIDATION POINT: 
		//			Verifies that 'Logged in as username' is visible
		validator.expectedValue("//a[text()=' Logged in as ']//child::b", "Testname");

		// Adding products to cart
		Actions action = new Actions(driver);
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,1000)");
		
		// Hover to first item
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/2']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='2']")).click();
		
		// Scroll down.
		exec.executeScript("window.scrollBy(0,500)");
		
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
		
		// Proceeds to cart
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		// VALIDATION POINT:
		//			Verifies that cart page is displayed
		validator.expectedElement("//li[text()='Shopping Cart']",true);

		// Checkout
		Functions.checkOut();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		// Close browser
		driver.close();
	}
}
