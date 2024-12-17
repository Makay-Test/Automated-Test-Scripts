package Test_Cases;

import org.openqa.selenium.By;

public class Test_02_AddItems extends Functions {

	public static void main(String[] args) {
		
		// Login page
		Functions.Login();

		// Select/Add an item.
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.close();

	}
}