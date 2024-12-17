package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_23 extends Functions{

	public static void main(String[] args) {

//	Test Case #
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
//		12. Verify that the delivery address is same address filled at the time registration of account
//		13. Verify that the billing address is same address filled at the time registration of account

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();
		
		// Sign up new user
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		Functions.userSignUp();

		// Adding products.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='8']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='16']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		// Checkout
		Functions.checkOut();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		// Close browser
		driver.close();
	}
}
