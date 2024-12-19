package Test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions {

	// Initialize Webdriver
	static ChromeDriver driver = new ChromeDriver();

	// ======================================= Launch Browser. ============================================================
	static void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// VALIDATION POINT:
		//			Verifies that home page is visible.
		validator.expectedElement("//div[@class='carousel-inner']");
	}

	// ========================================== Login ===================================================================
	static void Login(Boolean negativeTest) {
		String testEmailArray [] = {"Testacc123@yopmail.com","Testaccincorrect@yopmail.com"};
		String testPassArray [] = {"Testpass","passincorrect"};
		String testEmail;
		String testPass;
		if (negativeTest == false) {
			testEmail = testEmailArray [0];
			testPass = testPassArray [0];
		}
		else {
			testEmail = testEmailArray [1];
			testPass = testPassArray [1];}
		
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		
		//VALIDATION POINT: 
		//			Verifies that 'Login to your account' is visible.
		validator.expectedElement("//h2[text()='Login to your account']");
		
		driver.findElement(By.xpath("//form[@action='/login']//child::input[2]")).sendKeys(testEmail);
		driver.findElement(By.xpath("//form[@action='/login']//child::input[3]")).sendKeys(testPass);
		driver.findElement(By.xpath("//form[@action='/login']//child::button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	// =================================== User Sign up functionality =====================================================
	public static void userSignUp() {
		
		// Data
		String testName[] = {"Testname"};
		String testEmail [] = {"Testacc127@yopmail.com","Testacc123@yopmail.com"};
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(testName[0]);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(testEmail[1]);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		// NOTE: I placed a checker if the account is existing or not.
		List<WebElement> existingAccChecker = driver.findElements(By.xpath("//p[text()='Email Address already exist!']"));
		
		if (existingAccChecker.size()>0) {
			
			// VALIDATION POINT:
			//			Verifies error 'Email Address already exist!' is visible.
			validator.expectedElement("//p[text()='Email Address already exist!']");
			return;
		}
		else {
			// VALIDATION POINT: 
			//			Verifies that 'ENTER ACCOUNT INFORMATION' is visible
			validator.expectedElement("//b[text()='Enter Account Information']");

			//NOTE: Here, I have stored the values of the inputs fields with its corresponding xpaths.
			String ClickXpathHolder[] = {
					"//input[@id='id_gender1']",
					"//option[text()='28']",
					"//option[text()='November']",
					"//option[text()='1950']",
					"//input[@id='newsletter']",
					"//input[@id='optin']",
					"//option[@value='Canada']" };
			String TypeXpathHolder[] = {
					"//input[@id='password']",
					"//input[@id='first_name']",
					"//input[@id='last_name']",
					"//input[@id='company']",
					"//input[@id='address1']",
					"//input[@id='state']",
					"//input[@id='city']",
					"//input[@id='zipcode']",
					"//input[@id='mobile_number']", };
			String TypeValueHolder[] = {
					"Testpass",
					"TestName",
					"LastTest",
					"TestCompany",
					"Blk 01 Lot 02 Test 03 Dr",
					"Alberta",
					"Red Deer",
					"112233",
					"2104104433" };

			//NOTE: I will loop the created array here.
			for (int a = 0; a < 7; a++) {
				driver.findElement(By.xpath(ClickXpathHolder[a])).click();
			}
			for (int b = 0; b < 9; b++) {
				driver.findElement(By.xpath(TypeXpathHolder[b])).sendKeys(TypeValueHolder[b]);
			}
			driver.findElement(By.xpath("//button[text()='Create Account']")).click();
			// VALIDATION POINT: 
			//			Verifies that 'ACCOUNT CREATED!' is visible
			validator.expectedElement("//b[text()='Account Created!']");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		}
		
	}

	// ========================================  Checkout ==============================================================
	public static void checkOut() {
		//NOTE: The same here, I have stored the values of the inputs fields with its corresponding xpaths.
		String checkOutValues[] = {
				"Test Card",
				"1122334455",
				"111",
				"12",
				"2030"
		};
		String checkOutXpath[] = {
				"//input[@name='name_on_card']",
				"//input[@name='card_number']",
				"//input[@name='cvc']",
				"//input[@name='expiry_month']",
				"//input[@name='expiry_year']"
		};
		driver.findElement(By.xpath("//div[@class='col-sm-6']//child::a")).click();
		driver.findElement(By.xpath("//textarea")).sendKeys("This is a test.");
		driver.findElement(By.xpath("//a[@href='/payment']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Card details
		for (int i = 0; i < 5 ; i++ ) {
			driver.findElement(By.xpath(checkOutXpath[i])).sendKeys(checkOutValues[i]);
		}
	
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}
}
