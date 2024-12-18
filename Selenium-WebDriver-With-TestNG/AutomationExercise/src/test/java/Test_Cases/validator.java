package Test_Cases;

import org.openqa.selenium.By;
import org.testng.Assert;

public class validator extends Functions {

	// Method for Validations
	public static void expectedElement(String elementToValidate) {

		// Checking if the element is present and store it in a variable to compare with
		// expected result.
		Boolean actual = driver.findElement(By.xpath(elementToValidate)).isDisplayed();
		Boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	// Method for Validations
	public static void expectedValue(String elementToValidate, String expected) {

		// Checking of the value of the element is the same to the expected value.
		String actual = driver.findElement(By.xpath(elementToValidate)).getText();
		Assert.assertEquals(actual, actual);

	}
}
