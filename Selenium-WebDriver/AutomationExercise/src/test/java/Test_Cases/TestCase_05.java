package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_05 extends Functions{
	public static void main(String[] args) {

//	TestCase #05 - Register User with existing email
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'New User Signup!' is visible
//		6. Enter name and already registered email address
//		7. Click 'Signup' button
//		8. Verify error 'Email Address already exist!' is visible

		// Initialize WebDriver
		WebDriverManager.chromedriver().setup();

		// Launch Browser
		Functions.openBrowser();;

		// Login
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

		// Register as new user
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Testname");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		// Close browser.
		driver.close();
	}

}
