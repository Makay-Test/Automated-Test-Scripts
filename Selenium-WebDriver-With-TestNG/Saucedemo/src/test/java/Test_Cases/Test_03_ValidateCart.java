package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_03_ValidateCart extends Functions {

	@Test(priority=1)
	public static void validateCart() {
		
		// Launch browser.
		Functions.browserLaunch();
		
		// Login page
		Functions.Login();

		// Adding Items
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();
	
		Boolean actual1 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).isEnabled();
		Boolean actual2 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).isEnabled();
		Boolean expected1 = true;
		Assert.assertEquals(actual1, expected1);
		Assert.assertEquals(actual2, expected1);
		

		// Removing Items from cart
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Proceeds to select other items
		driver.findElement(By.id("continue-shopping")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Assert.assertEquals(actual1, expected1);
		Assert.assertEquals(actual2, expected1);

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();
		Assert.assertEquals(actual1, expected1);
		Assert.assertEquals(actual2, expected1);
		driver.close();
	}
}