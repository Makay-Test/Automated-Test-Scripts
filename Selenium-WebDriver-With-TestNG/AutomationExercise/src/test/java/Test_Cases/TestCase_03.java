package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_03 extends Functions{

	public static void main(String[] args) {

//	Test Case #03 - Login User with incorrect email and password
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'Login to your account' is visible
//		6. Enter incorrect email address and password
//		7. Click 'login' button
//		8. Verify error 'Your email or password is incorrect!' is visible

		// Initialize WebDriver
		WebDriverManager.chromedriver().setup();

		// Launch Browser
		Functions.openBrowser();

		// Login
		Functions.Login();
		
		//Close browser.
		driver.close();
	}

}
