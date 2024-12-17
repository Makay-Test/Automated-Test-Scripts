package Test_Cases;

import org.openqa.selenium.By;

public class Test_05_Checkout extends Functions {

	public static void main(String[] args) {

		// Login page
		Functions.Login();

		// Adding Items in the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		driver.findElement(By.id("shopping_cart_container")).click();

		// Checkout
		driver.findElement(By.xpath("//*[@id='checkout']")).click();

		// Personal Details
		Functions.Personal_info();
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		driver.findElement(By.xpath("//*[@id='back-to-products']")).click();
		driver.close();
	}

}