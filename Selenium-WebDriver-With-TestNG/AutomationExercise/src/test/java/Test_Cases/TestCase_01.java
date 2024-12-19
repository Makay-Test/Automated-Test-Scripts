package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class TestCase_01 extends Functions {

//	Test Case #01 - Register User
//	Test Steps:
//		1. Launch browser
//		2. Navigate to url 'http://automationexercise.com'
//		3. Verify that home page is visible successfully
//		4. Click on 'Signup / Login' button
//		5. Verify 'New User Signup!' is visible
//		6. Enter name and email address
//		7. Click 'Signup' button
//		8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//		9. Fill details: Title, Name, Email, Password, Date of birth
//		10. Select checkbox 'Sign up for our newsletter!'
//		11. Select checkbox 'Receive special offers from our partners!'
//		12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//		13. Click 'Create Account button'
//		14. Verify that 'ACCOUNT CREATED!' is visible
//		15. Click 'Continue' button
//		16. Verify that 'Logged in as username' is visible
	
	
//#########################################################################################################################	
//####### Please take note that some of the validations are inside of the functions/methods.				###############
//#######																									###############
//#########################################################################################################################

//###############
//### START	#####
//###############
	
	@AfterTest
	public void deleteUser() {
	driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
	driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// Close browser.
	driver.close();
	}
	@Test
	public static void Register_User() {
		// Launch Browser
		Functions.openBrowser();
		
		// Register as new user
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		
		// VALIDATION POINT: Verifies 'New User Signup!' is visible
		validator.expectedElement("//button[@data-qa='signup-button']",true);
		
		// NOTE: Validation item 8 and 14 are inside the Function.userSignup method.
		Functions.userSignUp();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		// VALIDATION POINT: Verifies that home page is visible.
		validator.expectedElement("//div[@class='carousel-inner']",true);
	}
}
