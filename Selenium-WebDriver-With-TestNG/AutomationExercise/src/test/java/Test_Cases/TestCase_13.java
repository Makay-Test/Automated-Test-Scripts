package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_13 extends Functions{

//	Test Case #13 - Verify Product quantity in Cart
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'View Product' for any product on home page
//		5. Verify product detail is opened
//		6. Increase quantity to 4
//		7. Click 'Add to cart' button
//		8. Click 'View Cart' button
//		9. Verify that product is displayed in cart page with exact quantity

	//#########################################################################################################################	
	//####### Please take note that some of the validations are inside of the functions/methods.				###############
	//#######																									###############
	//#########################################################################################################################

	//###############
	//### START	#####
	//###############
	
	@Test(priority=1)
	public static void Verify_Product_Quantity_in_Cart() {

		// Launch Browser.
		Functions.openBrowser();
		
		// Click on Products button.
		driver.findElement(By.xpath("//a[@href='/products']")).click();

		// View the product.
		driver.findElement(By.xpath("//a[@href='/product_details/2']")).click();
		
// 		VALIDATION POINT:
//		Verifies that detail is visible: product name, category, price, availability, condition, brand.
		String xpathHolder [] = {
						"//h2[text()='Men Tshirt']",
						"//p[text()='Category: Men > Tshirts']",
						"//span[text()='Rs. 400']",
						"//p[text()=' In Stock']",
						"//p[text()=' New']",
						"//p[text()=' H&M']"};
		for (int i = 0; i < 6; i++) {
			validator.expectedElement(xpathHolder[i]);}
		
		driver.findElement(By.xpath("//input[@id='quantity']")).clear();
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[text()]")).click();

		// Check the cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		VALIDATION POINT:
//						Verifies their quantity.
		validator.expectedElement("//tr[@id='product-2']//button[text()='4']");

		// Close browser.
		driver.close();

	}

}
