package ui_Test;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Validator extends Functions{

	// Method for Validations
	public static void expectedElement(String elementToValidate) {
		// Checking if the element is present and store it in a variable to compare with expected result.
		Boolean actual,expected = true;
		actual = driver.findElement(By.xpath(elementToValidate)).isDisplayed();
		Assert.assertEquals(actual, expected);
		}
}