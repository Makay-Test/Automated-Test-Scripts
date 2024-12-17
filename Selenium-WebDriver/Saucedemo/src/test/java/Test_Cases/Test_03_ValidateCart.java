package Test_Cases;

import org.openqa.selenium.By;

public class Test_03_ValidateCart extends Functions {

	public static void main(String[] args) {

		// Login page
		Functions.Login();

		// Adding Items
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();

		// Removing Items from cart
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();

		// Proceeds to select other items
		driver.findElement(By.id("continue-shopping")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.close();
	}
}