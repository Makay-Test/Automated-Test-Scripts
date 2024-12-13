package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_04 {

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
		ChromeDriver driver = new ChromeDriver();

		// Launch Browser
		driver.get("https://www.automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Login
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//form[@action='/login']//child::input[2]")).sendKeys("Test22333@yopmail.com");
		driver.findElement(By.xpath("//form[@action='/login']//child::input[3]")).sendKeys("Testpass");
		driver.findElement(By.xpath("//form[@action='/login']//child::button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Logout
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Close browser.
		driver.close();
	}

}
