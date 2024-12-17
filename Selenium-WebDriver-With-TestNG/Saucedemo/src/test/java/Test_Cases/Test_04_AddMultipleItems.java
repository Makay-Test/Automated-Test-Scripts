package Test_Cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_04_AddMultipleItems extends Functions {

	@Test(priority=1)
	public static void allItems() {

		// Launch browser.
		Functions.browserLaunch();
		
		// Login page
		Functions.Login();

		// Add multiple items.
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		// Validate if items are added.
		Boolean item1 = driver.findElement(By.id("remove-sauce-labs-backpack")).isEnabled();
		Boolean item2 = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).isEnabled();
		Boolean item3 = driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).isEnabled();
		Boolean item4 = driver.findElement(By.id("remove-sauce-labs-onesie")).isEnabled();
		Boolean item5 = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).isEnabled();
		Boolean expected = true;
		
		Assert.assertEquals(item1, expected);
		Assert.assertEquals(item2, expected);
		Assert.assertEquals(item3, expected);
		Assert.assertEquals(item4, expected);
		Assert.assertEquals(item5, expected);
		driver.close();
	}
}