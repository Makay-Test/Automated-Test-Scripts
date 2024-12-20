package Test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Smoke_Test extends Functions {
	
	@BeforeMethod
	public void launchBrowser() {
		// Launch browser.
		Functions.browserLaunch();

		// Login page.
		Functions.Login();
	}

	@AfterMethod
	public void exitBrowser() {
		// Close Browser
		driver.quit();
	}
	
//==========================================================================================================================
//	TestCase #1 - Log in.
//==========================================================================================================================	
//	1. Go to https://www.saucedemo.com/".
//	2. Input valid username and password.
//	3. Click Login button.
//	4. Validate user is able to login and proceed to next page.
	
	@Test(priority = 1, enabled = true)
	public void validateLogin() {
		
		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//span[text()='Products']");
	}
//==========================================================================================================================
//	TestCase #2 - Add items.
//==========================================================================================================================
//	1. Go to https://www.saucedemo.com/".
//	2. Input valid username and password.
//	3. Click Login button.
//	4. Validate user is able to login and proceed to next page.
//	5. Validate able to see available items.
//	6. Add items.
//	7. Validate "Add to cart" button will turn in to "Remove" button after click.
	@Test(priority = 2,enabled = true)
	public void addItems() {
		
		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//span[text()='Products']");
		
		// Select/Add an item.
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		// VALIDATION POINT:
		//		Verifies "Add to cart" button will turn in to "Remove" button after click.
		validator.expectedElement("//button[text()='Remove']");
	}
	
//==========================================================================================================================
// TestCase #3 - Validate Cart.
//==========================================================================================================================
//	1. Go to https://www.saucedemo.com/".
//	2. Input valid username and password.
//	3. Click Login button.
//	4. Validate user is able to login and proceed to next page.
//	5. Validate able to see available items.
//	6. Add items.
//	7. Validate "Add to cart" button will turn in to "Remove" button after click.
//	8. Click on Cart icon.
//	9. Validate selected items are present on the cart.
	
	@Test(priority=3, enabled = true)
	public static void validateCart() {
		
		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//span[text()='Products']");
		
		// Adding Items
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		// VALIDATION POINT:
		//		Verifies add to cart button will turn in to remove button after click.
		validator.expectedElement("//button[@id='remove-sauce-labs-bike-light']");
		validator.expectedElement("//button[@id='remove-sauce-labs-backpack']");
		
		// Proceed to cart.
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// VALIDATION POINT:
		//		Verifies "Add to cart" button will turn in to "Remove" button after click.
		validator.expectedElement("//div[text()='Sauce Labs Backpack']");
		validator.expectedElement("//div[text()='Sauce Labs Bike Light']");
		
	}
//==========================================================================================================================
// TestCase #4 - Add multiple items
//==========================================================================================================================
//	1. Go to https://www.saucedemo.com/".
//	2. Input valid username and password.
//	3. Click Login button.
//	4. Validate user is able to login and proceed to next page.
//	5. Validate able to see available items.
//	6. Add items.
//	7. Validate "Add to cart" button will turn in to "Remove" button after click.
//	8. Click on Cart icon.
//	9. Validate selected items are present on the cart.
		
	@Test(priority=4, enabled = true)
	public static void allItems() {

		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//span[text()='Products']");
		
		// Add multiple items.
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		// VALIDATION POINT:
		//		Verifies "Add to cart" button will turn in to "Remove" button after click.
		
		String xpathHolder [] = {
				"//button[@id='remove-sauce-labs-backpack']",
				"//button[@id='remove-sauce-labs-bolt-t-shirt']",
				"//button[@id='remove-sauce-labs-fleece-jacket']",
				"//button[@id='remove-sauce-labs-onesie']",
				"//button[@id='remove-test.allthethings()-t-shirt-(red)']"
		};
		for (int i = 0; i < 5; i++) {
			validator.expectedElement(xpathHolder[i]);
		}
		
		// Proceed to cart.
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// Validate selected items are present on the cart.
		for (int i = 0; i < 5; i++) {
			validator.expectedElement(xpathHolder[i]);
		}
	}
//==========================================================================================================================
// TestCase #5 - Checkout
//==========================================================================================================================
//	TestCase #5- Checkout
//	1. Go to https://www.saucedemo.com/".
//	2. Input valid username and password.
//	3. Click Login button.
//	4. Validate user is able to login and proceed to next page.
//	5. Validate able to see available items.
//	6. Add items.
//	7. Validate add to cart button will turn in to remove button after click.
//	8. Click on Cart icon.
//	9. Validate selected items are present on the cart.
//	10. Checkout.
//	11. Validate if personal input fields are present.
//	12. Populate needed details.
//	13. Click continue.
//	14. Validate if the items, number of items, amount, payment information, shipping information and price total are showing and correct.
//	15. Click Finish.
//	16. Validate "Thank you for your order!" confirmation is showing.
//	17. Click on Back home.
//	18. Validate page will return to Products page.
			
	@Test(priority = 5, enabled = true)
	public static void checkOut() {
		
		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//span[text()='Products']");
		
		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//div[text()='Sauce Labs Backpack']");
		
		// Adding Items in the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// VALIDATION POINT:
		//		Verifies add to cart button will turn in to remove button after click.
		validator.expectedElement("//button[@id='remove-sauce-labs-bike-light']");
		validator.expectedElement("//button[@id='remove-sauce-labs-backpack']");
		
		// Proceed to cart.
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// VALIDATION POINT:
		//		Verifies "Add to cart" button will turn in to "Remove" button after click.
		validator.expectedElement("//div[text()='Sauce Labs Backpack']");
		validator.expectedElement("//div[text()='Sauce Labs Bike Light']");

		// Checkout
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
	
		// VALIDATION POINT:
		//		Validate if personal input fields are present.
		validator.expectedElement("//span[text()='Checkout: Your Information']");
		
		// Personal Details
		Functions.Personal_info();
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		
		// VALIDATION POINT:
		//		Validate if the items, number of items, amount, payment information, shipping information and price total are showing and correct.
		validator.expectedElement("//span[text()='Checkout: Overview']");
		
		// Another validator to check if the above condition is met.
		validator.checkOut();
		
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		
		// VALIDATION POINT:
		//		Validate "Thank you for your order!" confirmation is showing.
		validator.expectedElement("//h2[text()='Thank you for your order!']");
				
		driver.findElement(By.xpath("//button[text()='Back Home']")).click();
		
		// VALIDATION POINT:
		//		Validate page will return to Products page.
		validator.expectedElement("//span[text()='Products']");
		}
//==========================================================================================================================
// TestCase #6 - Checkout then Cancel
//==========================================================================================================================
//	TestCase #6- Checkout then Cancel
//	1. Go to https://www.saucedemo.com/".
//	2. Input valid username and password.
//	3. Click Login button.
//	4. Validate user is able to login and proceed to next page.
//	5. Validate able to see available items.
//	6. Add items.
//	7. Validate add to cart button will turn in to remove button after click.
//	8. Click on Cart icon.
//	9. Validate selected items are present on the cart.
//	10. Checkout.
//	11. Click cancel.
//	12. Validate user will be redirected to cart again.
//	13. Validate if personal input fields are present.
//	14. Populate needed details.
//	15. Click continue.
//	16. Validate if the items, number of items, amount, payment information, shipping information and price total are showing and correct.
//	17. Click Finish.
//	18. Validate "Thank you for your order!" confirmation is showing.
//	19. Click on Back home.
//	20. Validate page will return to Products page.

	@Test(priority = 6,enabled = true)
	public static void cancelOrder() {

		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//span[text()='Products']");
		
		// VALIDATION POINT:
		//		Verifies user is able to login and proceed to next page.
		validator.expectedElement("//div[text()='Sauce Labs Backpack']");
		
		// Adding Items in the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// VALIDATION POINT:
		//		Verifies add to cart button will turn in to remove button after click.
		validator.expectedElement("//button[@id='remove-sauce-labs-bike-light']");
		validator.expectedElement("//button[@id='remove-sauce-labs-backpack']");
		
		// Proceed to cart.
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// VALIDATION POINT:
		//		Verifies if user is able to land in cart page.
		validator.expectedElement("//span[text()='Your Cart']");
		
		// VALIDATION POINT:
		//		Verifies "Add to cart" button will turn in to "Remove" button after click.
		validator.expectedElement("//div[text()='Sauce Labs Backpack']");
		validator.expectedElement("//div[text()='Sauce Labs Bike Light']");

		// Checkout
		driver.findElement(By.xpath("//*[@id='checkout']")).click();

		// Cancel
		driver.findElement(By.xpath("//*[@id='cancel']")).click();
		
		// VALIDATION POINT:
		//		Verifies if user is able to land in cart page.
		validator.expectedElement("//span[text()='Your Cart']");

		// Checkout again
		driver.findElement(By.xpath("//*[@id='checkout']")).click();

		// Personal Details
		Functions.Personal_info();
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		
		// VALIDATION POINT:
		//		Validate if the items, number of items, amount, payment information, shipping information and price total are showing and correct.
		validator.expectedElement("//span[text()='Checkout: Overview']");
		
		// Another validator to check if the above condition is met.
		validator.checkOut();
		
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		
		// VALIDATION POINT:
		//		Validate "Thank you for your order!" confirmation is showing.
		validator.expectedElement("//h2[text()='Thank you for your order!']");
				
		driver.findElement(By.xpath("//button[text()='Back Home']")).click();
		
		// VALIDATION POINT:
		//		Validate page will return to Products page.
		validator.expectedElement("//span[text()='Products']");

	}
}
