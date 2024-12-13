package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_10 {

	public static void main(String[] args) {

//	Test Case #10 - Verify Subscription in home page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Scroll down to footer
//		5. Verify text 'SUBSCRIPTION'
//		6. Enter email address in input and click arrow button
//		7. Verify success message 'You have been successfully subscribed!' is visible

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch Browser.
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Scroll down.
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,10000)");
		
		// Subscribe.
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();

		// Close browser.
		driver.close();
	}

}
