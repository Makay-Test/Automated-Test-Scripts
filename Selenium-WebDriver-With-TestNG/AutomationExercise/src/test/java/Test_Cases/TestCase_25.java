package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_25 extends Functions{

	public static void main(String[] args) {

//	Test Case #
//		Test Steps:
		
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Scroll down page to bottom
//		5. Verify 'SUBSCRIPTION' is visible
//		6. Click on arrow at bottom right side to move upward
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Button Scroll up
		driver.findElement(By.xpath("//a[@id='scrollUp']")).click();
		
		
		// Close browser
		driver.close();
	}
}
