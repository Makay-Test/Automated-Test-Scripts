package Test_Cases;

import org.openqa.selenium.By;

public class Test_04_AddMultipleItems extends Functions {

	public static void main(String[] args) {

		// Login page
		Functions.Login();

		// Add multiple items.
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.close();
	}
}