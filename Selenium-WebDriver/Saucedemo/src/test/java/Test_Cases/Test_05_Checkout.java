package Test_Cases;

import org.openqa.selenium.By;

public class Test_05_Checkout extends WebDriver {

	public static void main(String[] args) {

		Reusable_func login = new Reusable_func();
		Reusable_func PersonalInfo = new Reusable_func();

		// Login page
		login.Login();

		// Adding Items in the cart
		getdriver().findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		getdriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		// Validate if items are present in Cart
		getdriver().findElement(By.id("shopping_cart_container")).click();

		// Checkout
		getdriver().findElement(By.xpath("//*[@id='checkout']")).click();

		// Personal Details
		PersonalInfo.Personal_info();
		getdriver().findElement(By.xpath("//*[@id='continue']")).click();
		getdriver().findElement(By.xpath("//*[@id='finish']")).click();
		getdriver().findElement(By.xpath("//*[@id='back-to-products']")).click();
		getdriver().close();
	}

}