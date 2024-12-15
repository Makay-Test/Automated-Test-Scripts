package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_14 extends Functions{

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Add products to cart
//		5. Click 'Cart' button
//		6. Verify that cart page is displayed
//		7. Click Proceed To Checkout
//		8. Click 'Register / Login' button
//		9. Fill all details in Signup and create account
//		10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//		11. Verify ' Logged in as username' at top
//		12.Click 'Cart' button
//		13. Click 'Proceed To Checkout' button
//		14. Verify Address Details and Review Your Order
//		15. Enter description in comment text area and click 'Place Order'
//		16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//		17. Click 'Pay and Confirm Order' button
//		18. Verify success message 'Your order has been placed successfully!'
//		19. Click 'Delete Account' button
//		20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Add products
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='8']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='16']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		// Click on cart
		driver.findElement(By.xpath("//ul//child::a[@href='/view_cart']")).click();

		// Proceed to checkout
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/login']//child::u")).click();

		// Sign up new user
		Functions.userSignUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		// Checkout
		Functions.checkOut();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		// Close browser
		driver.close();

	}

}
