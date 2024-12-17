package Test_Cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_06_Cancel extends Functions {

	@Test(priority = 1)
	public static void cancelOrder() {

		// Launch browser.
		Functions.browserLaunch();

		// Login page
		Functions.Login();

		// Adding Items in the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();
		Boolean actual1 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).isEnabled();
		Boolean actual2 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).isEnabled();
		Boolean expected1 = true;
		Assert.assertEquals(actual1, expected1);
		Assert.assertEquals(actual2, expected1);

		// Checkout
		driver.findElement(By.xpath("//*[@id='checkout']")).click();

		// Cancel
		driver.findElement(By.xpath("//*[@id='cancel']")).click();

		// Checkout again
		driver.findElement(By.xpath("//*[@id='checkout']")).click();

		// Personal Details
		Functions.Personal_info();
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		driver.findElement(By.xpath("//*[@id='back-to-products']")).click();
		// Validation if user is able to go back on products page.
		Boolean actual = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isEnabled();
		Boolean expected = true;
		Assert.assertEquals(actual, expected);
		driver.close();

	}
}