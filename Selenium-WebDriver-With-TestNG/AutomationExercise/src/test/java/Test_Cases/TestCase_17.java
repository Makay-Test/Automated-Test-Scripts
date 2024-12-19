package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_17 extends Functions {

//	Test Case # Remove_Products_From_Cart
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Add products to cart
//		5. Click 'Cart' button
//		6. Verify that cart page is displayed
//		7. Click 'X' button corresponding to particular product
//		8. Verify that product is removed from the cart

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
	
	@Test(priority = 1)
	public static void Remove_Products_From_Cart() {

		// Launch Browser.
		Functions.openBrowser();

		// Adding products to cart
		Actions action = new Actions(driver);

		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		
		// Hover to first item
		exec.executeScript("window.scrollBy(0,1000)");
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

		// Proceeds to cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		// VALIDATION POINT:
		//			Verifies that cart page is displayed
		validator.expectedElement("//li[text()='Shopping Cart']",true);

		// Removing Items in the cart.
		driver.findElement(By.xpath("//td[@class='cart_delete']//child::a[@data-product-id='2']")).click();
		driver.findElement(By.xpath("//td[@class='cart_delete']//child::a[@data-product-id='3']")).click();
		driver.findElement(By.xpath("//td[@class='cart_delete']//child::a[@data-product-id='4']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that product is removed from the cart
		validator.expectedElement("//td[@class='cart_description']//a[text()='Men Tshirt'",false);
		validator.expectedElement("//td[@class='cart_description']//a[text()='Sleeveless Dress'",false);
		validator.expectedElement("//td[@class='cart_description']//a[text()='Stylish Dress']",false);
		
		// Close browser
		driver.close();
	}
}
