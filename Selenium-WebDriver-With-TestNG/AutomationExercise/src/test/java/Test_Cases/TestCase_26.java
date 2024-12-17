package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_26 extends Functions {

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Scroll down page to bottom
//		5. Verify 'SUBSCRIPTION' is visible
//		6. Scroll up page to top
//		7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,7500)");

		// Subscribe.
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();

		// Scroll up.
		exec.executeScript("window.scrollBy(0,-7500)");

		// Close browser
		driver.close();
	}
}
