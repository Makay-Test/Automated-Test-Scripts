package Test_Cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_02_AddItems extends Functions {

	@Test
	public static void addItems() {
		
		// Launch browser.
		Functions.browserLaunch();
		
		// Login page.
		Functions.Login();

		// Select/Add an item.
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Boolean actual = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).isEnabled();
		Boolean expected = true;
		Assert.assertEquals(actual, expected);
		driver.close();

	}
}