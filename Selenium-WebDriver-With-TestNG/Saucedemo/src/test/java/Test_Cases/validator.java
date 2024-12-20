package Test_Cases;

import org.openqa.selenium.By;
import org.testng.Assert;

public class validator extends Functions{

	// Method for Validations
	public static void expectedElement(String elementToValidate) {
		// Checking if the element is present and store it in a variable to compare with expected result.
		Boolean actual,expected = true;
		actual = driver.findElement(By.xpath(elementToValidate)).isDisplayed();
		Assert.assertEquals(actual, expected);
		}
	
	public static void checkOut() {
		String expected [] = {
				"Sauce Labs Bike Light",
				"Sauce Labs Backpack",
				"$29.99",
				"$9.99",
				"Item total: $39.98",
				"Free Pony Express Delivery!",
				"Total: $43.18",
		};
		String xpathHolder [] = {
				"//div[text()='Sauce Labs Bike Light']",
				"//div[text()='Sauce Labs Backpack']",
				"//div[text()='29.99']",
				"//div[text()='9.99']",
				"//div[contains(text(),'Item total: $')]",
				"//div[text()='Free Pony Express Delivery!']",
				"//div[contains(text(),'Total:')]"
		};		
		for (int i = 0; i < 7; i++) {
			
			String valueCatcher = driver.findElement(By.xpath(xpathHolder [i])).getText();
			Assert.assertEquals(valueCatcher, expected[i]);
			
		}
		
	}

}
//// Removing Items from cart
//driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
//driver.findElement(By.id("remove-sauce-labs-backpack")).click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//// Proceeds to select other items
//driver.findElement(By.id("continue-shopping")).click();
//driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();