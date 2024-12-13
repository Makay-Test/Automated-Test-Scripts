package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_11 {

	public static void main(String[] args) {

//	Test Case #11 - Verify Subscription in Cart page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click 'Cart' button
//		5. Scroll down to footer
//		6. Verify text 'SUBSCRIPTION'
//		7. Enter email address in input and click arrow button
//		8. Verify success message 'You have been successfully subscribed!' is visible

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch Browser.
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Scroll down.
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		
		// Subscribe.
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();

		// Close browser.
		driver.close();
	}

}
