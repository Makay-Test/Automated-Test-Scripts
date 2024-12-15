package Test_Cases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_01 extends Functions{
	
	public static void main(String[] args) {

//	Test Case #01 - Register User
//		Test Steps:
//			1. Launch browser
//			2. Navigate to url 'http://automationexercise.com'
//			3. Verify that home page is visible successfully
//			4. Click on 'Signup / Login' button
//			5. Verify 'New User Signup!' is visible
//			6. Enter name and email address
//			7. Click 'Signup' button
//			8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//			9. Fill details: Title, Name, Email, Password, Date of birth
//			10. Select checkbox 'Sign up for our newsletter!'
//			11. Select checkbox 'Receive special offers from our partners!'
//			12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//			13. Click 'Create Account button'
//			14. Verify that 'ACCOUNT CREATED!' is visible
//			15. Click 'Continue' button
//			16. Verify that 'Logged in as username' is visible
		
		WebDriverManager.chromedriver().setup();
		
		// Launch Browser
		Functions.openBrowser();

		// Login
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

		// Register as new user
		Functions.userSignUp();

		// Close browser
		driver.close();

	}

}
