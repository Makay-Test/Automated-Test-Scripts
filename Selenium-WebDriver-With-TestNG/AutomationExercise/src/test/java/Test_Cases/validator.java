package Test_Cases;

import org.testng.Assert;
import org.openqa.selenium.By;

public class validator extends Functions {

	// Method for Validations
	public static void expectedElement(String elementToValidate, Boolean present) {
		// Checking if the element is present and store it in a variable to compare with expected result.
		Boolean actual,expected;
		
		if(present == true) {
			actual = driver.findElement(By.xpath(elementToValidate)).isDisplayed();
			expected = true;
			Assert.assertEquals(actual, expected);}
		else {
			try {
				actual = driver.findElement(By.xpath(elementToValidate)).isDisplayed();
				System.out.print("No error when searching the element but its expected to be not present. Value is: "+actual+"/n");
			}
			catch(Exception e) {
				return;
			}
		}
	}

	// Method for Validations
	public static void expectedValue(String elementToValidate, String expected) {

		// Checking of the value of the element is the same to the expected value.
		String actual = driver.findElement(By.xpath(elementToValidate)).getText();
		Assert.assertEquals(actual, expected);

	}
}
