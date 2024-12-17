package Test_Cases;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Test_01_Login extends Functions {

	@Test(priority = 1)
	public static void validateLogin() {

		// Launch browser.
		Functions.browserLaunch();

		// Login page.
		Functions.Login();

		// Validating if user is able to proceed on next page.
		Boolean actual = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isEnabled();
		Boolean expected = true;
		Assert.assertEquals(actual, expected);
		driver.close();
	}
}
