package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_21 extends Functions {

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:

//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Click on 'Products' button
//		4. Verify user is navigated to ALL PRODUCTS page successfully
//		5. Click on 'View Product' button
//		6. Verify 'Write Your Review' is visible
//		7. Enter name, email and review
//		8. Click 'Submit' button
//		9. Verify success message 'Thank you for your review.'
//		

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Click on Products button view an item.
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//a[@href='/product_details/4']")).click();

		// Add review.
		exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("Test@yopmail.com");
		driver.findElement(By.xpath("//textarea[@name='review']")).sendKeys("This is a Test review.");
		driver.findElement(By.xpath("//button[@id='button-review']")).click();

		// Close browser
		driver.close();
	}
}
