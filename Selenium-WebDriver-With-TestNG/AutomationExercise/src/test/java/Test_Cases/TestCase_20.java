package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase_20 extends Functions {
//	Test Case # Search Products and Verify Cart After Login
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Click on 'Products' button
//		4. Verify user is navigated to ALL PRODUCTS page successfully
//		5. Enter product name in search input and click search button
//		6. Verify 'SEARCHED PRODUCTS' is visible
//		7. Verify all the products related to search are visible
//		8. Add those products to cart
//		9. Click 'Cart' button and verify that products are visible in cart
//		10. Click 'Signup / Login' button and submit login details
//		11. Again, go to Cart page
//		12. Verify that those products are visible in cart after login as well

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
	public static void Search_Products_and_Verify_Cart_After_Login() {
		
		// Launch Browser.
		Functions.openBrowser();

		// Proceed to Products.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies user is navigated to ALL PRODUCTS page successfully
		validator.expectedElement("//h2[text()='All Products']",true);

		// Input keywords to search.
		driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Tshirt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("submit_search")).click();
		
		String allSearchedProducts [] = {
				"//div[@class='productinfo text-center']//child::p[text()='Men Tshirt']",
				"//div[@class='productinfo text-center']//child::p[text()='Pure Cotton V-Neck T-Shirt']",
				"//div[@class='productinfo text-center']//child::p[text()='Green Side Placket Detail T-Shirt']",
				"//div[@class='productinfo text-center']//child::p[text()='Premium Polo T-Shirts']",
				"//div[@class='productinfo text-center']//child::p[text()='Pure Cotton Neon Green Tshirt']",
				"//div[@class='productinfo text-center']//child::p[text()='GRAPHIC DESIGN MEN T SHIRT - BLUE']"};
		
		for (int i = 0; i < 6; i++) {
		
			// VALIDATION POINT:
			//			Verifies user is able to see items related to searched item.
		validator.expectedElement(allSearchedProducts[i],true);}

		// Scroll down
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,500)");
		
		// Adding items to the cart.
		Actions action = new Actions(driver);
		
		WebElement productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/2']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/28']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='28']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		productLocator = driver.findElement(By.xpath("//img[@src='/get_product_picture/29']"));
		action.moveToElement(productLocator).perform();
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='29']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		// Proceeds to cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Sign up new user
		driver.findElement(By.xpath("//li//a[@href='/login']")).click();
		Functions.Login(false);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Proceeds back to cart.
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that those products are visible in cart after login as well
		validator.expectedElement("//a[text()='Men Tshirt']",true);
		validator.expectedElement("//a[text()='Pure Cotton V-Neck T-Shirt']",true);
		validator.expectedElement("//a[text()='Green Side Placket Detail T-Shirt']",true);

		// Close browser
		driver.close();
	}
}
