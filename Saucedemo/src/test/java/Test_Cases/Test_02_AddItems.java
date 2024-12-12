package Test_Cases;

import org.openqa.selenium.By;

public class Test_02_AddItems extends WebDriver {

	public static void main(String[] args) {
		
		Reusable_func login = new Reusable_func();

		// Login page
		login.Login();

		// Select/Add an item.
		getdriver().findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		getdriver().close();

	}
}