package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase_12 extends Functions{

//	Test Case #12 - Add Products in Cart
//	Test Steps:
//	1. Launch browser
//	2. Navigate to url 'http://automationexercise.com'
//	3. Verify that home page is visible successfully
//	4. Click 'Products' button
//	5. Hover over first product and click 'Add to cart'
//	6. Click 'Continue Shopping' button
//	7. Hover over second product and click 'Add to cart'
//	8. Click 'View Cart' button
//	9. Verify both products are added to Cart
//	10. Verify their prices, quantity and total price

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@Test(priority=1)
	public static void Add_Products_Cart() {
		
		// Launch Browser.
		Functions.openBrowser();

		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();

		// Hover to first item
		Actions action = new Actions(driver);
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/2']"));
		action.moveToElement(productLocator).perform();

		// Add the product.
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		// Hover to second item
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/1']"));
		action.moveToElement(productLocator).perform();

		// Add the product.
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		// Check the cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String item1 [] = {
				"//a[text()='Blue Top']",
				"//td[@class='cart_price']//p[text()='Rs. 500']",
				"//tr[@id='product-1']//button[text()='1']",
				"//td[@class='cart_total']//p[text()='Rs. 500']"};
		String item2 [] = {
				"//a[text()='Men Tshirt']",
				"//td[@class='cart_price']//p[text()='Rs. 400']",
				"//tr[@id='product-2']//button[text()='1']",
				"//td[@class='cart_total']//p[text()='Rs. 400']"};
		
		for (int i = 0; i < 4; i++) {
			// VALIDATION POINT:
			//			Verifies both products are added to Cart
			//			Verifies their prices, quantity and total price.
		validator.expectedElement(item1[i]);
		validator.expectedElement(item2[i]);
		}
		
		// Close browser.
		driver.close();
		
	}

}
