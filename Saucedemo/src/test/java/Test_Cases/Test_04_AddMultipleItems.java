package Test_Cases;

import org.openqa.selenium.By;

public class Test_04_AddMultipleItems extends WebDriver {

	public static void main(String[] args) {
		
		Reusable_func login = new Reusable_func();
		
		// Login page
		login.Login();

		// Add multiple items.
		getdriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		getdriver().findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		getdriver().close();
	}
}