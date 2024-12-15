package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_04 extends Functions{

	public static void main(String[] args) {

//	Test Case #04 - Logout User
//		Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'Login to your account' is visible
//		6. Enter correct email address and password
//		7. Click 'login' button
//		8. Verify that 'Logged in as username' is visible
//		9. Click 'Logout' button
//		10. Verify that user is navigated to login page

		// Initialize WebDriver
		WebDriverManager.chromedriver().setup();

		// Launch Browser
		Functions.openBrowser();

		// Login
		Functions.Login();
		
		// Logout
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Close browser.
		driver.close();
	}

}
