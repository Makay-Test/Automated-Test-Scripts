package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_07 extends Functions{

	public static void main(String[] args) {

//	Test Case #07 - Verify Test Cases Page
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Test Cases' button
//		5. Verify user is navigated to test cases page successfully

		// Initialize WebDriver.
		WebDriverManager.chromedriver().setup();

		// Launch Browser.
		Functions.openBrowser();

		// Click on Test Cases button.
		driver.findElement(By.xpath("//a[@class='test_cases_list']")).click();
		
		// Close browser.
		driver.close();

	}

}
