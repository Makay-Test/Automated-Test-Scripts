package Test_Cases;

import org.openqa.selenium.By;

public class Test_03_ValidateCart extends WebDriver{

	public static void main(String[] args) {

		Reusable_func login = new Reusable_func();
		
		// Login page
		login.Login();
		
		// Adding Items
		getdriver().findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		getdriver().findElement(By.id("shopping_cart_container")).click();

		// Removing Items from cart
		getdriver().findElement(By.id("remove-sauce-labs-bike-light")).click();
		getdriver().findElement(By.id("remove-sauce-labs-backpack")).click();

		// Proceeds to select other items
		getdriver().findElement(By.id("continue-shopping")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		getdriver().findElement(By.id("shopping_cart_container")).click();
		getdriver().close();
	}
}